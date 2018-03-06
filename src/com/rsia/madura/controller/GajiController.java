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

import com.rsia.madura.entity.m_Pegawai;
import com.rsia.madura.entity.t_Gaji;
import com.rsia.madura.service.GajiService;
import com.rsia.madura.service.PegawaiService;

@Controller
@RequestMapping("/gaji")
public class GajiController {
	@Autowired
	private GajiService gajiService;
	@Autowired
	private PegawaiService pegawaiService;
	
	@RequestMapping("/list")
	public String GajiListView(Model model) {
		List<t_Gaji> result = gajiService.getGajis();
		
		model.addAttribute("gaji", result);
		
		return "GajiListView";
	}
	
	@RequestMapping("/form-add")
	public String GajiFormAddView(Model model) {
		t_Gaji gajiModel = new t_Gaji();
		List<m_Pegawai> resultPegawai = pegawaiService.getPegawais();
		
		model.addAttribute("gajiModel", gajiModel);
		model.addAttribute("pegawai", resultPegawai);
		
		return "GajiAddForm";
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String GajiStore(@ModelAttribute("gajiModel") t_Gaji gajiModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		gajiModel.setGajiAktif('Y');
		gajiModel.setGajiCreatedBy("Admin");
		gajiModel.setGajiCreatedDate(currentTime);
		gajiService.getTotal(gajiModel);
		
		gajiService.store(gajiModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/gaji/list";
	}
	
	@RequestMapping(value="/form-update", method=RequestMethod.GET)
	public String GajiFormUpdateView(Model model, @RequestParam("gajiId") int gajiId) {
		t_Gaji gajiModel = gajiService.getGaji(gajiId);
		List<m_Pegawai> resultPegawai = pegawaiService.getPegawais();
		
		model.addAttribute("gajiModel", gajiModel);
		model.addAttribute("pegawai", resultPegawai);
		
		return "GajiUpdateForm";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String GajiUpdate(@ModelAttribute("gajiModel") t_Gaji gajiModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		System.out.println(gajiModel.toString());
		gajiModel.setGajiUpdatedBy("Admin");
		gajiModel.setGajiUpdatedDate(currentTime);
		gajiService.getTotal(gajiModel);
		
		gajiService.update(gajiModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/gaji/list";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String GajiDelete(@RequestParam("gajiId") int gajiId) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		t_Gaji gajiModel = gajiService.getGaji(gajiId);
		
		gajiModel.setGajiDeletedDate(currentTime);
		gajiModel.setGajiAktif('T');
		
		gajiService.delete(gajiModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/gaji/list";
	}
}
