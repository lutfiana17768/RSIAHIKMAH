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

import com.rsia.madura.entity.m_Rujukan;
import com.rsia.madura.service.RujukanService;

@Controller
@RequestMapping("/Rujukan")
public class RujukanController {
	@Autowired
	private RujukanService rujukanService;

	private String uri = "redirect:http://localhost:8080/com.rsia.modura/Rujukan/tambah/";

	@RequestMapping("/list")
	public String viewFormPasien(Model model) {
		List<m_Rujukan> result = rujukanService.getRujukans();
		
		model.addAttribute("rujukan", result);

		return "v_rujukan";
	}

	@RequestMapping("/tambah")
	public String addForm(Model model) {
		m_Rujukan rujukanModel = new m_Rujukan();

		model.addAttribute("rujukanModel", rujukanModel);

		return "RujukanAddForm";
	}

	@RequestMapping(value = "/tambah/store", method = RequestMethod.POST)
	public String Store(@ModelAttribute("rujukanModel") m_Rujukan rujukanModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		rujukanModel.setRujukan_aktif("Y");
		rujukanModel.setRujukan_created_by("Admin");
		rujukanModel.setRujukan_created_date(currentTime);

		rujukanService.store(rujukanModel);

		return this.uri;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @RequestParam(value = "Id", required = false) int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		m_Rujukan rujukanModel = rujukanService.getRujukan(id);

		rujukanModel.setRujukan_aktif("T");
		rujukanModel.setRujukan_deleted_date(currentTime);

		rujukanService.delete(rujukanModel);

		return this.uri;
	}

	@RequestMapping(value = "/form-update", method = RequestMethod.GET)
	public String UpdateFormView(Model model, @RequestParam(value = "Id", required = false) int id) {

		m_Rujukan result = rujukanService.getRujukan(id);

		model.addAttribute("rujukanModel", result);

		return "RujukanUpdateForm";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Update(@ModelAttribute("rujukanModel") m_Rujukan rujukanModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		rujukanModel.setRujukan_aktif("Y");
		rujukanModel.setRujukan_updated_by("Admin");
		rujukanModel.setRujukan_updated_date(currentTime);
		;

		rujukanService.update(rujukanModel);

		return this.uri;
	}
}
