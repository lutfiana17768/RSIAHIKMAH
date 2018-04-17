/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:50:23 
 * @Last Modified by: Pradesga
 * @Last Modified time: 2018-04-15 13:55:10
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

import com.rsia.madura.entity.MRujukan;
import com.rsia.madura.service.NRujukanService;

@Controller
@RequestMapping("/rujukan")
public class NRujukanController {
	@Autowired
	private NRujukanService rujukanService;

	private String uri = "redirect: /rujukan/tambah/";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model){
		List<MRujukan> result = rujukanService.getRujukans();
		
		model.addAttribute("rujukan", result);

		return "rujukan/index";
	}

	@RequestMapping("/tambah")
	public String addForm(Model model) {
		MRujukan rujukanModel = new MRujukan();

		model.addAttribute("rujukanModel", rujukanModel);

		return "rujukan/tambah";
	}

	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public String Store(@ModelAttribute("rujukanModel") MRujukan rujukanModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		rujukanModel.setRujukan_aktif("Y");
		rujukanModel.setRujukan_created_by("Admin");
		rujukanModel.setRujukan_created_date(currentTime);

		rujukanService.store(rujukanModel);

		return this.uri;
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String UpdateFormView(Model model, @PathVariable int id) {

		MRujukan result = rujukanService.getRujukan(id);

		model.addAttribute("rujukanModel", result);

		return "rujukan/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Update(@ModelAttribute("rujukanModel") MRujukan rujukanModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		rujukanModel.setRujukan_aktif("Y");
		rujukanModel.setRujukan_updated_by("Admin");
		rujukanModel.setRujukan_updated_date(currentTime);
		;

		rujukanService.update(rujukanModel);

		return this.uri;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @PathVariable int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		MRujukan rujukanModel = rujukanService.getRujukan(id);

		rujukanModel.setRujukan_aktif("T");
		rujukanModel.setRujukan_deleted_date(currentTime);

		rujukanService.delete(rujukanModel);

		return this.uri;
	}

}
