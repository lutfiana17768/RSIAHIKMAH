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
import com.rsia.madura.entity.MReturBeli;
import com.rsia.madura.entity.MReturBeliDetail;
import com.rsia.madura.entity.MSatuan;
import com.rsia.madura.service.BarangService;
import com.rsia.madura.service.ReturBeliService;
import com.rsia.madura.service.SatuanService;

@Controller
@RequestMapping("/retur-beli")
public class ReturBeliController {
	@Autowired
	private ReturBeliService returBeliService;
	@Autowired
	private BarangService barangService;
	@Autowired
	private SatuanService satuanService;

	private String uri = "redirect:/retur-beli";
	
	@RequestMapping(method=RequestMethod.GET)
	public String returBeliList(Model model,
								@RequestParam(value="page", required=false, defaultValue="1") int page, 
								@RequestParam(value="limit", required=false, defaultValue="10") int limit){

		List<MReturBeli> result = returBeliService.getReturBelis();
		String link = returBeliService.createLinks(page, limit);
		
		model.addAttribute("result", result);
		model.addAttribute("link", link);
		
		return "/retur-beli/index";
	}
	
	@RequestMapping(value="/form-add")
	public String ReturBeliFormAddView(Model model){
		MReturBeli returBeliModel = new MReturBeli();
		List<MBarang> resultBarang = barangService.getBarangs();
		List<MSatuan> resultSatuan = satuanService.getSatuans();
		
		
		model.addAttribute("returBeliModel", returBeliModel);
		model.addAttribute("satuan", resultSatuan);
		model.addAttribute("barang", resultBarang);
		model.addAttribute("footerjs", "../retur-beli/inc/footerjs.jsp");
		
		return "/retur-beli/tambah";
	}
	
	@RequestMapping(value="/store")
	public String ReturBeliStore(@ModelAttribute("returBeliModel") MReturBeli returBeliModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		returBeliModel.setReturBeliAktif('Y');
		returBeliModel.setReturBeliCreatedBy("Admin");
		returBeliModel.setReturBeliCreatedDate(currentTime);
	
		
		returBeliService.store(returBeliModel);
		
		return "redirect:/returBeli";
	}

	@RequestMapping(value="/edit")
	public String ReturBeliFormAddView(Model model, @RequestParam(value = "Id", required = false) int id){
		MReturBeli returBeliModel = returBeliService.getReturBeli(id);

		System.out.println(returBeliModel);

		List<MBarang> resultBarang = barangService.getBarangs();
		List<MSatuan> resultSatuan = satuanService.getSatuans();
		
		Timestamp tglCreate = returBeliModel.getReturBeliCreatedDate();
		List<MReturBeliDetail> detail = returBeliModel.getDetail();
		
		model.addAttribute("returBeliModel", returBeliModel);
		model.addAttribute("satuan", resultSatuan);
		model.addAttribute("barang", resultBarang);
		model.addAttribute("detail", detail);
		model.addAttribute("footerjs", "../retur-beli/inc/footerjs.jsp");

		model.addAttribute("tglCreate", tglCreate);
		
		return "/retur-beli/update";
	}

	@RequestMapping(value="/update")
	public String ReturBeliUpdate(@ModelAttribute("returBeliModel") MReturBeli returBeliModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		returBeliModel.setReturBeliAktif('Y');
		returBeliModel.setReturBeliUpdatedBy("Admin");
		returBeliModel.setReturBeliUpdatedDate(currentTime);
		returBeliModel.setReturBeliRevised(returBeliModel.getReturBeliRevised()+1);
	
		
		returBeliService.update(returBeliModel);
		
		return "redirect:/returBeli";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @RequestParam(value = "Id", required = false) int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		MReturBeli returBeliModel = returBeliService.getReturBeli(id);

		returBeliModel.setReturBeliAktif('T');
		returBeliModel.setReturBeliDeletedDate(currentTime);

		returBeliService.delete(returBeliModel);

		return this.uri;
	}

	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }	
	
	
}
