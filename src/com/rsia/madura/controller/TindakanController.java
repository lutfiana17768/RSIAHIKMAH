/*
* @Author: PRADESGA
* @Date:   2018-04-07 07:50:20
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 01:07:14
*/
package com.rsia.madura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.validation.BindingResult;

import com.rsia.madura.entity.MKelas;
import com.rsia.madura.entity.MTindakan;
import com.rsia.madura.service.KelasService;
import com.rsia.madura.service.TindakanService;

@Controller
@RequestMapping("/tindakan")
public class TindakanController {
	@Autowired
	private TindakanService tindakanService;

	@Autowired
	private KelasService kelasService;

	private String uri ="redirect: /tindakan";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model) {
		List<MKelas> kelases = kelasService.findAll();
		List<MTindakan> tindakans = tindakanService.findAll();
		MTindakan tindakanModel = new MTindakan();

		model.addAttribute("tindakans", tindakans);
		model.addAttribute("kelases", kelases);
		model.addAttribute("tindakanModel", tindakanModel);
		return "tindakan/index";
	}

	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String Store(@ModelAttribute("tindakanModel") MTindakan tindakanModel, BindingResult bindingResult) {
		tindakanService.store(tindakanModel);
		return this.uri;
	}

	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String UpdateFormView(Model model, @PathVariable int id){
		List<MKelas> kelases = kelasService.findAll();
		List<MTindakan> tindakans = tindakanService.findAll();
		MTindakan tindakanModel = tindakanService.getById(id);

		model.addAttribute("tindakans", tindakans);
		model.addAttribute("kelases", kelases);
		model.addAttribute("tindakanModel", tindakanModel);

		return "tindakan/update";
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String Update(@ModelAttribute("tindakanModel") MTindakan tindakanModel) {
		tindakanService.update(tindakanModel);
		return this.uri;
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String DeleteUpdate(Model model, @PathVariable int id) {
		MTindakan tindakan = tindakanService.getById(id);
		tindakanService.delete(tindakan);
		return this.uri;
	}

	@ModelAttribute
    public void addAttributes(Model model) {
    	model.addAttribute("pagetitle", "Master Tindakan");
    }
}