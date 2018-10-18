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

import com.rsia.madura.entity.MBarangHJ;

import com.rsia.madura.service.BarangHJService;

@Controller
@RequestMapping("/hj")
public class HJController {
	@Autowired
	private BarangHJService barangHJService;

	private String uri = "redirect:/hj";
	
	@RequestMapping(method=RequestMethod.GET)
	public String BarangFormView(Model model, 
			@RequestParam(value="page", required=false, defaultValue="1") int page, 
			@RequestParam(value="limit", required=false, defaultValue="10") int limit){
		
		List<MBarangHJ> result = barangHJService.getBarangHJs(page, limit);
		String link = barangHJService.createLinks(page, limit);
		
		model.addAttribute("result", result);
		model.addAttribute("link", link);
		
		System.out.println(result);
		return "/hj/index";
	}

	@RequestMapping(value="/form-update/{id}")
	public String BarangFormUpdateView(Model model, @PathVariable int id){
		MBarangHJ barangHJModel = barangHJService.getBarangHJ(id);
		
		Timestamp tglBuat = barangHJModel.getBarangHJCreatedDate();

		model.addAttribute("barangHJModel", barangHJModel);
		model.addAttribute("tgl", tglBuat);
		model.addAttribute("footerjs", "../hj/inc/footerjs.jsp");
		
		return "/hj/update";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String barangUpdate(@ModelAttribute("barangHJModel") MBarangHJ barangHJModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		barangHJModel.setBarangHJUpdatedDate(currentTime);
		barangHJModel.setBarangHJUpdatedBy("Admin");
		barangHJModel.setBarangHJRevised(barangHJModel.getBarangHJRevised()+1);
		
		barangHJService.update(barangHJModel);
		
		return this.uri;
	}

	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
