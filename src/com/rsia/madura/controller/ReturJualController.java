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

import com.rsia.madura.entity.MBarang;
import com.rsia.madura.entity.MReturJual;
import com.rsia.madura.entity.MSatuan;
import com.rsia.madura.entity.MJual;
import com.rsia.madura.entity.MPasien;

import com.rsia.madura.service.BarangService;
import com.rsia.madura.service.ReturJualService;
import com.rsia.madura.service.SatuanService;
import com.rsia.madura.service.JualService;
import com.rsia.madura.service.PasienService;

@Controller
@RequestMapping("/retur-jual")
public class ReturJualController {
	@Autowired
	private ReturJualService returJualService;
	@Autowired
	private BarangService barangService;
	@Autowired
	private SatuanService satuanService;
	@Autowired
	private PasienService pasienService;
	@Autowired
	private JualService jualService;

	private String uri = "redirect:/returJual";
	
	@RequestMapping(method=RequestMethod.GET)
	public String returJualList(Model model,
								@RequestParam(value="page", required=false, defaultValue="1") int page, 
								@RequestParam(value="limit", required=false, defaultValue="10") int limit){
		List<MReturJual> result = returJualService.getReturJuals(page, limit);
		String link = returJualService.createLinks(page, limit);
		
		model.addAttribute("result", result);
		model.addAttribute("link", link);
		
		return "/returJual/index";
	}
	
	@RequestMapping(value="/tambah")
	public String ReturJualFormAddView(Model model){
		MReturJual returJualModel = new MReturJual();
		List<MBarang> resultBarang = barangService.getBarangs();
		List<MSatuan> resultSatuan = satuanService.getSatuans();
		List<MJual> resultJual = jualService.getJuals();
		List<MPasien> resultPasien = pasienService.findAll();
		
		model.addAttribute("jual", resultJual);
		model.addAttribute("pasien", resultPasien);
		model.addAttribute("returJualModel", returJualModel);
		model.addAttribute("satuan", resultSatuan);
		model.addAttribute("barang", resultBarang);
		model.addAttribute("footerjs", "../returJual/inc/footerjs.jsp");

		
		return "/returJual/tambah";
	}
	
	@RequestMapping(value="/store")
	public String ReturJualStore(@ModelAttribute("returJualModel") MReturJual returJualModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		returJualModel.setJual(jualService.getJual(returJualModel.getReturJualJual()));
		returJualModel.setPasien(pasienService.getById(returJualModel.getReturJualPasienId()));
		returJualModel.setReturJualAktif('Y');
		returJualModel.setReturJualCreatedBy("Admin");
		returJualModel.setReturJualBayarStatus('Y');
		returJualModel.setReturJualStatus('Y');
		returJualModel.setReturJualCreatedDate(currentTime);

		returJualService.store(returJualModel);
		
		return "redirect:/returJual";
	}

	@RequestMapping(value="/edit")
	public String ReturJualFormUpdateView(Model model, @RequestParam(value = "Id", required = false) int id){
		MReturJual returJualModel = returJualService.getReturJual(id);
		List<MBarang> resultBarang = barangService.getBarangs();
		List<MSatuan> resultSatuan = satuanService.getSatuans();

		Timestamp tglCreate = returJualModel.getReturJualCreatedDate();

		List<MJual> resultJual = jualService.getJuals();
		List<MPasien> resultPasien = pasienService.findAll();
		
		model.addAttribute("jual", resultJual);
		model.addAttribute("pasien", resultPasien);
		model.addAttribute("returJualModel", returJualModel);
		model.addAttribute("satuan", resultSatuan);
		model.addAttribute("barang", resultBarang);
		model.addAttribute("footerjs", "../returJual/inc/footerjs.jsp");
		model.addAttribute("tglCreate", tglCreate);

		System.out.println(returJualModel);

		model.addAttribute("returJualModel", returJualModel);

		
		return "/returJual/update";
	}
	
	@RequestMapping(value="/update")
	public String ReturJualUpdate(@ModelAttribute("returJualModel") MReturJual returJualModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		returJualModel.setJual(jualService.getJual(returJualModel.getReturJualJual()));
		returJualModel.setPasien(pasienService.getById(returJualModel.getReturJualPasienId()));
		returJualModel.setReturJualAktif('Y');
		returJualModel.setReturJualUpdatedBy("Admin");
		returJualModel.setReturJualBayarStatus('Y');
		returJualModel.setReturJualStatus('Y');
		returJualModel.setReturJualUpdatedDate(currentTime);

		returJualModel.setReturJualRevised(returJualModel.getReturJualRevised()+1);

		returJualService.update(returJualModel);
		
		return "redirect:/returJual";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @RequestParam(value = "Id", required = false) int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		MReturJual returJualModel = returJualService.getReturJual(id);

		returJualModel.setReturJualAktif('T');
		returJualModel.setReturJualDeletedDate(currentTime);

		returJualService.delete(returJualModel);

		return this.uri;
	}

	 @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
	
	
}
