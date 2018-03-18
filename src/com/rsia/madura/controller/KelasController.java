package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rsia.madura.entity.m_Agama;
import com.rsia.madura.entity.m_Kelas;
import com.rsia.madura.service.KelasService;

@Controller
@RequestMapping("/Kelas")
public class KelasController {
	@Autowired
	private KelasService KelasService;
	
	private String uri ="redirect:http://localhost:8080/com.rsia.modura/Kelas/tambah/?page=1&limit=10" ;
	
	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String FormView(Model model, 
			@RequestParam(value="page", required=false) int page, 
			@RequestParam(value="limit", required=false) int limit){
		
		List<m_Kelas> result = KelasService.getKelases(page, limit);
		String link = KelasService.createLinks(page, limit);
		m_Kelas kelasModel = new m_Kelas();
		
			model.addAttribute("kelas", result);
		model.addAttribute("link", link);
		model.addAttribute("kelasModel", kelasModel);
		
		return "KelasAddForm";
	}

	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String Store(@ModelAttribute("kelasModel") m_Kelas kelasModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		kelasModel.setKelas_aktif("Y");
		kelasModel.setKelas_created_by("Admin");	
		kelasModel.setKelas_created_date(currentTime);
		
		KelasService.store(kelasModel);
		
		return this.uri;
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String DeleteUpdate(Model model, @RequestParam(value="Id", required=false) int id) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		m_Kelas agamaModel = KelasService.getKelas(id);
		
		agamaModel.setKelas_aktif("T");
		agamaModel.setKelas_deleted_date(currentTime);
		
		KelasService.delete(agamaModel);
		
		return this.uri;
	}
	
	@RequestMapping(value="/form-update", method=RequestMethod.GET)
	public String UpdateFormView(Model model, @RequestParam(value="Id", required=false) int id){
		
		m_Kelas result = KelasService.getKelas(id);
		
		model.addAttribute("kelasModel", result);
		
		return "KelasUpdateForm";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String Update(@ModelAttribute("agamaModel") m_Kelas agamaModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		agamaModel.setKelas_aktif("Y");
		agamaModel.setKelas_created_by("Admin");	
		agamaModel.setKelas_updated_date(currentTime);
		
		KelasService.update(agamaModel);
		
		return this.uri;
	}
}
