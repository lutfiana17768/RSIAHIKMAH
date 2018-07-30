package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.JualDAO;
import com.rsia.madura.entity.MJual;
import com.rsia.madura.entity.MBarang;
import com.rsia.madura.entity.MSatuan;

@Service
public class JualServiceAction implements JualService {
	@Autowired
	private JualDAO jualDAO;

	@Autowired
	private BarangService barangService;

	@Autowired
	private SatuanService satuanService;

	MBarang barang;
	MSatuan satuan;
	
	@Override
	@Transactional
	public List<MJual> getJuals() {
		
		return jualDAO.getJuals();
	}

	@Override
	@Transactional
	public List<MJual> getJuals(int page, int limit) {
		
		return jualDAO.getJuals(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return jualDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MJual getJual(int jualId) {
		
		return jualDAO.getJual(jualId);
	}

	@Override
	@Transactional
	public int store(MJual jualModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		if(jualModel.getDetail() != null) {
			jualModel.getDetail().forEach((detail) ->{
				barang = barangService.getBarang(detail.getJualDetailBarangId());
				satuan = satuanService.getSatuan(detail.getJualDetailSatuanId());

				detail.setBarang(barang);
				detail.setSatuan(satuan);

				detail.setJual(jualModel);
				detail.setJualDetailCreatedBy("Admin");
				detail.setJualDetailPaket('N');
				detail.setJualDetailCreatedDate(currentTime);
			});
		}
		
		return jualDAO.jualStore(jualModel);
	}

	@Override
	@Transactional
	public int update(MJual jualModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		if(jualModel.getDetail() != null) {
			jualModel.getDetail().forEach((detail) ->{
				barang = barangService.getBarang(detail.getJualDetailBarangId());
				satuan = satuanService.getSatuan(detail.getJualDetailSatuanId());

				detail.setBarang(barang);
				detail.setSatuan(satuan);

				detail.setJual(jualModel);
				detail.setJualDetailCreatedBy("Admin");
				detail.setJualDetailPaket('N');
				detail.setJualDetailCreatedDate(currentTime);
			});
		}
		
		return jualDAO.jualUpdate(jualModel);
	}

	@Override
	@Transactional
	public int delete(MJual jualModel) {

		return jualDAO.jualDelete(jualModel);
	}

}
