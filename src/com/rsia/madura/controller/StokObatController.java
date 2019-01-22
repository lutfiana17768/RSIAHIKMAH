package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

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

import com.rsia.madura.entity.MStokObat;
import com.rsia.madura.entity.MKartuStok;

import com.rsia.madura.service.StokObatService;
import com.rsia.madura.service.KartuStokService;

@Controller
@RequestMapping("/stok-obat")
public class StokObatController {
	@Autowired
	private StokObatService stokObatService;

	@Autowired
	private KartuStokService kartuStokService;	

	private String uri = "redirect:/stok-obat";
	
	@RequestMapping(method=RequestMethod.GET, value="/kartustok")
	public String KartuStokFormView(Model model, 
			@RequestParam(value="month", required=false, defaultValue="1") String month,
			@RequestParam(value="year", required=false, defaultValue="2019") String year,
			@RequestParam(value="id", required=false, defaultValue="10") int id){
		
		List<MKartuStok> result = kartuStokService.getKartuStok(month, year, id);
		
		model.addAttribute("result", result);
		
		System.out.println(result);
		return "/stok/kartustok";
	}

	@RequestMapping(method=RequestMethod.GET)
	public String BarangFormView(Model model, 
			@RequestParam(value="page", required=false, defaultValue="1") int page, 
			@RequestParam(value="limit", required=false, defaultValue="10") int limit){
		
		List<MStokObat> result = stokObatService.getStokObats(page, limit);
		String link = stokObatService.createLinks(page, limit);
		
		model.addAttribute("result", result);
		model.addAttribute("link", link);
		
		System.out.println(result);
		return "/stok/index";
	}

	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
