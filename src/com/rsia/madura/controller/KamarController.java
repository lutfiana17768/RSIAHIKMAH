package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import com.rsia.madura.entity.m_Kamar;
import com.rsia.madura.service.KamarService;

@Controller
@RequestMapping("/Kamar")
public class KamarController {
	@Autowired
	private KamarService KamarService;
	@RequestMapping("/list")
	public String viewFormKamar(Model model) {
		List<m_Kamar> result = KamarService.getKamar();
		
		model.addAttribute("kamar", result);
		
		return "v_m_kamar_list";
	}
	@RequestMapping("/tambah")
	public String tambahFormKamar(Model model) {
		List<m_Kamar> result = KamarService.getKamar();
		
		model.addAttribute("kamar", result);
		
		return "v_m_kamar_tambah";
	} 

	@RequestMapping(value="/simpan", method=RequestMethod.POST)
	public String kamarSimpan(@ModelAttribute("kamarModel") m_Kamar kamarModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		kamarModel.setkamar_aktif('Y');
		kamarModel.setKamar_created_by("Admin");
		kamarModel.setKamar_created_date(currentTime); 
		
		KamarService.simpan(kamarModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/Kamar/list";
	}
	
}
