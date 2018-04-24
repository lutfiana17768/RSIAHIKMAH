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

import com.rsia.madura.entity.MStokObat;
import com.rsia.madura.service.StokObatService;

@Controller
@RequestMapping("/stokobat")
public class StokObatController{
	@Autowired
	private StokObatService StokObatService;

	private String uri = "redirect: /stokobat";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model) {
	return "stokObat/index";	
}
}
