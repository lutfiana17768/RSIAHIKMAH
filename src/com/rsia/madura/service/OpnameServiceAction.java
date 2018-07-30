package com.rsia.madura.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.OpnameDAO;
import com.rsia.madura.entity.MOpname;
import com.rsia.madura.entity.MBarang;
import com.rsia.madura.entity.MSatuan;

@Service
public class OpnameServiceAction implements OpnameService {
	@Autowired
	private OpnameDAO opnameDAO;

	@Autowired
	private BarangService barangService;

	@Autowired
	private SatuanService satuanService;

	MBarang barang;
	MSatuan satuan;
	
	@Override
	@Transactional
	public List<MOpname> getOpnames() {

		return opnameDAO.getOpnames();
	}

	@Override
	@Transactional
	public List<MOpname> getOpnames(int page, int limit) {

		return opnameDAO.getOpnames(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {

		return opnameDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MOpname getOpname(int opnameId) {

		return opnameDAO.getOpname(opnameId);
	}

	@Override
	@Transactional
	public int store(MOpname opnameModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		if(opnameModel.getDetail() != null) {
			opnameModel.getDetail().forEach((detail) ->{
				barang = barangService.getBarang(detail.getOpnameDetailBarangId());
				satuan = satuanService.getSatuan(detail.getOpnameDetailSatuanId());

				detail.setBarang(barang);
				detail.setSatuan(satuan);
				detail.setOpname(opnameModel);
				detail.setOpnameDetailCreatedBy("Admin");
				detail.setOpnameDetailCreatedDate(currentTime);
			});
		}
		
		return opnameDAO.opnameStore(opnameModel);
	}

	@Override
	@Transactional
	public int update(MOpname opnameModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		if(opnameModel.getDetail() != null) {
			opnameModel.getDetail().forEach((detail) ->{
				barang = barangService.getBarang(detail.getOpnameDetailBarangId());
				satuan = satuanService.getSatuan(detail.getOpnameDetailSatuanId());

				detail.setBarang(barang);
				detail.setSatuan(satuan);
				detail.setOpname(opnameModel);
				detail.setOpnameDetailUpdatedBy("Admin");
				detail.setOpnameDetailUpdatedDate(currentTime);
			});
		}

		return opnameDAO.opnameUpdate(opnameModel);
	}

	@Override
	@Transactional
	public int delete(MOpname opnameModel) {

		return opnameDAO.opnameDelete(opnameModel);
	}

}
