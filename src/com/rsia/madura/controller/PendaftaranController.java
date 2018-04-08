package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rsia.madura.entity.m_Kelas;
import com.rsia.madura.entity.m_Tindakan;

import com.rsia.madura.service.TindakanService;
import com.rsia.madura.service.KelasService;

@Controller
@RequestMapping("/Tindakan")
public class PendaftaranController {
	@Autowired
	private TindakanService TindakanService;

	@Autowired
	private KelasService KelasService;

	private String uri = "redirect:http://localhost:8080/com.rsia.modura/Tindakan/list";

	@RequestMapping("/list")
	public String viewForm(Model model) {
		List<m_Tindakan> result = TindakanService.getTindakans();

		model.addAttribute("tindakan", result);

		return "v_m_tindakan";
	}

	@RequestMapping("/tambah")
	public String addForm(Model model) {
		m_Tindakan tindakanModel = new m_Tindakan();
		List<m_Kelas> kelas = KelasService.getKelases();

		Map<String, String> jenistindakan = new HashMap<String, String>();
		jenistindakan.put("O", "Operatif");
		jenistindakan.put("N", "Non Operatif");

		model.addAttribute("kelas", kelas);
		model.addAttribute("jenistindakan", jenistindakan);
		model.addAttribute("tindakanModel", tindakanModel);

		return "TindakanAddForm";
	}

	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public String Store(@ModelAttribute("tindakanModel") m_Tindakan tindakanModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		tindakanModel.setTindakan_aktif("Y");
		tindakanModel.setTindakan_created_by("Admin");
		tindakanModel.setTindakan_created_date(currentTime);

		TindakanService.store(tindakanModel);

		return this.uri;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @RequestParam(value = "Id", required = false) int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		m_Tindakan tindakanModel = TindakanService.getTindakan(id);

		tindakanModel.setTindakan_aktif("T");
		tindakanModel.setTindakan_deleted_date(currentTime);

		TindakanService.delete(tindakanModel);

		return this.uri;
	}

	@RequestMapping(value = "/form-update", method = RequestMethod.GET)
	public String UpdateFormView(Model model, @RequestParam(value = "Id", required = false) int id) {

		m_Tindakan result = TindakanService.getTindakan(id);
		List<m_Kelas> kelas = KelasService.getKelases();

		Map<String, String> jenistindakan = new HashMap<String, String>();
		jenistindakan.put("O", "Operatif");
		jenistindakan.put("N", "Non Operatif");

		model.addAttribute("kelas", kelas);
		model.addAttribute("jenistindakan", jenistindakan);

		model.addAttribute("tindakanModel", result);

		return "TindakanUpdateForm";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Update(@ModelAttribute("tindakanModel") m_Tindakan tindakanModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		tindakanModel.setTindakan_aktif("Y");
		tindakanModel.setTindakan_updated_by("Admin");
		tindakanModel.setTindakan_updated_date(currentTime);

		TindakanService.update(tindakanModel);

		return this.uri;
	}

}
