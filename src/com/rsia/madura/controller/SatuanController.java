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
import org.springframework.web.bind.annotation.PathVariable;

import com.rsia.madura.entity.MSatuan;
import com.rsia.madura.service.SatuanService;

@Controller
@RequestMapping("/satuan")
public class SatuanController {
	@Autowired
	private SatuanService satuanService;
	
	public String Index(){
		return "redirect: /satuan/tambah";
	}

	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String SatuanFormView(Model model, @RequestParam(value="page", required=false, defaultValue="1") int page, 
			@RequestParam(value="limit", required=false, defaultValue="10") int limit){
		MSatuan satuanModel = new MSatuan();
		List<MSatuan> resultSatuan = satuanService.getSatuans();
		//String link = satuanService.createLinks(page, limit);
		
		model.addAttribute("satuan", resultSatuan);
		//model.addAttribute("link", link);
		model.addAttribute("satuanModel", satuanModel);
		
		return "satuan/tambah";
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String satuanStore(@ModelAttribute("satuanModel") MSatuan satuanModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		satuanModel.setSatuanAktif('Y');
		satuanModel.setSatuanCreatedBy("Rizki");
		satuanModel.setSatuanCreatedDate(currentTime);
		
		satuanService.store(satuanModel);
		
		return "redirect: /satuan/tambah";
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String satuanUpdateFormView(Model model, @PathVariable int id){
		MSatuan result = satuanService.getSatuan(id);
		
		model.addAttribute("satuanModel", result);
		
		return "satuan/update";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String satuanUpdate(@ModelAttribute("satuanModel") MSatuan satuanModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		satuanModel.setSatuanUpdatedBy("Rizki");
		satuanModel.setSatuanUpdatedDate(currentTime);
		satuanModel.setSatuanRevised(satuanModel.getSatuanRevised()+1);
		
		satuanService.update(satuanModel);
		
		return "redirect: /satuan/tambah";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String satuanDelete(Model model, @PathVariable int id) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		MSatuan satuanModel = satuanService.getSatuan(id);
		satuanModel.setSatuanAktif('T');
		satuanModel.setSatuanDeletedDate(currentTime);
		
		satuanService.delete(satuanModel);
		
		return "redirect: /satuan/tambah";
	}
}
