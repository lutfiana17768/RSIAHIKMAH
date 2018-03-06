package com.rsia.madura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rsia.madura.entity.m_PaketObat;
import com.rsia.madura.service.PaketObatService;

@Controller
@RequestMapping("/PaketObat")
public class PaketObatController {
	@Autowired
	private PaketObatService PaketObatService;
	@RequestMapping("/tambah")
	public String viewFormPaketObat(Model model) {
		List<m_PaketObat> result = PaketObatService.getPaketObat();
		
		model.addAttribute("PaketObat", result);
		
		return "v_paket";
	}
}
