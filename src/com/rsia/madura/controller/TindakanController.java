package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rsia.madura.entity.m_Tindakan;
import com.rsia.madura.service.TindakanService;

@Controller
@RequestMapping("/Tindakan")
public class TindakanController {
	@Autowired
	private TindakanService tindakanService;

	private String uri = "redirect:http://localhost:8080/com.rsia.modura/Agama/tambah/?page=1&limit=10";

	@RequestMapping("/list")
	public String viewForm(Model model) {
		List<m_Tindakan> result = tindakanService.getTindakans();

		model.addAttribute("tindakan", result);

		return "v_m_tindakan";
	}

	@RequestMapping("/tambah")
	public String addForm(Model model) {
		m_Tindakan tindakanModel = new m_Tindakan();

		model.addAttribute("tindakanModel", tindakanModel);

		return "TindakanAddForm";
	}

	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public String Store(@ModelAttribute("tindakanModel") m_Tindakan tindakanModel) {
		System.out.println("ccccc");
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		tindakanModel.setTindakan_aktif("Y");
		tindakanModel.setTindakan_created_by("Admin");
		tindakanModel.setTindakan_created_date(currentTime);

		tindakanService.store(tindakanModel);

		return this.uri;
	}

}
