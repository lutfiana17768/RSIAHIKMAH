package com.rsia.madura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rsia.madura.entity.m_Ruang;
import com.rsia.madura.service.RuanganService;

@Controller
@RequestMapping("/Ruang")
public class RuanganController {
	@Autowired
private RuanganService RuanganService;
	
	@RequestMapping("/list")
	public String viewFormRuangan(Model model) {
		List<m_Ruang> result = RuanganService.getRuang();
		
		model.addAttribute("ruangan", result);
		
		return "v_ruangan_list";
	}
	@RequestMapping("/tambah")
	public String tambahFormRuangan(Model model) {
		List<m_Ruang> result = RuanganService.getRuang();
		
		model.addAttribute("ruangan", result);
		
		return "v_ruangan_tambah";
	} 

}
