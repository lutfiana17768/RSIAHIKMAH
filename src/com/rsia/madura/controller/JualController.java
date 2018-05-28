package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rsia.madura.entity.MBarang;
import com.rsia.madura.entity.MJual;
import com.rsia.madura.entity.m_Satuan;
import com.rsia.madura.service.BarangService;
import com.rsia.madura.service.JualService;
import com.rsia.madura.service.SatuanService;

@Controller
@RequestMapping("/jual")
public class JualController {
	@Autowired
	private JualService jualService;
	@Autowired
	private BarangService barangService;
	@Autowired
	private SatuanService satuanService;
	
	@RequestMapping(value="/list")
	public String JualListView(Model model){
		List<MJual> result = jualService.getJuals();
		
		model.addAttribute("jual", result);
		
		return "/jual/index";
	}
	
	@RequestMapping(value="/form-add")
	public String JualFormAdd(Model model) {
		MJual jualModel = new MJual();
		List<MBarang> resultBarang = barangService.getBarangs();
		List<m_Satuan> resultSatuan = satuanService.getSatuans();
		
		model.addAttribute("satuan", resultSatuan);
		model.addAttribute("barang", resultBarang);
		model.addAttribute("jualModel", jualModel);
		
		return "/jual/tambah";
	}
	
	@RequestMapping(value="/store")
	public String JualStore(@ModelAttribute("jualModel") MJual jualModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		jualModel.setJualDiskon(0);
		jualModel.setJualAktif('Y');
		jualModel.setJualCreatedBy("Admin");
		jualModel.setJuealCreatedDate(currentTime);
	
		
		jualService.store(jualModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/jual/list";
	}

}
