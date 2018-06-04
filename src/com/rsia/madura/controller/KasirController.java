/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:50:32 
 * @Last Modified by: Pradesga
 * @Last Modified time: 2018-04-15 13:56:20
 */
package com.rsia.madura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import java.sql.Timestamp;

import com.rsia.madura.entity.MTransaksiPasien;
import com.rsia.madura.entity.MPendaftaran;
import com.rsia.madura.service.TransaksiPasienService;
import com.rsia.madura.service.PendaftaranService;


@Controller
@RequestMapping("/kasir")
public class KasirController {
	
	@Autowired
	private TransaksiPasienService transaksiService;

	@Autowired
	private PendaftaranService pendaftaranService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String Index(Model model, 
			@RequestParam(value="page", required=false, defaultValue = "1") int page, 
			@RequestParam(value="limit", required=false, defaultValue = "10") int limit){
		
		List<MTransaksiPasien> transaksies = transaksiService.findAll();
		model.addAttribute("transaksies", transaksies);
		return "kasir/index";
	}

	@RequestMapping(value="/pembayaran", method=RequestMethod.GET)
	public String TransaksiPasienFormView(Model model, @RequestParam(value="pendaftaran", required=false) Integer daftarID){

		MTransaksiPasien transaksiModel = new MTransaksiPasien();
		MPendaftaran daftar = pendaftaranService.getPendaftaran(daftarID);
		
		model.addAttribute("daftar", daftar);
		model.addAttribute("transaksiModel", transaksiModel);
		model.addAttribute("footerjs", "../kasir/inc/footerjs.jsp");
		
		return "kasir/tambah";
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String transaksiStore(@ModelAttribute("transaksiModel") MTransaksiPasien transaksiModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		transaksiModel.setTransaksiAktif("Y");
		transaksiModel.setTransaksiCreatedBy("Admin");
		transaksiModel.setTransaksiCreatedDate(currentTime);
		
		transaksiService.store(transaksiModel);
		
		return "redirect: /kasir";
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String TransaksiPasienUpdateFormView(Model model, @PathVariable int id){
		MTransaksiPasien result = transaksiService.getTransaksiPasien(id);
		
		model.addAttribute("transaksiModel", result);
		
		return "kasir/update";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String transaksiUpdate(@ModelAttribute("transaksiModel") MTransaksiPasien transaksiModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		transaksiModel.setTransaksiUpdatedBy("Admin");
		transaksiModel.setTransaksiUpdatedDate(currentTime);
		
		transaksiService.update(transaksiModel);
		
		return "redirect: /kasir";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String transaksiUpdate(Model model, @PathVariable int id) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		MTransaksiPasien transaksiModel = transaksiService.getTransaksiPasien(id);
		
		transaksiModel.setTransaksiAktif("T");
		
		transaksiService.delete(transaksiModel);
		
		return "redirect: /kasir";
	}

}
