/*
* @Author: PRADESGA
* @Date:   2018-04-07 04:10:39
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-08 01:57:26
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

import com.rsia.madura.entity.MKelas;
import com.rsia.madura.service.KelasService;

@Controller
@RequestMapping("/kelas")
public class KelasController {
	@Autowired
	private KelasService kelasService;

	private String uri ="redirect: /kelas/tambah";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model) {
		return this.uri;
	}

	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String FormView(Model model) {
		List<MKelas> kelases = kelasService.findAll();
		MKelas kelasModel = new MKelas();

		model.addAttribute("kelases", kelases);
		model.addAttribute("kelasModel", kelasModel);
		return "kelas/tambah";
	}

	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String Store(@ModelAttribute("kelasModel") MKelas kelasModel) {
		kelasService.store(kelasModel);
		return this.uri;
	}

	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String UpdateFormView(Model model, @PathVariable int id){
		List<MKelas> kelases = kelasService.findAll();
		MKelas kelasModel = kelasService.getById(id);

		model.addAttribute("kelases", kelases);
		model.addAttribute("kelasModel", kelasModel);

		return "kelas/update";
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String Update(@ModelAttribute("kelasModel") MKelas kelasModel) {
		kelasService.update(kelasModel);
		return this.uri;
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String DeleteUpdate(Model model, @PathVariable int id) {
		MKelas kelas = kelasService.getById(id);
		kelasService.delete(kelas);
		return this.uri;
	}

	@ModelAttribute
    public void addAttributes(Model model) {
    	model.addAttribute("pagetitle", "Master Data Kelas");
    }
}