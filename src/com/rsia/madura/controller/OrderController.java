package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rsia.madura.entity.getPegawai;
import com.rsia.madura.entity.m_Barang;
import com.rsia.madura.entity.m_JenisBarang;
import com.rsia.madura.entity.m_Perusahaan;
import com.rsia.madura.entity.m_Satuan;
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
	
	@RequestMapping(value="/list")
	public String OrderListView(Model model){
		List<MOrder> result = orderService.getOrders();
		
		model.addAttribute("order", result);
		
		return "/order/index";
	}
	
	@RequestMapping(value="/form-add")
	public String OrderFormAddView(Model model){
		MOrder orderModel = new MOrder();
		List<m_Perusahaan> resultPerusahaan = perusahaanService.getPerusahaans();
		List<m_JenisBarang> resultJenisBarang = JBService.getJenisBarangs();
		List<m_Barang> resultBarang = barangService.getBarangs();
		List<getPegawai> resultPegawai = pegawaiService.getPegawais();
		List<m_Satuan> resultSatuan = satuanService.getSatuans();
		List<MOrderDetail> resultDetail = orderDetailService.where("orderDetailOrderId", "1");
		
		model.addAttribute("orderModel", orderModel);
		model.addAttribute("perusahaan", resultPerusahaan);
		model.addAttribute("jenisBarang", resultJenisBarang);
		model.addAttribute("pegawai", resultPegawai);
		model.addAttribute("satuan", resultSatuan);
		model.addAttribute("barang", resultBarang);
		model.addAttribute("detail", resultDetail);
		
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
		
		return "redirect:http://localhost:8080/com.rsia.modura/order/list";
	}

}
