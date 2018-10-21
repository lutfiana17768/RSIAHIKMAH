package com.rsia.madura.controller;

import java.util.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import com.rsia.madura.entity.MBarangHJ;
import com.rsia.madura.entity.MJual;
import com.rsia.madura.entity.MSatuan;
import com.rsia.madura.entity.MPendaftaran;
import com.rsia.madura.entity.MPasien;
import com.rsia.madura.entity.MPegawai;
import com.rsia.madura.service.BarangHJService;
import com.rsia.madura.service.JualService;
import com.rsia.madura.service.SatuanService;
import com.rsia.madura.service.PendaftaranService;
import com.rsia.madura.service.PasienService;
import com.rsia.madura.service.PegawaiService;

@Controller
@RequestMapping("/jual")
public class JualController {
	@Autowired
	private JualService jualService;
	@Autowired
	private BarangHJService barangHJService;
	@Autowired
	private SatuanService satuanService;
	@Autowired
	private PendaftaranService pendaftaranService;
	@Autowired
	private PasienService pasienService;
	@Autowired
	private PegawaiService pegawaiService;

	private String uri = "redirect:/jual";
	
	@RequestMapping(method=RequestMethod.GET)
	public String JualListView(Model model, 
								@RequestParam(value="page", required=false, defaultValue="1") int page, 
								@RequestParam(value="limit", required=false, defaultValue="10") int limit){
		List<MJual> result = jualService.getJuals(page, limit);
		String link = jualService.createLinks(page, limit);
		
		model.addAttribute("result", result);
		model.addAttribute("link", link);
		
		return "/jual/index";
	}
	
	@RequestMapping(value="/tambah")
	public String JualFormAdd(Model model) {
		MJual jualModel = new MJual();
		List<MBarangHJ> resultBarang = barangHJService.getBarangHJs();
		List<MSatuan> resultSatuan = satuanService.getSatuans();
		List<MPendaftaran> resultPendaftaran = pendaftaranService.getPendaftarans();
		List<MPasien> resultPasien = pasienService.findAll();
		List<MPegawai> resultPegawai = pegawaiService.getPegawai();
 		
		model.addAttribute("satuan", resultSatuan);
		model.addAttribute("barang", resultBarang);
		model.addAttribute("pasien", resultPasien);
		model.addAttribute("pendaftaran", resultPendaftaran);
		model.addAttribute("pegawai", resultPegawai);
		model.addAttribute("jualModel", jualModel);
		model.addAttribute("footerjs", "../jual/inc/footerjs.jsp");
		
		return "/jual/tambah";
	}
	
	@RequestMapping(value="/store")
	public String JualStore(@ModelAttribute("jualModel") MJual jualModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		jualModel.setPendaftaran(pendaftaranService.getPendaftaran(jualModel.getJualPendaftaranId()));
		jualModel.setPasien(pasienService.getById(jualModel.getJualPasienId()));
		jualModel.setPegawai(pegawaiService.getPegawai(jualModel.getJualDokterId()));

		jualModel.setJualDiskon(0);
		jualModel.setJualAktif('Y');
		jualModel.setJualCreatedBy("Admin");
		jualModel.setJualStatus('Y');
		jualModel.setJuealCreatedDate(currentTime);
		
		System.out.println(jualModel);
		
		jualService.store(jualModel);
		
		return "redirect:/jual";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String UpdateFormView(Model model, @RequestParam(value = "Id", required = false) int Id) {
		MJual jualModel = jualService.getJual(Id);
		Timestamp tglCreate = jualModel.getJuealCreatedDate();

		List<MBarangHJ> resultBarang = barangHJService.getBarangHJs();
		List<MSatuan> resultSatuan = satuanService.getSatuans();
		List<MPendaftaran> resultPendaftaran = pendaftaranService.getPendaftarans();
		List<MPasien> resultPasien = pasienService.findAll();
		List<MPegawai> resultPegawai = pegawaiService.getPegawai();
 		
		model.addAttribute("satuan", resultSatuan);
		model.addAttribute("barang", resultBarang);
		model.addAttribute("pasien", resultPasien);
		model.addAttribute("pendaftaran", resultPendaftaran);
		model.addAttribute("pegawai", resultPegawai);
		model.addAttribute("jualModel", jualModel);
		model.addAttribute("footerjs", "../jual/inc/footerjs.jsp");
		model.addAttribute("tglCreate", tglCreate);
		
		return "/jual/update";
	}

		@RequestMapping(value="/update")
	public String JualUpdate(@ModelAttribute("jualModel") MJual jualModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		jualModel.setPendaftaran(pendaftaranService.getPendaftaran(jualModel.getJualPendaftaranId()));
		jualModel.setPasien(pasienService.getById(jualModel.getJualPasienId()));
		jualModel.setPegawai(pegawaiService.getPegawai(jualModel.getJualDokterId()));
		
		jualModel.setJualDiskon(0);
		jualModel.setJualAktif('Y');
		jualModel.setJualUpdatedBy("Admin");
		jualModel.setJualStatus('Y');
		jualModel.setJuealUpdatedDate(currentTime);
		
		
		jualService.update(jualModel);
		
		return "redirect:/jual";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @RequestParam(value = "Id", required = false) int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		MJual jualModel = jualService.getJual(id);

		jualModel.setJualAktif('T');
		jualModel.setJuealDeletedDate(currentTime);

		jualService.delete(jualModel);

		return this.uri;
	}

	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }	

}
