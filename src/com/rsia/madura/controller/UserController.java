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

import com.rsia.madura.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService UserService;

	private String uri ="redirect: /user";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model) {
		return "user/index";
	}

	@RequestMapping("/tambah")
	public String UserFormView(Model model) {
		MUser userModel = new MUser();
		model.addAttribute("userModel", userModel);
		return "user/tambah";
	}

}