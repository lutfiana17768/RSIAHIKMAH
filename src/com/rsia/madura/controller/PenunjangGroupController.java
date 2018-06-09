/*
* @Author: PRADESGA
* @Date:   2018-04-07 04:10:39
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-14 05:54:04
*/
package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import com.rsia.madura.entity.MPenunjangGroup;
import com.rsia.madura.service.PenunjangGroupService;

@Controller
@RequestMapping("/penunjang-group")
public class PenunjangGroupController {
	@Autowired
	private PenunjangGroupService penunjangGroupService;

	private String uri ="redirect: /penunjang-group/tambah";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model) {
		return this.uri;
	}

	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String FormView(Model model) {
		List<MPenunjangGroup> penunjangGroups = penunjangGroupService.findAll();
		MPenunjangGroup penunjangGroupModel = new MPenunjangGroup();
		
		Map<String, String> laporan = new HashMap<String, String>();
		laporan.put("nilai", "Nilai");
		laporan.put("file", "File");
		laporan.put("kesimpulan", "kesimpulan");

		model.addAttribute("penunjangGroups", penunjangGroups);
		model.addAttribute("laporan", laporan);
		model.addAttribute("penunjangGroupModel", penunjangGroupModel);
		return "penunjangGroup/tambah";
	}

	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String Store(@ModelAttribute("penunjangGroupModel") MPenunjangGroup penunjangGroupModel) {
		penunjangGroupService.store(penunjangGroupModel);
		return this.uri;
	}

	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String UpdateFormView(Model model, @PathVariable int id){
		List<MPenunjangGroup> penunjangGroups = penunjangGroupService.findAll();
		MPenunjangGroup penunjangGroupModel = penunjangGroupService.getById(id);

		Map<String, String> laporan = new HashMap<String, String>();
		laporan.put("nilai", "Nilai");
		laporan.put("file", "File");
		laporan.put("kesimpulan", "kesimpulan");

		model.addAttribute("penunjangGroups", penunjangGroups);
		model.addAttribute("laporan", laporan);
		model.addAttribute("penunjangGroupModel", penunjangGroupModel);

		return "penunjangGroup/update";
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String Update(@ModelAttribute("penunjangGroupModel") MPenunjangGroup penunjangGroupModel) {
		penunjangGroupService.update(penunjangGroupModel);
		return this.uri;
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String DeleteUpdate(Model model, @PathVariable int id) {
		MPenunjangGroup penunjangGroup = penunjangGroupService.getById(id);
		penunjangGroupService.delete(penunjangGroup);
		return this.uri;
	}
	@ModelAttribute
    public void addAttributes(Model model) {
    	model.addAttribute("pagetitle", "Master Group Penunjang");
    }
}