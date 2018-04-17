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

import com.rsia.madura.entity.MKamar;
import com.rsia.madura.entity.MKelas;
import com.rsia.madura.entity.MRuang;

import com.rsia.madura.service.KamarService;
import com.rsia.madura.service.RuangService;
import com.rsia.madura.service.KelasService;

@Controller
@RequestMapping("/kamar")
public class NKamarController {
	@Autowired
	private KamarService kamarService;

	@Autowired
	private RuangService ruangService;

	@Autowired
	private KelasService kelasService;

	private String uri ="redirect: /kamar";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model) {
		List<MRuang> ruangs = ruangService.findAll();
		model.addAttribute("ruangs", ruangs);
		model.addAttribute("footerjs", "");
		return "ruangan/index";
	}
	// public String list(Model model, @RequestParam(value = "page", required = false, defaultValue = "1") int page,
	// 		@RequestParam(value = "limit", required = false, defaultValue = "10") int limit) {

	// 	List<m_Kamar> result = KamarService.getKamars(page, limit);
	// 	String link = KamarService.createLinks(page, limit);
	// 	m_Kamar kamarModel = new m_Kamar();

	// 	model.addAttribute("kamar", result);
	// 	model.addAttribute("link", link);
	// 	model.addAttribute("kamarModel", kamarModel);

	// 	return "v_m_kamar_list";
	// }

	@RequestMapping("/tambah")
	public String addForm(Model model) {
		MKamar kamarModel = new MKamar();
		List<MRuang> ruang = ruangService.findAll();
		List<MKelas> kelas = kelasService.findAll();

		Map<String, String> pelayanan = new HashMap<String, String>();
		pelayanan.put("I", "Rawat Inap");
		pelayanan.put("J", "Rawat Jalan");

		model.addAttribute("ruang", ruang);
		model.addAttribute("kelas", kelas);
		model.addAttribute("pelayanan", pelayanan);
		model.addAttribute("kamarModel", kamarModel);

		return "v_m_kamar_tambah";
	}

	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public String Store(@ModelAttribute("kamarModel") MKamar kamarModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		kamarModel.setKamar_aktif("Y");
		kamarModel.setKamar_created_by("Admin");
		kamarModel.setKamar_created_date(currentTime);

		kamarService.store(kamarModel);

		return this.uri;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @RequestParam(value = "Id", required = false) int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		MKamar kamarModel = kamarService.getKamar(id);

		kamarModel.setKamar_aktif("T");
		kamarModel.setKamar_deleted_date(currentTime);

		kamarService.delete(kamarModel);

		return this.uri;
	}

	@RequestMapping(value = "/form-update", method = RequestMethod.GET)
	public String UpdateFormView(Model model, @RequestParam(value = "Id", required = false) int id) {

		MKamar result = kamarService.getKamar(id);

		List<MRuang> ruang = ruangService.findAll();
		List<MKelas> kelas = kelasService.findAll();

		Map<String, String> pelayanan = new HashMap<String, String>();
		pelayanan.put("I", "Rawat Inap");
		pelayanan.put("J", "Rawat Jalan");

		model.addAttribute("ruang", ruang);
		model.addAttribute("kelas", kelas);
		model.addAttribute("pelayanan", pelayanan);

		model.addAttribute("kamarModel", result);

		return "v_m_kamar_update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Update(@ModelAttribute("kamarModel") MKamar kamarModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		kamarModel.setKamar_aktif("Y");
		kamarModel.setKamar_updated_by("Admin");
		kamarModel.setKamar_updated_date(currentTime);

		kamarService.update(kamarModel);

		return this.uri;
	}

}
