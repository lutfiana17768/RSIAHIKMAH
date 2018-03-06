package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rsia.madura.entity.m_Kecamatan;
import com.rsia.madura.entity.m_Kota;
import com.rsia.madura.service.KecamatanService;
import com.rsia.madura.service.KotaService;

@Controller
@RequestMapping("/kecamatan")
public class KecamatanController {
	@Autowired
	private KecamatanService kecamatanService;
	@Autowired
	private KotaService kotaService;
	
	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String KecamatanFormView(Model model, @RequestParam(value="page", required=false) int page, 
			@RequestParam(value="limit", required=false) int limit){
		List<m_Kecamatan> resultKecamatan = kecamatanService.getKecamatans(page, limit);
		List<m_Kota> resultKota = kotaService.getKotas();
		String link = kecamatanService.createLinks(page, limit);
		m_Kecamatan kecamatanModel = new m_Kecamatan();
		
		model.addAttribute("kecamatan", resultKecamatan);
		model.addAttribute("kota", resultKota);
		model.addAttribute("link", link);
		model.addAttribute("kecamatanModel", kecamatanModel);
		
		return "WilayahKecamatanAddForm";
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String kecamatanStore(@ModelAttribute("kecamatanModel") m_Kecamatan kecamatanModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		kecamatanModel.setKecamatanAktif("Y");
		kecamatanModel.setKecamatanCreatedBy("Rizki");
		kecamatanModel.setKecamatanCreatedDate(currentTime);
		
		kecamatanService.store(kecamatanModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/kecamatan/tambah/?page=1&limit=10";
	}
	
	@RequestMapping(value="/form-update", method=RequestMethod.GET)
	public String kecamatanUpdateFormView(Model model, @RequestParam(value="kecamatanId", required=false) int kecamatanId){
		m_Kecamatan result = kecamatanService.getKecamatan(kecamatanId);
		List<m_Kota> resultKota = kotaService.getKotas();
		
		model.addAttribute("kecamatanModel", result);
		model.addAttribute("kota", resultKota);
		
		return "WilayahKecamatanUpdateForm";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String kecamatanUpdate(@ModelAttribute("kecamatanModel") m_Kecamatan kecamatanModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		kecamatanModel.setKecamatanUpdatedBy("Rizki");
		kecamatanModel.setKecamatanUpdatedDate(currentTime);
		
		kecamatanService.update(kecamatanModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/kecamatan/tambah/?page=1&limit=10";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String kecamatanDelete(Model model, @RequestParam(value="kecamatanId", required=false) int kecamatanId) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		m_Kecamatan kecamatanModel = kecamatanService.getKecamatan(kecamatanId);
		kecamatanModel.setKecamatanAktif("T");
		kecamatanModel.setKecamatanDeletedDate(currentTime);
		
		kecamatanService.delete(kecamatanModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/kecamatan/tambah/?page=1&limit=10";
	}
}
