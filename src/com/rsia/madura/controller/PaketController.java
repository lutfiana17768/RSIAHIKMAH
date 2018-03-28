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
import com.rsia.madura.entity.m_Paket;

import com.rsia.madura.service.KelasService;
import com.rsia.madura.service.PaketService;

@Controller
@RequestMapping("/Paket")
public class PaketController {
	@Autowired
	private PaketService PaketService;

	@Autowired
	private KelasService KelasService;

	private String uri = "redirect:http://localhost:8080/com.rsia.modura/Paket/list/";

	@RequestMapping("/list")
	public String viewForm(Model model) {
		List<m_Paket> result = PaketService.getPakets();

		model.addAttribute("paket", result);

		return "v_paket";
	}

	@RequestMapping("/tambah")
	public String addForm(Model model) {
		m_Paket paketModel = new m_Paket();

		List<m_Kelas> kelas = KelasService.getKelases();

		Map<String, String> jenispaket = new HashMap<String, String>();
		jenispaket.put("A", "Paket Operatif");
		jenispaket.put("B", "Paket Non Operatif");

		model.addAttribute("kelas", kelas);
		model.addAttribute("jenispaket", jenispaket);

		model.addAttribute("paketModel", paketModel);

		return "PaketAddForm";
	}

	@RequestMapping(value = "/tambah/store", method = RequestMethod.POST)
	public String Store(@ModelAttribute("paketModel") m_Paket paketModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		paketModel.setPaket_aktif("Y");
		paketModel.setPaket_created_by("Admin");
		paketModel.setPaket_created_date(currentTime);

		PaketService.store(paketModel);

		return this.uri;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @RequestParam(value = "Id", required = false) int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		m_Paket paketModel = PaketService.getPaket(id);

		paketModel.setPaket_aktif("T");
		paketModel.setPaket_deleted_date(currentTime);

		PaketService.delete(paketModel);

		return this.uri;
	}

	@RequestMapping(value = "/form-update", method = RequestMethod.GET)
	public String UpdateFormView(Model model, @RequestParam(value = "Id", required = false) int id) {

		m_Paket result = PaketService.getPaket(id);

		List<m_Kelas> kelas = KelasService.getKelases();

		Map<String, String> jenispaket = new HashMap<String, String>();
		jenispaket.put("A", "Paket Operatif");
		jenispaket.put("B", "Paket Non Operatif");

		model.addAttribute("kelas", kelas);
		model.addAttribute("jenispaket", jenispaket);

		model.addAttribute("paketModel", result);

		return "PaketUpdateForm";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Update(@ModelAttribute("paketModel") m_Paket paketModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		paketModel.setPaket_aktif("Y");
		paketModel.setPaket_updated_by("Admin");
		paketModel.setPaket_updated_date(currentTime);

		PaketService.update(paketModel);

		return this.uri;
	}

}
