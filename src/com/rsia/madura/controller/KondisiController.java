package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

 
import com.rsia.madura.entity.m_Kondisi;
import com.rsia.madura.service.KamarService;
import com.rsia.madura.service.KondisiPasienService;

@Controller
@RequestMapping("/Kondisi")
public class KondisiController {
	@Autowired
	private KondisiPasienService KondisiPasienService;
	
	@RequestMapping("/list")
	public String viewFormKondisi(Model model) {
		List<m_Kondisi> result = KondisiPasienService.getKondisi();
		
		model.addAttribute("KondisiPasien", result);
		
		return "v_m_kondisipasien_list";
	} 
	@RequestMapping("/tambah")
	public String tambahFormKondisi(Model model) {
		List<m_Kondisi> result = KondisiPasienService.getKondisi();
		
		model.addAttribute("KondisiPasien", result);
		
		return "v_m_kondisipasien_tambah";
	} 
	@RequestMapping(value="/simpan", method=RequestMethod.POST)
	public String kondisiSimpan(@ModelAttribute("kondisiModel") m_Kondisi kondisiModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		kondisiModel.setKondisi_aktif('Y');
		kondisiModel.setKondisi_created_by("Admin");
		kondisiModel.setKondisi_created_date(currentTime); 
		
		KamarService.simpan(kondisiModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/Kondisi/list";
	}
}
