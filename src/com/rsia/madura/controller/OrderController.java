package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rsia.madura.entity.MPegawai;
import com.rsia.madura.entity.MBarang;
import com.rsia.madura.entity.MJenisBarang;
import com.rsia.madura.entity.MPerusahaan;
import com.rsia.madura.entity.MSatuan;
import com.rsia.madura.entity.MOrder;
import com.rsia.madura.entity.MOrderDetail;
import com.rsia.madura.service.BarangService;
import com.rsia.madura.service.JenisBarangService;
import com.rsia.madura.service.OrderService;
import com.rsia.madura.service.PegawaiService;
import com.rsia.madura.service.PerusahaanService;
import com.rsia.madura.service.SatuanService;
import com.rsia.madura.service.OrderDetailService;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderService;
	@Autowired
	private JenisBarangService JBService;
	@Autowired
	private PerusahaanService perusahaanService;
	@Autowired
	private PegawaiService pegawaiService;
	@Autowired
	private BarangService barangService;
	@Autowired
	private SatuanService satuanService;
	@Autowired
	private OrderDetailService orderDetailService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String OrderListView(Model model){
		List<MOrder> result = orderService.getOrders();
		
		model.addAttribute("order", result);
		
		return "/order/index";
	}
	
	@RequestMapping(value="/form-add")
	public String OrderFormAddView(Model model){
		MOrder orderModel = new MOrder();
		List<MPerusahaan> resultPerusahaan = perusahaanService.getPerusahaans();
		List<MJenisBarang> resultJenisBarang = JBService.getJenisBarangs();
		List<MBarang> resultBarang = barangService.getBarangs();
		List<MPegawai> resultPegawai = pegawaiService.getPegawai();
		List<MSatuan> resultSatuan = satuanService.getSatuans();
		List<MOrderDetail> resultDetail = orderDetailService.where("orderDetailOrderId", "1");
		
		model.addAttribute("orderModel", orderModel);
		model.addAttribute("perusahaan", resultPerusahaan);
		model.addAttribute("jenisBarang", resultJenisBarang);
		model.addAttribute("pegawai", resultPegawai);
		model.addAttribute("satuan", resultSatuan);
		model.addAttribute("barang", resultBarang);
		model.addAttribute("detail", resultDetail);
		model.addAttribute("footerjs", "../order/inc/footerjs.jsp");
		
		return "order/tambah";
	}
	
	@RequestMapping(value="/store")
	public String OrderStore(@ModelAttribute("orderModel") MOrder orderModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		orderModel.setOrderDiskon(0);
		orderModel.setOrderJumlahBayar(100000);
		orderModel.setOrderStatus("Aktif");
		orderModel.setOrderBarangJenisId(1);
		orderModel.setOrderBarangJenis("Tes");
		orderModel.setOrderTanggal(currentTime);
		orderModel.setOrderTtdJabatanNama("Dokter");
		orderModel.setOrderTtdNip("112233");
		orderModel.setOrderAktif('Y');
		orderModel.setOrderCreatedBy("Admin");
		orderModel.setOrderCreatedDate(currentTime);
		
		orderDetailService.updateOrderId(orderService.store(orderModel));
		
		return "redirect:/order/list";
	}

}
