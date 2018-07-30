package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.ReturBeliDAO;
import com.rsia.madura.entity.MReturBeli;
import com.rsia.madura.entity.MBarang;
import com.rsia.madura.entity.MSatuan;

@Service
public class ReturBeliServiceAction implements ReturBeliService {
	@Autowired
	private ReturBeliDAO returBeliDAO;

	@Autowired
	private BarangService barangService;

	@Autowired
	private SatuanService satuanService;

	MBarang barang;
	MSatuan satuan;
	
	@Override
	@Transactional
	public List<MReturBeli> getReturBelis() {
		
		return returBeliDAO.getReturBelis();
	}

	@Override
	@Transactional
	public List<MReturBeli> getReturBelis(int page, int limit) {

		return returBeliDAO.getReturBelis(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {

		return returBeliDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MReturBeli getReturBeli(int returBeliId) {

		return returBeliDAO.getReturBeli(returBeliId);
	}

	@Override
	@Transactional
	public int store(MReturBeli returBeliModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		if(returBeliModel.getDetail() != null) {
			returBeliModel.getDetail().forEach((detail) ->{
				barang = barangService.getBarang(detail.getReturBeliDetailBarangId());
				satuan = satuanService.getSatuan(detail.getReturBeliDetailSatuanId());

				detail.setBarang(barang);
				detail.setSatuan(satuan);
				detail.setReturBeli(returBeliModel);
				detail.setReturBeliDetailCreatedBy("Admin");
				detail.setReturBeliDetailCreatedDate(currentTime);
			});
		}

		return returBeliDAO.returBeliStore(returBeliModel);
	}

	@Override
	@Transactional
	public int update(MReturBeli returBeliModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		if(returBeliModel.getDetail() != null) {
			returBeliModel.getDetail().forEach((detail) ->{
				barang = barangService.getBarang(detail.getReturBeliDetailBarangId());
				satuan = satuanService.getSatuan(detail.getReturBeliDetailSatuanId());

				detail.setBarang(barang);
				detail.setSatuan(satuan);
				detail.setReturBeli(returBeliModel);
				detail.setReturBeliDetailUpdatedBy("Admin");
				detail.setReturBeliDetailUpdatedDate(currentTime);
			});
		}

		return returBeliDAO.returBeliUpdate(returBeliModel);
	}

	@Override
	@Transactional
	public int delete(MReturBeli returBeliModel) {
		
		return returBeliDAO.returBeliDelete(returBeliModel);
	}

}
