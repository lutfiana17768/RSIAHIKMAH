/*
 * @Author: Pradesga 
 * @Date: 2018-04-14 17:52:41 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-14 17:52:41 
 */
package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import com.rsia.madura.entity.MPasien;
import com.rsia.madura.entity.m_Pendidikan;
import com.rsia.madura.entity.m_Provinsi;
import com.rsia.madura.entity.m_Kota;
import com.rsia.madura.entity.m_Kecamatan;
import com.rsia.madura.entity.m_Kelurahan;
import com.rsia.madura.entity.m_Agama;

import com.rsia.madura.service.NPasienService;
import com.rsia.madura.service.PendidikanService;
import com.rsia.madura.service.ProvinsiService;
import com.rsia.madura.service.KotaService;
import com.rsia.madura.service.KecamatanService;
import com.rsia.madura.service.KelurahanService;
import com.rsia.madura.service.AgamaService;

@Controller
@RequestMapping("/pasien")
public class PasienController {
	@Autowired
	private NPasienService PasienService;
	@Autowired
	private ProvinsiService ProvinsiService;
	@Autowired
	private KotaService KotaService;
	@Autowired
	private KecamatanService KecamatanService;
	@Autowired
	private KelurahanService KelurahanService;
	@Autowired
	private AgamaService AgamaService;
	@Autowired
	private PendidikanService PendidikanService;

	private String uri = "redirect: /pasien";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model) {
		List<MPasien> pasiens = PasienService.getPasien();

		model.addAttribute("pasiens", pasiens);

		return "pasien/index";
	
	}

	@RequestMapping(value = "/tambah", method = RequestMethod.GET)
	public String AddForm(Model model) {

		MPasien pasienModel = new MPasien();
		List<MPasien> pasien = PasienService.getPasien();
		List<m_Provinsi> provinsi = ProvinsiService.getProvinsis();
		List<m_Kota> kota = KotaService.getKotas();
		List<m_Kecamatan> kecamatan = KecamatanService.getKecamatans();
		List<m_Kelurahan> kelurahan = KelurahanService.getKelurahans();
		List<m_Pendidikan> pendidikan = PendidikanService.getPendidikan();

		Map<String, String> jeniskelamin = new HashMap<String, String>();
		jeniskelamin.put("L", "Laki-Laki");
		jeniskelamin.put("P", "Perempuan");

		Map<String, String> goldar = new HashMap<String, String>();
		goldar.put("A", "A");
		goldar.put("AB", "AB");

		Map<String, String> agama = new HashMap<String, String>();
		agama.put("1", "Islam");
		agama.put("2", "Non Islam");

		model.addAttribute("Pasien", pasien);
		model.addAttribute("provinsi", provinsi);
		model.addAttribute("Kota", kota);
		model.addAttribute("Kecamatan", kecamatan);
		model.addAttribute("Kelurahan", kelurahan);
		model.addAttribute("Jeniskelamin", jeniskelamin);
		model.addAttribute("Goldar", goldar);
		model.addAttribute("Agama", agama);
		model.addAttribute("Pendidikan", pendidikan);
		model.addAttribute("pasienModel", pasienModel);
		
		return "pasien/tambah";
	} 
	
	@RequestMapping(value = "/tambahold", method = RequestMethod.GET)
	public String AddFormOld(Model model) {

		MPasien pasienModel = new MPasien();
		List<MPasien> pasien = PasienService.getPasien();
		List<m_Provinsi> provinsi = ProvinsiService.getProvinsis();
		List<m_Kota> kota = KotaService.getKotas();
		List<m_Kecamatan> kecamatan = KecamatanService.getKecamatans();
		List<m_Kelurahan> kelurahan = KelurahanService.getKelurahans();
		List<m_Pendidikan> pendidikan = PendidikanService.getPendidikan();

		Map<String, String> jeniskelamin = new HashMap<String, String>();
		jeniskelamin.put("L", "Laki-Laki");
		jeniskelamin.put("P", "Perempuan");

		Map<String, String> goldar = new HashMap<String, String>();
		goldar.put("A", "A");
		goldar.put("AB", "AB");

		Map<String, String> agama = new HashMap<String, String>();
		agama.put("1", "Islam");
		agama.put("2", "Non Islam");

		model.addAttribute("Pasien", pasien);
		model.addAttribute("provinsi", provinsi);
		model.addAttribute("Kota", kota);
		model.addAttribute("Kecamatan", kecamatan);
		model.addAttribute("Kelurahan", kelurahan);
		model.addAttribute("Jeniskelamin", jeniskelamin);
		model.addAttribute("Goldar", goldar);
		model.addAttribute("Agama", agama);
		model.addAttribute("Pendidikan", pendidikan);
		model.addAttribute("pasienModel", pasienModel);
		
		 // return "v_m_pasien_tambah";
		 return "v_m_pasien_tambah_old";
		// return "v_pendaftaran";
	} 
	
	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public String Store(@ModelAttribute("pasienModel") MPasien pasienModel) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		pasienModel.setPasien_aktif("Y");
		pasienModel.setPasien_created_by("Admin");
		pasienModel.setPasien_created_date(currentTime);
		pasienModel.setM_status_id(1);

		pasienModel.setPasien_tanggallahir(currentTime);

		PasienService.store(pasienModel);

		return this.uri;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @PathVariable int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		MPasien pasienModel = PasienService.getPasien(id);

		pasienModel.setPasien_aktif("T");
		pasienModel.setPasien_deleted_date(currentTime);

		PasienService.delete(pasienModel);

		return this.uri;
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String UpdateFormView(Model model, @PathVariable int id) {
		List<m_Provinsi> provinsi = ProvinsiService.getProvinsis();
		List<m_Kota> kota = KotaService.getKotas();
		List<m_Kecamatan> kecamatan = KecamatanService.getKecamatans();
		List<m_Kelurahan> kelurahan = KelurahanService.getKelurahans();
		List<m_Pendidikan> pendidikan = PendidikanService.getPendidikan();

		Map<String, String> jeniskelamin = new HashMap<String, String>();
		jeniskelamin.put("L", "Laki-Laki");
		jeniskelamin.put("P", "Perempuan");

		Map<String, String> goldar = new HashMap<String, String>();
		goldar.put("A", "A");
		goldar.put("AB", "AB");

		Map<String, String> agama = new HashMap<String, String>();
		agama.put("1", "Islam");
		agama.put("2", "Non Islam");

		model.addAttribute("provinsi", provinsi);
		model.addAttribute("Kota", kota);
		model.addAttribute("Kecamatan", kecamatan);
		model.addAttribute("Kelurahan", kelurahan);
		model.addAttribute("Jeniskelamin", jeniskelamin);
		model.addAttribute("Goldar", goldar);
		model.addAttribute("Agama", agama);
		model.addAttribute("Pendidikan", pendidikan);

		MPasien result = PasienService.getPasien(id);
		model.addAttribute("pasienModel", result);

		return "pasien/update";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String Update(@ModelAttribute("pasienModel") MPasien pasienModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		pasienModel.setPasien_aktif("Y");
		pasienModel.setPasien_updated_by("Admin");
		pasienModel.setPasien_updated_date(currentTime);
		pasienModel.setM_status_id(1);

		pasienModel.setPasien_tanggallahir(currentTime);

		PasienService.update(pasienModel);
		return this.uri;
	}

	@RequestMapping("/todaftar")
	public String toDaftar(Model model) {
		return "v_daftar";
	}

	@RequestMapping("/todaftarrj")
	public String toDaftarRj(Model model) {
		return "v_daftar_rj";
	}

	@RequestMapping("/todaftarrjtambah")
	public String toDaftarRjtambah(Model model) {
		return "v_DaftarRJ_tambah";
	}
}
