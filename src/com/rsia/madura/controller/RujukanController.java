package com.rsia.madura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rsia.madura.entity.m_Rujukan;
import com.rsia.madura.service.RujukanService;

@Controller
@RequestMapping("/Rujukan")
public class RujukanController {
	@Autowired
	private RujukanService RujukanService;
	
	@RequestMapping("/tambah")
	public String viewFormRujukan(Model model) {
		List<m_Rujukan> result = RujukanService.getRujukan();
		
		model.addAttribute("rujukan", result);
		
		return "v_rujukan";
	}
}
