/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:50:41 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:50:41 
 */
package com.rsia.madura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.sql.Timestamp;

import com.rsia.madura.entity.m_Provinsi;
import com.rsia.madura.service.ProvinsiService;


@Controller
@RequestMapping("/Provinsi")
public class ProvinsiController {
	
	@Autowired
	private ProvinsiService provinsiService;
	
	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String ProvinsiFormView(Model model, @RequestParam(value="page", required=false) int page, 
			@RequestParam(value="limit", required=false) int limit){
		List<m_Provinsi> result = provinsiService.getProvinsis(page, limit);
		String link = provinsiService.createLinks(page, limit);
		m_Provinsi provinsiModel = new m_Provinsi();
		
		model.addAttribute("provinsi", result);
		model.addAttribute("link", link);
		model.addAttribute("provinsiModel", provinsiModel);
		
		return "WilayahProvinsiAddForm";
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String provinsiStore(@ModelAttribute("provinsiModel") m_Provinsi provinsiModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		provinsiModel.setPropinsiAktif("Y");
		provinsiModel.setPropinsiCreatedBy("Rizki");
		provinsiModel.setPropinsiCreatedDate(currentTime);
		
		provinsiService.store(provinsiModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/provinsi/tambah/?page=1&limit=10";
	}
	
	@RequestMapping(value="/form-update", method=RequestMethod.GET)
	public String ProvinsiUpdateFormView(Model model, @RequestParam(value="provinsiId", required=false) int provinsiId){
		m_Provinsi result = provinsiService.getProvinsi(provinsiId);
		
		model.addAttribute("provinsiModel", result);
		
		return "WilayahProvinsiUpdateForm";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String provinsiUpdate(@ModelAttribute("provinsiModel") m_Provinsi provinsiModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		provinsiModel.setPropinsiUpdatedBy("Rizki");
		provinsiModel.setPropinsiUpdatedDate(currentTime);
		
		provinsiService.update(provinsiModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/provinsi/tambah/?page=1&limit=10";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String provinsiUpdate(Model model, @RequestParam(value="provinsiId", required=false) int propinsiId) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		m_Provinsi provinsiModel = provinsiService.getProvinsi(propinsiId);
		
		provinsiModel.setPropinsiAktif("T");
		provinsiModel.setPropinsideletedDate(currentTime);
		
		provinsiService.delete(provinsiModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/provinsi/tambah/?page=1&limit=10";
	}

}
