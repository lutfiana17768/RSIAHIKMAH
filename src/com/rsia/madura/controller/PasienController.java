package com.rsia.madura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rsia.madura.entity.m_Pasien;
import com.rsia.madura.service.PasienService;

@Controller
@RequestMapping("/Pasien")
public class PasienController {
	@Autowired
	private PasienService PasienService;
	
	@RequestMapping("/list")
	public String viewFormPasien(Model model) {
		List<m_Pasien> result = PasienService.getPasien();
		
		model.addAttribute("Pasien", result);
		
		return "v_m_pasien_list";
	}
	@RequestMapping("/tambah")
	public String tambahFormPasien(Model model) {
		List<m_Pasien> result = PasienService.getPasien();
		
		model.addAttribute("Pasien", result);
		
		return "v_m_pasien_tambah";
	}

}
