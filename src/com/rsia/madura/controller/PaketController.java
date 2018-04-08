package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.rsia.madura.entity.m_Kelas;
import com.rsia.madura.entity.m_Obat;
import com.rsia.madura.entity.m_Paket;
import com.rsia.madura.entity.m_PaketTindakan;
import com.rsia.madura.entity.m_Ruang;
import com.rsia.madura.entity.m_Tindakan;
import com.rsia.madura.service.KelasService;
import com.rsia.madura.service.ObatService;
import com.rsia.madura.service.PaketService;
import com.rsia.madura.service.RuanganService;
import com.rsia.madura.service.TindakanService;
import com.rsia.madura.service.PaketTindakanService;


@Controller
@RequestMapping("/Paket")
public class PaketController {
	@Autowired
	private PaketService PaketService;

	@Autowired
	private KelasService KelasService;

	@Autowired
	private TindakanService TindakanService;

	@Autowired
	private ObatService ObatService;

	@Autowired
	private PaketTindakanService PaketTindakanService;

	@Autowired
	private RuanganService RuanganService;

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
		List<m_Tindakan> tindakans = TindakanService.getTindakans();
		List<m_Obat> obat = ObatService.getObats();

		List<m_Ruang> ruang = RuanganService.getRuangs();

		Map<String, String> jenispaket = new HashMap<String, String>();
		jenispaket.put("A", "Paket Operatif");
		jenispaket.put("B", "Paket Non Operatif");
		
		//hardcode satuan (belum ada model)
		Map<String, String> satuan = new HashMap<String, String>();
		satuan.put("1", "kilo");
		satuan.put("2", "meter");
		
		model.addAttribute("kelas", kelas);
		model.addAttribute("jenispaket", jenispaket);
		model.addAttribute("tindakans", tindakans);
		model.addAttribute("paketModel", paketModel);
		model.addAttribute("obat", obat);
		model.addAttribute("satuan",satuan);
		model.addAttribute("ruang", ruang);

		return "PaketAddForm";
	}

	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public String Store(@ModelAttribute("paketModel") m_Paket paketModel,
			HttpServletRequest request,
			@RequestParam MultiValueMap<String, String> postparam) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		paketModel.setPaket_aktif("Y");
		paketModel.setPaket_created_by("Admin");
		paketModel.setPaket_created_date(currentTime);
		System.out.println("xxxx");
		List<String> m_tindakan_id = postparam.get("m_tindakan_id[]");
		List<String> paket_tindakan_jumlah = postparam.get("paket_tindakan_jumlah[]");
		List<String> paket_tindakan_harga = postparam.get("paket_tindakan_harga[]");		
				
		PaketService.store(paketModel);
		Integer idPaket = paketModel.getPaket_id();
		Integer idKelas = paketModel.getPaket_kelas();
		Integer i;
		for( i = 0; i < m_tindakan_id.size();i++)
		{
			m_PaketTindakan paketTindakan = new m_PaketTindakan();
			paketTindakan.setM_paket_id(idPaket);
			paketTindakan.setM_kelas_id(idKelas);
			paketTindakan.setM_tindakan_id(Integer.valueOf(m_tindakan_id.get(i)));
			paketTindakan.setPaket_tindakan_jumlah(Integer.valueOf(paket_tindakan_jumlah.get(i)));
			paketTindakan.setPaket_tindakan_harga(paket_tindakan_harga.get(i));
			PaketTindakanService.store(paketTindakan);
		}
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
