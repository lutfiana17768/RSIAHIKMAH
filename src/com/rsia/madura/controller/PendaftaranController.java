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
import com.rsia.madura.entity.m_Pasien;
import com.rsia.madura.entity.t_Pendaftaran;
import com.rsia.madura.entity.m_Rujukan;
import com.rsia.madura.entity.m_Tindakan;
import com.rsia.madura.entity.m_Kondisi;
import com.rsia.madura.entity.m_Paket;

import com.rsia.madura.service.PendaftaranService;
import com.rsia.madura.service.PendidikanService;
import com.rsia.madura.service.KelasService;
import com.rsia.madura.service.PasienService;
import com.rsia.madura.service.RujukanService;
import com.rsia.madura.service.TindakanService;
import com.rsia.madura.service.KondisiPasienService;
import com.rsia.madura.service.PaketService;

@Controller
@RequestMapping("/Pendaftaran")
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

	private String uri = "redirect:http://localhost:8080/com.rsia.modura/Pendaftaran/list";

	@RequestMapping("/list")
	public String viewForm(Model model) {
		t_Pendaftaran PendaftaranModel = new t_Pendaftaran();
		
		List<t_Pendaftaran> result = PendaftaranService.getPendaftarans();
		
		List<m_Pasien> pasien = PasienService.getPasien();
		List<m_Rujukan> rujukan = RujukanService.getRujukans();
		List<m_Tindakan> tindakan = TindakanService.getTindakans();
		List<m_Kondisi> kondisipasien = KondisiPasienService.getKondisis();
		List<m_Paket> paket = PaketService.getPakets();

		model.addAttribute("pendaftaran", result);
		model.addAttribute("Pasien", pasien);
		model.addAttribute("Rujukan", rujukan);
		model.addAttribute("Tindakan", tindakan);
		model.addAttribute("Kondisipasien", kondisipasien);
		model.addAttribute("Paket", paket);
		model.addAttribute("PendaftaranModel", PendaftaranModel);

		return "v_pendaftaran";
	}

	@RequestMapping("/tambah")
	public String addForm(Model model) {
		t_Pendaftaran pendaftaranModel = new t_Pendaftaran();

		Map<String, String> jenispendaftaran = new HashMap<String, String>();
		jenispendaftaran.put("O", "Operatif");
		jenispendaftaran.put("N", "Non Operatif");

		model.addAttribute("jenispendaftaran", jenispendaftaran);
		model.addAttribute("pendaftaranModel", pendaftaranModel);

		return "PendaftaranAddForm";
	}

	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public String Store(@ModelAttribute("pendaftaranModel") t_Pendaftaran pendaftaranModel) {
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

		t_Pendaftaran pendaftaranModel = PendaftaranService.getPendaftaran(id);

		pendaftaranModel.setPendaftaran_aktif("T");
		pendaftaranModel.setPendaftaran_deleted_date(currentTime);

		PendaftaranService.delete(pendaftaranModel);

		return this.uri;
	}

	@RequestMapping(value = "/form-update", method = RequestMethod.GET)
	public String UpdateFormView(Model model, @RequestParam(value = "Id", required = false) int id) {

		t_Pendaftaran result = PendaftaranService.getPendaftaran(id);

		Map<String, String> jenispendaftaran = new HashMap<String, String>();
		jenispendaftaran.put("O", "Operatif");
		jenispendaftaran.put("N", "Non Operatif");

		model.addAttribute("jenispendaftaran", jenispendaftaran);

		model.addAttribute("pendaftaranModel", result);

		return "PendaftaranUpdateForm";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Update(@ModelAttribute("pendaftaranModel") t_Pendaftaran pendaftaranModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		pendaftaranModel.setPendaftaran_aktif("Y");
		pendaftaranModel.setPendaftaran_updated_by("Admin");
		pendaftaranModel.setPendaftaran_updated_date(currentTime);

		PendaftaranService.update(pendaftaranModel);

		return this.uri;
	}

}
