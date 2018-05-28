package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rsia.madura.entity.MBarang;
import com.rsia.madura.entity.MReturJual;
import com.rsia.madura.entity.m_Satuan;
import com.rsia.madura.service.BarangService;
import com.rsia.madura.service.ReturJualService;
import com.rsia.madura.service.SatuanService;

@Controller
@RequestMapping("/retur-beli")
public class ReturJualController {
	@Autowired
	private ReturJualService returJualService;
	@Autowired
	private BarangService barangService;
	@Autowired
	private SatuanService satuanService;
	
	@RequestMapping(value="/list")
	public String returJualList(Model model) {
		List<MReturJual> result = returJualService.getReturJuals();
		
		model.addAttribute("result", result);
		
		return "/retur-beli/index";
	}
	
	@RequestMapping(value="/form-add")
	public String ReturJualFormAddView(Model model){
		MReturJual returJualModel = new MReturJual();
		List<MBarang> resultBarang = barangService.getBarangs();
		List<m_Satuan> resultSatuan = satuanService.getSatuans();
		
		
		model.addAttribute("returJualModel", returJualModel);
		model.addAttribute("satuan", resultSatuan);
		model.addAttribute("barang", resultBarang);
		
		return "/retur-beli/tambah";
	}
	
	@RequestMapping(value="/store")
	public String ReturJualStore(@ModelAttribute("returJualModel") MReturJual returJualModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		returJualModel.setReturJualAktif('Y');
		returJualModel.setReturJualCreatedBy("Admin");
		returJualModel.setReturJualCreatedDate(currentTime);
	
		
		returJualService.store(returJualModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/returJual/list";
	}
	
	
}
