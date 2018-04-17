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

import com.rsia.madura.entity.m_Kondisi;
import com.rsia.madura.service.KondisiPasienService;

import com.rsia.madura.entity.m_Provinsi;
import com.rsia.madura.service.ProvinsiService;

@Controller
@RequestMapping("/Kondisi")
public class KondisiController {
	private String uri ="redirect:http://localhost:8080/com.rsia.modura/Kondisi/tambah/?page=1&limit=10" ;
	
	@Autowired
	private KondisiPasienService kondisiService;
	
	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String KondisiFormView(Model model, 
			@RequestParam(value="page", required=false) int page, 
			@RequestParam(value="limit", required=false) int limit){
		
		List<m_Kondisi> result = kondisiService.getKondisis(page, limit);
		String link = kondisiService.createLinks(page, limit);
		m_Kondisi kondisiModel = new m_Kondisi();
		
		model.addAttribute("kondisi", result);
		model.addAttribute("link", link);
		model.addAttribute("kondisiModel", kondisiModel);
		
		return "KondisiAddForm";
	}

	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String Store(@ModelAttribute("kondisiModel") m_Kondisi kondisiModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		kondisiModel.setKondisi_aktif("Y");
		kondisiModel.setKondisi_created_by("Admin");	
		kondisiModel.setKondisi_created_date(currentTime);
		
		kondisiService.store(kondisiModel);
		
		return this.uri;
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String DeleteUpdate(Model model, @RequestParam(value="kondisiId", required=false) int id) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		m_Kondisi kondisiModel = kondisiService.getKondisi(id);
		
		kondisiModel.setKondisi_aktif("T");
		kondisiModel.setKondisi_deleted_date(currentTime);
		
		kondisiService.delete(kondisiModel);
		
		return this.uri;
	}
	
	@RequestMapping(value="/form-update", method=RequestMethod.GET)
	public String UpdateFormView(Model model, @RequestParam(value="kondisiId", required=false) int id){
		
		m_Kondisi result = kondisiService.getKondisi(id);
		
		model.addAttribute("kondisiModel", result);
		
		return "KondisiUpdateForm";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String Update(@ModelAttribute("kondisiModel") m_Kondisi kondisiModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		kondisiModel.setKondisi_aktif("Y");
		kondisiModel.setKondisi_created_by("Admin");
		kondisiModel.setKondisi_updated_date(currentTime);;
		
		kondisiService.update(kondisiModel);
		
		return this.uri;
	}
	
	
}
