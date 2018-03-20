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

import com.rsia.madura.entity.m_Kota;
import com.rsia.madura.entity.m_Provinsi;
import com.rsia.madura.service.KotaService;
import com.rsia.madura.service.ProvinsiService;

@Controller
@RequestMapping("/kota")
public class KotaController {
		
		@Autowired
		private KotaService kotaService;
		@Autowired
		private ProvinsiService provinsiService;
		
		@RequestMapping(value="/tambah", method=RequestMethod.GET)
		public String KotaFormView(Model model, @RequestParam(value="page", required=false) int page, 
				@RequestParam(value="limit", required=false) int limit){
		
			List<m_Kota> resultKota = kotaService.getKotas(page, limit);
			List<m_Provinsi> resultProvinsi = provinsiService.getProvinsis();
			String links = kotaService.createLinks(page, limit);
			m_Kota kotaModel = new m_Kota();
			
			model.addAttribute("kota", resultKota);
			model.addAttribute("provinsi", resultProvinsi);
			model.addAttribute("link", links);
			model.addAttribute("kotaModel", kotaModel);

			return "WilayahKotaAddForm";
		}
		
		@RequestMapping(value="/store", method=RequestMethod.POST)
		public String kotaStore(@ModelAttribute("kotaModel") m_Kota kotaModel) {
			
			Timestamp currentTime = new Timestamp(System.currentTimeMillis());
			
			kotaModel.setkotaAktif("Y");
			kotaModel.setkotaCreatedBy("Rizki");
			kotaModel.setkotaCreatedDate(currentTime);
			
			kotaService.store(kotaModel);
			
			return "redirect:http://localhost:8080/com.rsia.modura/kota/tambah/?page=1&limit=10";
		}
		
		@RequestMapping(value="/form-update", method=RequestMethod.GET)
		public String kotaUpdateFormView(Model model, @RequestParam(value="kotaId", required=false) int kotaId){
			m_Kota result = kotaService.getKota(kotaId);
			List<m_Provinsi> resultProvinsi = provinsiService.getProvinsis();
			
			model.addAttribute("kotaModel", result);
			model.addAttribute("provinsi", resultProvinsi);
			
			return "WilayahKotaUpdateForm";
		}
		
		@RequestMapping(value="/update", method=RequestMethod.POST)
		public String kotaUpdate(@ModelAttribute("kotaModel") m_Kota kotaModel) {
			
			Timestamp currentTime = new Timestamp(System.currentTimeMillis());
			
			kotaModel.setkotaUpdatedBy("Rizki");
			kotaModel.setkotaUpdatedDate(currentTime);
			
			kotaService.update(kotaModel);
			
			return "redirect:http://localhost:8080/com.rsia.modura/kota/tambah/?page=1&limit=10";
		}
		
		@RequestMapping(value="/delete", method=RequestMethod.GET)
		public String kotaDelete(Model model, @RequestParam(value="kotaId", required=false) int kotaId) {
			
			Timestamp currentTime = new Timestamp(System.currentTimeMillis());
			
			m_Kota kotaModel = kotaService.getKota(kotaId);
			kotaModel.setkotaAktif("T");
			kotaModel.setkotadeletedDate(currentTime);
			
			kotaService.delete(kotaModel);
			
			return "redirect:http://localhost:8080/com.rsia.modura/kota/tambah/?page=1&limit=10";
		}
}
