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

import com.rsia.madura.entity.m_Kamar;
import com.rsia.madura.service.KamarService;

@Controller
@RequestMapping("/Kamar")
public class KamarController {
	@Autowired
	private KamarService kamarService;

	private String uri = "redirect:http://localhost:8080/com.rsia.modura/Kamar/tambah/";

	@RequestMapping("/tambah")
	public String addForm(Model model) {
		m_Kamar kamarModel = new m_Kamar();

		model.addAttribute("kamarModel", kamarModel);

		return "KamarAddForm";
	}
	
	// konyol
	@RequestMapping(value = "/tambah/store", method = RequestMethod.POST)
	public String Store(@ModelAttribute("kamarModel") m_Kamar kamarModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		kamarModel.setKamar_aktif("Y");
		kamarModel.setKamar_created_by("Admin");
		kamarModel.setKamar_created_date(currentTime);

		kamarService.store(kamarModel);

		return this.uri;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @RequestParam(value = "Id", required = false) int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		m_Kamar kamarModel = kamarService.getKamar(id);

		kamarModel.setKamar_aktif("T");
		kamarModel.setKamar_deleted_date(currentTime);

		kamarService.delete(kamarModel);

		return this.uri;
	}

	@RequestMapping(value = "/form-update", method = RequestMethod.GET)
	public String UpdateFormView(Model model, @RequestParam(value = "Id", required = false) int id) {

		m_Kamar result = kamarService.getKamar(id);

		model.addAttribute("kamarModel", result);

		return "KamarUpdateForm";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Update(@ModelAttribute("kamarModel") m_Kamar kamarModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		kamarModel.setKamar_aktif("Y");
		kamarModel.setKamar_updated_by("Admin");
		kamarModel.setKamar_updated_date(currentTime);

		kamarService.update(kamarModel);

		return this.uri;
	}

}
