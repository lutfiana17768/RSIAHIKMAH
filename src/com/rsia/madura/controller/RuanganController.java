package com.rsia.madura.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rsia.madura.entity.m_Ruang;
import com.rsia.madura.service.RuanganService;

@Controller
@RequestMapping("/Ruang")
public class RuanganController {
	@Autowired
	private RuanganService ruangService;
	
	private String uri ="redirect:http://localhost:8080/com.rsia.modura/Ruang/tambah/" ;
	
	@RequestMapping("/tambah")
	public String addForm(Model model) {
		m_Ruang ruangModel = new m_Ruang();

		model.addAttribute("ruangModel", ruangModel);

		return "RuangAddForm";
	}

	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String Store(@ModelAttribute("ruangModel") m_Ruang ruangModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		ruangModel.setRuang_aktif("Y");
		ruangModel.setRuang_created_by("Admin");	
		ruangModel.setRuang_created_date(currentTime);
		
		ruangService.store(ruangModel);
		
		return this.uri;
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String DeleteUpdate(Model model, @RequestParam(value="Id", required=false) int id) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		m_Ruang ruangModel = ruangService.getRuang(id);
		
		ruangModel.setRuang_aktif("T");
		ruangModel.setRuang_deleted_date(currentTime);
		
		ruangService.delete(ruangModel);
		
		return this.uri;
	}
	
	@RequestMapping(value="/form-update", method=RequestMethod.GET)
	public String UpdateFormView(Model model, @RequestParam(value="Id", required=false) int id){
		
		m_Ruang result = ruangService.getRuang(id);
		
		model.addAttribute("ruangModel", result);
		
		return "RuangUpdateForm";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String Update(@ModelAttribute("ruangModel") m_Ruang ruangModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		ruangModel.setRuang_aktif("Y");
		ruangModel.setRuang_updated_by("Admin");
		ruangModel.setRuang_updated_date(currentTime);;
		
		ruangService.update(ruangModel);
		
		return this.uri;
	}

}
