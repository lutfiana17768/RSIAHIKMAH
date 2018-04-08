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
import com.rsia.madura.entity.m_Obat;
import com.rsia.madura.entity.m_Paket;
import com.rsia.madura.entity.m_PaketObat;

import com.rsia.madura.service.KelasService;
import com.rsia.madura.service.ObatService;
import com.rsia.madura.service.PaketService;
import com.rsia.madura.service.PaketObatService;

@Controller
@RequestMapping("/PaketObat")
public class PaketObatController {
	@Autowired
	private PaketObatService PaketObatService;

	@Autowired
	private KelasService KelasService;

	@Autowired
	private PaketService PaketService;

	@Autowired
	private ObatService ObatService;

	private String uri = "redirect:http://localhost:8080/com.rsia.modura/PaketObat/list";

	@RequestMapping("/list")
	public String viewForm(Model model) {
//		List<m_PaketObat> result = PaketObatService.getPaketObats();
//
//		model.addAttribute("paketobat", result);

		//return "PaketObatList";
		return "v_paket";
	}

	@RequestMapping("/tambah")
	public String addForm(Model model) {
		m_PaketObat paketobatModel = new m_PaketObat();

		List<m_Paket> paket = PaketService.getPakets();
		List<m_Obat> obat = ObatService.getObats();
		List<m_Kelas> kelas = KelasService.getKelases();

		Map<String, String> satuan = new HashMap<String, String>();
		satuan.put("1", "MM");
		satuan.put("2", "CM");

		model.addAttribute("obat", obat);
		model.addAttribute("paket", paket);
		model.addAttribute("kelas", kelas);
		model.addAttribute("satuan", satuan);
		model.addAttribute("paketobatModel", paketobatModel);

		return "PaketObatAddForm";
	}

	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public String Store(@ModelAttribute("paketobatModel") m_PaketObat paketobatModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		paketobatModel.setPaket_barang_aktif("Y");
		paketobatModel.setPaket_barang_created_by("Admin");
		paketobatModel.setPaket_barang_created_date(currentTime);

		PaketObatService.store(paketobatModel);

		return this.uri;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @RequestParam(value = "Id", required = false) int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		m_PaketObat paketobatModel = PaketObatService.getPaketObat(id);

		paketobatModel.setPaket_barang_aktif("T");
		paketobatModel.setPakeobat_deleted_date(currentTime);

		PaketObatService.delete(paketobatModel);

		return this.uri;
	}

	@RequestMapping(value = "/form-update", method = RequestMethod.GET)
	public String UpdateFormView(Model model, @RequestParam(value = "Id", required = false) int id) {

		m_PaketObat result = PaketObatService.getPaketObat(id);
		List<m_Kelas> kelas = KelasService.getKelases();

		Map<String, String> jenistindakan = new HashMap<String, String>();
		jenistindakan.put("O", "Operatif");
		jenistindakan.put("N", "Non Operatif");

		model.addAttribute(	"kelas", kelas);
		model.addAttribute("jenistindakan", jenistindakan);

		model.addAttribute("paketobatModel", result);

		return "PaketObatUpdateForm";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Update(@ModelAttribute("paketobatModel") m_PaketObat paketobatModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		paketobatModel.setPaket_barang_aktif("Y");
		paketobatModel.setPaket_barang_updated_by("Admin");
		paketobatModel.setPaket_barang_updated_date(currentTime);

		PaketObatService.update(paketobatModel);

		return this.uri;
	}

}
