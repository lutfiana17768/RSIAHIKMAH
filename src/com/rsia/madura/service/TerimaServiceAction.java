package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.TerimaDAO;
import com.rsia.madura.entity.MTerima;
import com.rsia.madura.entity.MBarang;
import com.rsia.madura.entity.MSatuan;

@Service
public class TerimaServiceAction implements TerimaService {
	@Autowired
	private TerimaDAO terimaDAO;

	@Autowired
	private BarangService barangService;

	@Autowired
	private SatuanService satuanService;

	MBarang barang;
	MSatuan satuan;
	
	@Override
	@Transactional
	public List<MTerima> getTerimas() {

		return terimaDAO.getTerimas();
	}

	@Override
	@Transactional
	public List<MTerima> getTerimas(int page, int limit) {

		return terimaDAO.getTerimas(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {

		return terimaDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MTerima getTerima(int terimaId) {



		return terimaDAO.getTerima(terimaId);
	}

	@Override
	@Transactional
	public int store(MTerima terimaModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		if(terimaModel.getDetail() != null) {
			terimaModel.getDetail().forEach((detail) ->{
				barang = barangService.getBarang(detail.getTerimaDetailBarangId());
				satuan = satuanService.getSatuan(detail.getTerimaDetailSatuan());

				detail.setBarang(barang);
				detail.setSatuan(satuan);
				detail.setTerima(terimaModel);
				detail.setTerimaDetailCreatedBy("Admin");
				detail.setTerimaDetailCreatedDate(currentTime);
			});
		}

		return terimaDAO.terimaStore(terimaModel);
	}

	@Override
	@Transactional
	public int update(MTerima terimaModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		if(terimaModel.getDetail() != null) {
			terimaModel.getDetail().forEach((detail) ->{
				barang = barangService.getBarang(detail.getTerimaDetailBarangId());
				satuan = satuanService.getSatuan(detail.getTerimaDetailSatuan());

				detail.setBarang(barang);
				detail.setSatuan(satuan);
				detail.setTerima(terimaModel);
				detail.setTerimaDetailUpdatedBy("Admin");
				detail.setTerimaDetailUpdatedDate(currentTime);
			});
		}

		return terimaDAO.terimaUpdate(terimaModel);
	}

	@Override
	public int delete(MTerima terimaModel) {

		return terimaDAO.terimaDelete(terimaModel);
	}

}
