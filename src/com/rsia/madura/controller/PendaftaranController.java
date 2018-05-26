/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-25 10:14:49
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-26 16:18:16
*/
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

import com.rsia.madura.entity.MKelas;
import com.rsia.madura.entity.MPasien;
import com.rsia.madura.entity.MPendaftaran;
import com.rsia.madura.entity.MRujukan;
import com.rsia.madura.entity.MTindakan;
import com.rsia.madura.entity.MKondisi;
import com.rsia.madura.entity.MPaket;

import com.rsia.madura.service.PendaftaranService;
import com.rsia.madura.service.PendidikanService;
import com.rsia.madura.service.KelasService;
import com.rsia.madura.service.PasienService;
import com.rsia.madura.service.RujukanService;
import com.rsia.madura.service.TindakanService;
import com.rsia.madura.service.KondisiPasienService;
import com.rsia.madura.service.PaketService;

@Controller
@RequestMapping("/pendaftaran")
public class PendaftaranController {
	@Autowired
	private PendaftaranService PendaftaranService;
	
	@Autowired
	private PasienService PasienService;
	
	@Autowired
	private RujukanService RujukanService;
	
	@Autowired
	private TindakanService TindakanService;
	
	@Autowired
	private KondisiPasienService KondisiPasienService;
	
	@Autowired
	private PaketService PaketService;

	private String uri = "redirect: /pendaftaran";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model) {
		MPendaftaran PendaftaranModel = new MPendaftaran();
		
		List<MPendaftaran> pendaftarans = PendaftaranService.getPendaftarans();
		
		List<MPasien> pasien = PasienService.findAll();
		List<MRujukan> rujukan = RujukanService.getRujukans();
		List<MTindakan> tindakan = TindakanService.findAll();
		List<MKondisi> kondisipasien = KondisiPasienService.getKondisis();
		List<MPaket> paket = PaketService.findAll();

		model.addAttribute("pendaftarans", pendaftarans);
		model.addAttribute("Pasien", pasien);
		model.addAttribute("Rujukan", rujukan);
		model.addAttribute("Tindakan", tindakan);
		model.addAttribute("Kondisipasien", kondisipasien);
		model.addAttribute("Paket", paket);
		model.addAttribute("footerjs", "../pendaftaran/inc/footerjs.jsp");
		model.addAttribute("PendaftaranModel", PendaftaranModel);

		return "pendaftaran/index";
	
	}

	@RequestMapping("/tambah")
	public String addForm(Model model) {
		MPendaftaran pendaftaranModel = new MPendaftaran();

		Map<String, String> jenispendaftaran = new HashMap<String, String>();
		jenispendaftaran.put("O", "Operatif");
		jenispendaftaran.put("N", "Non Operatif");

		model.addAttribute("jenispendaftaran", jenispendaftaran);
		model.addAttribute("pendaftaranModel", pendaftaranModel);

		return "PendaftaranAddForm";
	}

	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public String Store(@ModelAttribute("pendaftaranModel") MPendaftaran pendaftaranModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		pendaftaranModel.setPendaftaran_aktif("Y");
		pendaftaranModel.setPendaftaran_created_by("Admin");
		pendaftaranModel.setPendaftaran_created_date(currentTime);

		PendaftaranService.store(pendaftaranModel);

		return this.uri;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @RequestParam(value = "Id", required = false) int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		MPendaftaran pendaftaranModel = PendaftaranService.getPendaftaran(id);

		pendaftaranModel.setPendaftaran_aktif("T");
		pendaftaranModel.setPendaftaran_deleted_date(currentTime);

		PendaftaranService.delete(pendaftaranModel);

		return this.uri;
	}

	@RequestMapping(value = "/form-update", method = RequestMethod.GET)
	public String UpdateFormView(Model model, @RequestParam(value = "Id", required = false) int id) {

		MPendaftaran result = PendaftaranService.getPendaftaran(id);

		Map<String, String> jenispendaftaran = new HashMap<String, String>();
		jenispendaftaran.put("O", "Operatif");
		jenispendaftaran.put("N", "Non Operatif");

		model.addAttribute("jenispendaftaran", jenispendaftaran);

		model.addAttribute("pendaftaranModel", result);

		return "PendaftaranUpdateForm";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Update(@ModelAttribute("pendaftaranModel") MPendaftaran pendaftaranModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		pendaftaranModel.setPendaftaran_aktif("Y");
		pendaftaranModel.setPendaftaran_updated_by("Admin");
		pendaftaranModel.setPendaftaran_updated_date(currentTime);

		PendaftaranService.update(pendaftaranModel);

		return this.uri;
	}

}