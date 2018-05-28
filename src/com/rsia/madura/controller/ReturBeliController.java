package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rsia.madura.entity.MBarang;
import com.rsia.madura.entity.MReturBeli;
import com.rsia.madura.entity.m_Satuan;
import com.rsia.madura.service.BarangService;
import com.rsia.madura.service.ReturBeliService;
import com.rsia.madura.service.SatuanService;

@Controller
@RequestMapping("/retur-beli")
public class ReturBeliController {
	@Autowired
	private ReturBeliService returBeliService;
	@Autowired
	private BarangService barangService;
	@Autowired
	private SatuanService satuanService;
	
	@RequestMapping(value="/list")
	public String returBeliList(Model model) {
		List<MReturBeli> result = returBeliService.getReturBelis();
		
		model.addAttribute("result", result);
		
		return "/retur-beli/index";
	}
	
	@RequestMapping(value="/form-add")
	public String ReturBeliFormAddView(Model model){
		MReturBeli returBeliModel = new MReturBeli();
		List<MBarang> resultBarang = barangService.getBarangs();
		List<m_Satuan> resultSatuan = satuanService.getSatuans();
		
		
		model.addAttribute("returBeliModel", returBeliModel);
		model.addAttribute("satuan", resultSatuan);
		model.addAttribute("barang", resultBarang);
		
		return "/retur-beli/tambah";
	}
	
	@RequestMapping(value="/store")
	public String ReturBeliStore(@ModelAttribute("returBeliModel") MReturBeli returBeliModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		returBeliModel.setReturBeliAktif('Y');
		returBeliModel.setReturBeliCreatedBy("Admin");
		returBeliModel.setReturBeliCreatedDate(currentTime);
	
		
		returBeliService.store(returBeliModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/returBeli/list";
	}
	
	
}
