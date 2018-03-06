package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import com.rsia.madura.entity.m_Kelas;
import com.rsia.madura.service.KelasService;

@Controller
@RequestMapping("/Kelas")
public class KelasController {
	@Autowired
	private KelasService KelasService;
	@RequestMapping("/list")
	public String viewFormKelas(Model model) {
		List<m_Kelas> result = KelasService.getKelas();
		
		model.addAttribute("kelas", result);
		
		return "v_m_kelas_list";
	}
	@RequestMapping("/tambah")
	public String tambahFormKelas(Model model) {
		List<m_Kelas> result = KelasService.getKelas();
		
		model.addAttribute("kelas", result);
		
		return "v_m_kelas_tambah";
	}
	@RequestMapping(value="/simpan", method=RequestMethod.POST)
	public String kelasSimpan(@ModelAttribute("kelasModel") m_Kelas kelasModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		kelasModel.setKelas_aktif('Y');
		kelasModel.setKelas_created_by("Admin");
		kelasModel.setKelas_created_date(currentTime); 
		
		KelasService.simpan(kelasModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/Kelas/list";
	}
}
