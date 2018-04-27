/*
* @Author: PRADESGA
* @Date:   2018-04-07 07:50:20
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 01:05:11
*/
package com.rsia.madura.controller;
import java.util.List; // Class to hold a list of objects
import java.util.Scanner;
import java.util.Map;

import org.springframework.util.MultiValueMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.rsia.madura.entity.MKelas;
import com.rsia.madura.entity.MPaket;
import com.rsia.madura.entity.MRuang;
import com.rsia.madura.entity.MTindakan;
import com.rsia.madura.entity.MPaketHarga;

import com.rsia.madura.service.KelasService;
import com.rsia.madura.service.PaketService;
import com.rsia.madura.service.RuangService;
import com.rsia.madura.service.TindakanService;


@Controller
@RequestMapping("/paket")
public class PaketController {
	@Autowired
	private PaketService paketService;

	@Autowired
	private KelasService kelasService;

	@Autowired
	private RuangService ruangService;

	@Autowired
	private TindakanService tindakanService;

	private String uri ="redirect: /paket";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model) {
		List<MPaket> paketan = paketService.findAll();
		model.addAttribute("paketan", paketan);
		model.addAttribute("footerjs", "");
		return "paket/index";
	}

	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String FormView(Model model) {
		List<MKelas> kelases = kelasService.findAll();
		List<MPaket> paketan = paketService.findAll();
		List<MRuang> ruangs = ruangService.findAll();
		List<MTindakan> tindakans = tindakanService.findAll();

		MPaket paketModel = new MPaket();
		
		model.addAttribute("kelases", kelases);
		model.addAttribute("ruangs", ruangs);
		model.addAttribute("tindakans", tindakans);
		
		model.addAttribute("paketModel", paketModel);
		model.addAttribute("footerjs", "../paket/inc/footerjs.jsp");
		return "paket/tambah";
	}

	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String Store(@ModelAttribute("paketModel") MPaket paketModel, BindingResult bindingResult) {	
		paketService.store(paketModel);
		return this.uri;
	}

	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String UpdateFormView(Model model, @PathVariable int id){
		List<MKelas> kelases = kelasService.findAll();
		List<MPaket> paketan = paketService.findAll();
		MPaket paketModel = paketService.getById(id);

		model.addAttribute("paketan", paketan);
		model.addAttribute("kelases", kelases);
		model.addAttribute("paketModel", paketModel);

		return "paket/update";
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String Update(@ModelAttribute("paketModel") MPaket paketModel) {
		paketService.update(paketModel);
		return this.uri;
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String DeleteUpdate(Model model, @PathVariable int id) {
		MPaket paketModel = paketService.getById(id);
		paketService.delete(paketModel);
		return this.uri;
	}

	@ModelAttribute
    public void addAttributes(Model model) {
    	model.addAttribute("pagetitle", "Master Tindakan");
    }
}