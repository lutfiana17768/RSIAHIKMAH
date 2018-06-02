/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:50:23 
 * @Last Modified by:   Pradesga Indonesia
 * @Last Modified time: 2018-05-28 14:26:11
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
import com.rsia.madura.service.RujukanService;

@Controller
@RequestMapping("/rujukan")
public class RujukanController {
	@Autowired
	private RujukanService rujukanService;

	private String uri = "redirect: /rujukan/";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model){
		List<MRujukan> rujukans = rujukanService.getRujukans();
		model.addAttribute("rujukans", rujukans);

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

		rujukanModel.setRujukanAktif("Y");
		rujukanModel.setRujukanCreatedBy("Admin");
		rujukanModel.setRujukanCreatedDate(currentTime);

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

		rujukanModel.setRujukanAktif("Y");
		rujukanModel.setRujukanUpdatedBy("Admin");
		rujukanModel.setRujukanUpdatedDate(currentTime);
		;

		rujukanService.update(rujukanModel);

		return this.uri;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @PathVariable int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		MRujukan rujukanModel = rujukanService.getRujukan(id);

		rujukanModel.setRujukanAktif("T");
		rujukanModel.setRujukanDeletedDate(currentTime);

		rujukanService.delete(rujukanModel);

		return this.uri;
	}

}
