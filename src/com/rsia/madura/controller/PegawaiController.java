package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rsia.madura.entity.m_Jabatan;
import com.rsia.madura.entity.m_Kota;
import com.rsia.madura.entity.m_Pegawai;
import com.rsia.madura.service.JabatanService;
import com.rsia.madura.service.KotaService;
import com.rsia.madura.service.PegawaiService;
import com.rsia.madura.entity.m_Pendidikan;
import com.rsia.madura.service.PendidikanService;


@Controller
@RequestMapping("/pegawai")
public class PegawaiController {
	@Autowired
	private KotaService kotaService;
	@Autowired
	private PendidikanService pendidikanService;
	@Autowired
	private PegawaiService pegawaiService;
	@Autowired
	private JabatanService jabatanService;
	
	@RequestMapping("/List")
	public String PegawaiListView(Model model) {
		List<m_Pegawai> resultPegawai = pegawaiService.getPegawais();
		model.addAttribute("pegawai", resultPegawai);
		
		return "PegawaiListView";
	}
	
	@RequestMapping("/tambah")
	public String PegawaiAddFormView(Model model){
		List<m_Kota> resultKota = kotaService.getKotas();
		List<m_Pendidikan> resultPendidikan = pendidikanService.getPendidikan();
		List<m_Jabatan> resultJabatan = jabatanService.getJabatans();
		
		m_Pegawai pegawaiModel = new m_Pegawai();
		
		
		model.addAttribute("kota", resultKota);
		model.addAttribute("pendidikan", resultPendidikan);
		model.addAttribute("jabatan", resultJabatan);
		model.addAttribute("pegawaiModel", pegawaiModel);
		
		return "PegawaiAddForm";
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String pegawaiStore(@ModelAttribute("pegawaiModel") m_Pegawai pegawaiModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		pegawaiModel.setPegawaiAktif('Y');
		pegawaiModel.setPegawaiCreatedBy("Admin");
		pegawaiModel.setPegawaiCreatedDate(currentTime);
		
		pegawaiService.store(pegawaiModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/pegawai/List";
	}
	
	@RequestMapping(value="/form-update", method=RequestMethod.GET)
	public String pegawaiFormUpdateView(Model model, @RequestParam("pegawaiId") int pegawaiId) {
		m_Pegawai result = pegawaiService.getPegawai(pegawaiId);
		List<m_Kota> resultKota = kotaService.getKotas();
		List<m_Pendidikan> resultPendidikan = pendidikanService.getPendidikan();
		List<m_Jabatan> resultJabatan = jabatanService.getJabatans();
		
		
		model.addAttribute("kota", resultKota);
		model.addAttribute("pendidikan", resultPendidikan);
		model.addAttribute("jabatan", resultJabatan);
		model.addAttribute("pegawaiModel", result);
		
		return "PegawaiUpdateFormView";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String pegawaiUpdate(@ModelAttribute("pegawaiModel") m_Pegawai pegawaiModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		pegawaiModel.setPegawaiUpdatedBy("Admin");
		pegawaiModel.setPegawaiUpdatedDate(currentTime);
		
		pegawaiService.update(pegawaiModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/pegawai/List";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String pegawaiDelete(@RequestParam("pegawaiId") int pegawaiId) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		m_Pegawai pegawaiModel = pegawaiService.getPegawai(pegawaiId);
		pegawaiModel.setPegawaiAktif('T');
		pegawaiModel.setPegawaiDeletedDate(currentTime);
		
		pegawaiService.delete(pegawaiModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/pegawai/List";
		
	}
}
