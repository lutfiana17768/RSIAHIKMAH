package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.rsia.madura.entity.m_Agama; 
import com.rsia.madura.service.AgamaService;

@Controller
@RequestMapping("/Agama")
public class AgamaController {
	@Autowired
	private AgamaService agamaService;
	
	@RequestMapping("/list")
	public String viewFormAgama(Model model) {
		List<m_Agama> result = agamaService.getAgama();
		
		model.addAttribute("agama", result);
		
		return "v_m_agama_list";
	} 
	
	@RequestMapping("/tambah")
	public String tambahFormAgama(Model model) {
		List<m_Agama> result = agamaService.getAgama();
		
		model.addAttribute("agama", result);
		
		return "v_m_agama_tambah";
	} 
	@RequestMapping(value="/simpan", method=RequestMethod.POST)
	public String agamaSimpan(@ModelAttribute("agamaModel") m_Agama agamaModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		agamaModel.setAgamaAktif('Y');
		agamaModel.setAgamaCreatedBy("Admin");
		agamaModel.setAgamacreatedDate(currentTime); 
		
		agamaService.simpan(agamaModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/Agama/list";
	}
	
}
