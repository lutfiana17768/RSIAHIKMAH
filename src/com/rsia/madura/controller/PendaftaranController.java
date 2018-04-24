// package com.rsia.madura.controller;

// import java.sql.Timestamp;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;

// import com.rsia.madura.entity.MPendaftaran;
// import com.rsia.madura.service.PendaftaranService;

// @Controller
// @RequestMapping("/pendaftaran")
// public class NPendaftaranController{
// 	@Autowired
// 	private PendaftaranService PendaftaranService;

// 	private String uri = "redirect: /pendaftaran";

// 	@RequestMapping(method=RequestMethod.GET)
// 	public String IndexView(Model model) {
// 	return "pendaftaran/index";	
// }
// }
