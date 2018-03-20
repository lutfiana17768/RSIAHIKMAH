package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rsia.madura.entity.m_Pasien;
import com.rsia.madura.entity.m_Provinsi;
import com.rsia.madura.entity.m_Kota;
import com.rsia.madura.entity.m_Kecamatan;
import com.rsia.madura.entity.m_Kelurahan;
import com.rsia.madura.entity.m_Agama;

import com.rsia.madura.service.PasienService;
import com.rsia.madura.service.ProvinsiService;
import com.rsia.madura.service.KotaService;
import com.rsia.madura.service.KecamatanService;
import com.rsia.madura.service.KelurahanService;
import com.rsia.madura.service.AgamaService;

@Controller
@RequestMapping("/Pasien")
public class PasienController {
	@Autowired
	private PasienService PasienService;
	@Autowired
	private ProvinsiService ProvinsiService;
	@Autowired
	private KotaService KotaService;
	@Autowired
	private KecamatanService KecamatanService;
	@Autowired
	private KelurahanService KelurahanService;
	@Autowired
	private AgamaService AgamaService;
	
	private String uri = "redirect:http://localhost:8080/com.rsia.modura/Pasien/list" ;
	
	@RequestMapping("/list")
	public String viewFormPasien(Model model) {
		List<m_Pasien> result = PasienService.getPasien();

		model.addAttribute("Pasien", result);

		return "v_m_pasien_list";
	}

	@RequestMapping(value = "/tambah", method = RequestMethod.GET)
	public String AddForm(Model model) {

		m_Pasien pasienModel = new m_Pasien();
		List<m_Pasien> pasien = PasienService.getPasiens();
		List<m_Provinsi> provinsi = ProvinsiService.getProvinsis();
		List<m_Kota> kota = KotaService.getKotas();
		List<m_Kecamatan> kecamatan = KecamatanService.getKecamatans();
		List<m_Kelurahan> kelurahan = KelurahanService.getKelurahans();
		
		Map<String,String> jeniskelamin =  new HashMap<String,String>(); 
		jeniskelamin.put("L","Laki-Laki");
		jeniskelamin.put("P","Perempuan");

		Map<String,String> goldar =  new HashMap<String,String>(); 
		jeniskelamin.put("A","A");
		jeniskelamin.put("AB","AB");
		
		model.addAttribute("Pasien", pasien);
		model.addAttribute("provinsi", provinsi);
		model.addAttribute("Kota", kota);
		model.addAttribute("Kecamatan", kecamatan);
		model.addAttribute("Kelurahan", kelurahan);
		model.addAttribute("Jeniskelamin", jeniskelamin);
		model.addAttribute("Goldar", goldar);

		model.addAttribute("pasienModel", pasienModel);
		return "v_m_pasien_tambah";
	}


	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String Store(@ModelAttribute("pasienModel") m_Pasien pasienModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		pasienModel.setPasien_aktif("Y");
		pasienModel.setPasien_created_by("Admin");	
		pasienModel.setPasien_created_date(currentTime);
		
		PasienService.store(pasienModel);
		
		return this.uri;
	}

}
