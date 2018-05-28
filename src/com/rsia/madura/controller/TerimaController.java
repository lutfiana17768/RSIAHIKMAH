package com.rsia.madura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rsia.madura.entity.MTerima;
import com.rsia.madura.service.TerimaService;
@Controller
@RequestMapping("/terima")
public class TerimaController {
	
	@Autowired
	private TerimaService TerimaService;

	private String uri = "redirect: /terima";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model) {
	return "terima/index";
	}
	
	@RequestMapping(value="form-add")
	public String formAdd(Model model) {
		MTerima terimaModel = new MTerima();
		
		model.addAttribute("terimaModel", terimaModel);
		
		return "terima/tambah";
	}
	
}
