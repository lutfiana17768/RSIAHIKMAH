/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-17 14:53:46
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-23 11:49:11
*/

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

import com.rsia.madura.entity.MPendaftaran;
import com.rsia.madura.service.PendaftaranService;

@Controller
@RequestMapping("/pelayanan")
public class PelayananController {
	@Autowired
	private PendaftaranService pendaftaranService;
	
	private String uri ="redirect: /pelayanan/tambah";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView() {
		return this.uri;
	}

	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String FormView(Model model){
		List<MPendaftaran> result = pendaftaranService.getPendaftarans();
		model.addAttribute("footerjs", "../pelayanan/inc/footerjs.jsp");
		
		return "pelayanan/tambah";
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String Store(@ModelAttribute("pendaftaranModel") MPendaftaran pendaftaranModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		pendaftaranModel.setPendaftaran_aktif("Y");
		pendaftaranModel.setPendaftaran_created_by("Admin");
		pendaftaranModel.setPendaftaran_created_date(currentTime);

		pendaftaranService.store(pendaftaranModel);

		return this.uri;
	}

	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String UpdateFormView(Model model){
		
		
		return "pelayanan/update";
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String DeleteUpdate(Model model){
		
		
		return "pelayanan/update";
	}

}
