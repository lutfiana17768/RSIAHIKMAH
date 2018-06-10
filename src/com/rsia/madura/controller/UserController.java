package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.rsia.madura.entity.MUser;
import com.rsia.madura.entity.MPegawai;

import com.rsia.madura.service.UserService;
import com.rsia.madura.service.PegawaiService;


@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService UserService;

	@Autowired
	private PegawaiService pegawaiService;

	private String uri ="redirect: /user";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model) {
		return "user/index";
	}

	@RequestMapping("/tambah")
	public String UserFormView(Model model) {
		MUser userModel = new MUser();
		List<MPegawai> pegawais = pegawaiService.getPegawai();
		
		model.addAttribute("pegawais", pegawais);
		model.addAttribute("userModel", userModel);
		return "user/tambah";
	}

	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String Store(@ModelAttribute("userModel") MUser userModel) {
		UserService.store(userModel);
		return this.uri;
	}
}