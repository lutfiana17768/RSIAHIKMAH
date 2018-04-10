/*
* @Author: PRADESGA
* @Date:   2018-04-07 07:50:20
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 01:05:11
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
import com.rsia.madura.entity.MPaket;
import com.rsia.madura.service.KelasService;
import com.rsia.madura.service.PaketService;

@Controller
@RequestMapping("/paketan")
public class PaketController {
	@Autowired
	private PaketService paketService;

	@Autowired
	private KelasService kelasService;

	private String uri ="redirect: /paketan";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model) {
		List<MPaket> paketan = paketService.findAll();
		model.addAttribute("paketan", paketan);
		model.addAttribute("footerjs", "");
		return "paketan/index";
	}

	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String FormView(Model model) {
		List<MKelas> kelases = kelasService.findAll();
		List<MPaket> paketan = paketService.findAll();
		MPaket paketModel = new MPaket();

		model.addAttribute("paketan", paketan);
		model.addAttribute("kelases", kelases);
		model.addAttribute("paketModel", paketModel);
		return "paketan/tambah";
	}

	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String Store(@ModelAttribute("paketModel") MPaket paket, BindingResult bindingResult) {
		paketService.store(paket);
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

		return "paketan/update";
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