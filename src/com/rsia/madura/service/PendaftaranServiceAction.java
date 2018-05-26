/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-18 10:05:20
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-26 14:34:40
*/
package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.MPendaftaran;
import com.rsia.madura.entity.MPasien;
import com.rsia.madura.dao.PendaftaranDAO;
import com.rsia.madura.service.PasienService;

 

@Service
public class PendaftaranServiceAction implements PendaftaranService{
	@Autowired
	private PendaftaranDAO PendaftaranDAO;
	@Autowired
	private PasienService pasienService;

	@Override
	@Transactional
	public List<MPendaftaran> getPendaftarans() {
		// TODO Auto-generated method stub
		return PendaftaranDAO.getPendaftarans();
	}

	@Override
	@Transactional
	public List<MPendaftaran> getPendaftarans(int page, int limit) {
		// TODO Auto-generated method stub
		return PendaftaranDAO.getPendaftarans(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return PendaftaranDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MPendaftaran getPendaftaran(int id) {
		// TODO Auto-generated method stub
		return PendaftaranDAO.getPendaftaran(id);
	}

	@Override
	@Transactional
	public void store(MPendaftaran data) {
		
		PendaftaranDAO.PendaftaranStore(data);
		
	}

	@Override
	@Transactional
	public void update(MPendaftaran data) {
		// TODO Auto-generated method stub
		if (data.getRiwayatperiksa() != null) {
			data.getRiwayatperiksa().forEach((riwayatperiksa) -> {
				riwayatperiksa.setPendaftaran(data);
			});
		}
		if (data.getPeriksapasien() != null) {
			data.getPeriksapasien().forEach((periksapasien) -> {
				periksapasien.setPendaftaran(data);
			});
		}

		if (data.getDiagnosapasien() != null) {
			data.getDiagnosapasien().forEach((diagnosapasien) -> {
				diagnosapasien.setPendaftaran(data);
			});
		}

		if (data.getTindakanpasien() != null) {
			data.getTindakanpasien().forEach((tindakanpasien) -> {
				tindakanpasien.setPendaftaran(data);
			});
		}

		if (data.getDiagnosa9() != null) {
			data.getDiagnosa9().forEach((diagnosa9) -> {
				diagnosa9.setPendaftaran(data);
			});
		}

		if (data.getPakai() != null) {
			data.getPakai().forEach((pakai) -> {
				pakai.setPendaftaran(data);
			});
		}
		if (data.getResep() != null) {
			data.getResep().forEach((resep) -> {
				resep.setPendaftaran(data);
			});
		}

		if (data.getPenunjangtrans() != null) {
			data.getPenunjangtrans().forEach((penunjangtrans) -> {
				penunjangtrans.setPendaftaran(data);
			});
		}
		if (data.getSoap() != null) {
			data.getSoap().forEach((soap) -> {
				soap.setPendaftaran(data);
			});
		}
		PendaftaranDAO.PendaftaranUpdate(data);
		
	}

	@Override
	@Transactional
	public void delete(MPendaftaran data) {
		// TODO Auto-generated method stub
		PendaftaranDAO.PendaftaranDelete(data);
	}
}