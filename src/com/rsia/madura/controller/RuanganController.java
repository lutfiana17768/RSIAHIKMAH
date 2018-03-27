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

import com.rsia.madura.entity.m_Agama;
import com.rsia.madura.entity.m_Kelas;
import com.rsia.madura.entity.m_Ruang;

import com.rsia.madura.service.KelasService;
import com.rsia.madura.service.RuanganService;

@Controller
@RequestMapping("/Ruang")
public class RuanganController {
	@Autowired
	private RuanganService RuangService;

	@Autowired
	private KelasService KelasService;

	private String uri = "redirect:http://localhost:8080/com.rsia.modura/Ruang/list/";

	@RequestMapping("/list")
	public String list(Model model, 
			@RequestParam(value = "page", required = false , defaultValue = "1") int page,
			@RequestParam(value = "limit", required = false, defaultValue = "10") int limit) {
		
		List<m_Ruang> result = RuangService.getRuangs(page, limit);
		String link = RuangService.createLinks(page, limit);
		m_Ruang ruangModel = new m_Ruang();
		
		model.addAttribute("ruang", result);
		model.addAttribute("link", link);
		model.addAttribute("ruangModel", ruangModel);

		return "v_ruangan_list";
	}

	@RequestMapping("/tambah")
	public String addForm(Model model) {
		m_Ruang ruangModel = new m_Ruang();

		List<m_Kelas> kelas = KelasService.getKelases();

		Map<String, String> pelayanan = new HashMap<String, String>();
		pelayanan.put("1", "Pelayanan 1");
		pelayanan.put("2", "Pelayanan 2");

		Map<String, String> kepala = new HashMap<String, String>();
		kepala.put("1", "Kepala 1");
		kepala.put("2", "Kepala 2");

		model.addAttribute("ruangModel", ruangModel);
		model.addAttribute("kelas", kelas);
		model.addAttribute("pelayanan", pelayanan);
		model.addAttribute("kepala", kepala);

		return "v_ruangan_tambah";
	}

	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public String Store(@ModelAttribute("ruangModel") m_Ruang ruangModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		ruangModel.setRuang_aktif("Y");
		ruangModel.setRuang_created_by("Admin");
		ruangModel.setRuang_created_date(currentTime);

		RuangService.store(ruangModel);

		return this.uri;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @RequestParam(value = "Id", required = false) int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		m_Ruang ruangModel = RuangService.getRuang(id);

		ruangModel.setRuang_aktif("T");
		ruangModel.setRuang_deleted_date(currentTime);

		RuangService.delete(ruangModel);

		return this.uri;
	}

	@RequestMapping(value = "/form-update", method = RequestMethod.GET)
	public String UpdateFormView(Model model, @RequestParam(value = "Id", required = false) int id) {

		m_Ruang ruangModel = RuangService.getRuang(id);
		
		List<m_Kelas> kelas = KelasService.getKelases();
		
		Map<String, String> pelayanan = new HashMap<String, String>();
		pelayanan.put("1", "Pelayanan 1");
		pelayanan.put("2", "Pelayanan 2");

		Map<String, String> kepala = new HashMap<String, String>();
		kepala.put("1", "Kepala 1");
		kepala.put("2", "Kepala 2");

		model.addAttribute("ruangModel", ruangModel);
		model.addAttribute("kelas", kelas);
		model.addAttribute("pelayanan", pelayanan);
		model.addAttribute("kepala", kepala);

		return "v_ruangan_update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Update(@ModelAttribute("ruangModel") m_Ruang ruangModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		ruangModel.setRuang_aktif("Y");
		ruangModel.setRuang_updated_by("Admin");
		ruangModel.setRuang_updated_date(currentTime);
		;

		RuangService.update(ruangModel);

		return this.uri;
	}

}
