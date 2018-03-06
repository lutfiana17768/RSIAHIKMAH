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

import com.rsia.madura.entity.m_Kelurahan;
import com.rsia.madura.service.KelurahanService;
import com.rsia.madura.entity.m_Kecamatan;
import com.rsia.madura.service.KecamatanService;


@Controller
@RequestMapping("/kelurahan")
public class KelurahanController {
	
	@Autowired
	private KelurahanService kelurahanService;
	@Autowired
	private KecamatanService kecamatanService;
	
	
	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String KelurahanFormView(Model model, @RequestParam(value="page", required=false) int page, 
			@RequestParam(value="limit", required=false) int limit){
		List<m_Kelurahan> resultKelurahan = kelurahanService.getKelurahans(page, limit);
		List<m_Kecamatan> resultKecamatan = kecamatanService.getKecamatans();
		String link = kelurahanService.createLinks(page, limit);
		m_Kelurahan kelurahanModel = new m_Kelurahan();
		
		model.addAttribute("kelurahan", resultKelurahan);
		model.addAttribute("kecamatan", resultKecamatan);
		model.addAttribute("link", link);
		model.addAttribute("kelurahanModel", kelurahanModel);
		return "WilayahKelurahanAddForm";
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String kelurahanStore(@ModelAttribute("kelurahanModel") m_Kelurahan kelurahanModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		kelurahanModel.setKelurahanAktif("Y");
		kelurahanModel.setKelurahanCreatedBy("Rizki");
		kelurahanModel.setKelurahanCreatedDate(currentTime);
		
		kelurahanService.store(kelurahanModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/kelurahan/tambah/?page=1&limit=10";
	}
	
	@RequestMapping(value="/form-update", method=RequestMethod.GET)
	public String kelurahanUpdateFormView(Model model, @RequestParam(value="kelurahanId", required=false) int kelurahanId){
		m_Kelurahan result = kelurahanService.getKelurahan(kelurahanId);
		List<m_Kecamatan> resultKecamatan = kecamatanService.getKecamatans();
		
		model.addAttribute("kelurahanModel", result);
		model.addAttribute("kecamatan", resultKecamatan);
		
		return "WilayahKelurahanUpdateForm";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String kelurahanUpdate(@ModelAttribute("kelurahanModel") m_Kelurahan kelurahanModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		kelurahanModel.setKelurahanUpdatedBy("Rizki");
		kelurahanModel.setKelurahanUpdatedDate(currentTime);
		
		kelurahanService.update(kelurahanModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/kelurahan/tambah/?page=1&limit=10";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String kelurahanDelete(Model model, @RequestParam(value="kelurahanId", required=false) int kelurahanId) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		m_Kelurahan kelurahanModel = kelurahanService.getKelurahan(kelurahanId);
		kelurahanModel.setKelurahanAktif("T");
		kelurahanModel.setKelurahanDeletedDate(currentTime);
		
		kelurahanService.delete(kelurahanModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/kelurahan/tambah/?page=1&limit=10";
	}
}
