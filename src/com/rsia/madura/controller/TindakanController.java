package com.rsia.madura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rsia.madura.entity.m_Tindakan;
import com.rsia.madura.service.TindakanService;
@Controller
@RequestMapping("/Tindakan")
public class TindakanController {
	@Autowired
	private TindakanService TindakanService;
	@RequestMapping("/tambah")
	public String viewFormTindakan(Model model) {
		List<m_Tindakan> result = TindakanService.getTindakan();
		
		model.addAttribute("tindakan", result);
		
		return "v_m_tindakan";
	}

}
