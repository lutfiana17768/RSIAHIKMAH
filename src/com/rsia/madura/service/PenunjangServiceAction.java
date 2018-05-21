/*
* @Author: PRADESGA
* @Date:   2018-04-07 04:02:55
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-19 13:24:07
*/
package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PenunjangDAO;
import com.rsia.madura.entity.MPenunjang;

@Service
public class PenunjangServiceAction implements PenunjangService {
	@Autowired
	private PenunjangDAO penunjangDAO;

	@Override
	@Transactional
	public List<MPenunjang> findAll() {
		// TODO Auto-generated method stub
		return this.penunjangDAO.getPenunjangs();
	}

	@Override
	@Transactional
	public List<MPenunjang> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return penunjangDAO.getPenunjangs(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return penunjangDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MPenunjang getById(int id) {
		// TODO Auto-generated method stub
		return penunjangDAO.getPenunjang(id);
	}

	@Override
	@Transactional
	public void store(MPenunjang data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setPenunjangmedis_aktif("Y");
		data.setPenunjangmedis_created_by("Admin");	
		data.setPenunjangmedis_created_date(currentTime);
		if (data.getParamperiksa() != null) {
			data.getParamperiksa().forEach((paramperiksa) -> {
				paramperiksa.setPenunjang(data);
				paramperiksa.setParamperiksa_aktif("Y");
				paramperiksa.setParamperiksa_created_by("Admin");
				paramperiksa.setParamperiksa_created_date(currentTime);
			});
		}
		
		if (data.getPenunjangkelas() != null) {
			data.getPenunjangkelas().forEach((penunjangkelas) -> {
				penunjangkelas.setPenunjang(data);
			});
		}
		System.out.println("==========");
		System.out.println("test=test");
		System.out.println(data.toString());
		System.out.println("test=test");
		System.out.println("==========");
		penunjangDAO.PenunjangStore(data);
	}

	@Override
	@Transactional
	public void update(MPenunjang data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setPenunjangmedis_aktif("Y");
		data.setPenunjangmedis_updated_by("Admin");
		data.setPenunjangmedis_updated_date(currentTime);

		if (data.getParamperiksa() != null) {
			data.getParamperiksa().forEach((paramperiksa) -> {
				paramperiksa.setPenunjang(data);
				paramperiksa.setParamperiksa_updated_by("Admin");
				paramperiksa.setParamperiksa_updated_date(currentTime);
			});
		}

		if (data.getPenunjangkelas() != null) {
			data.getPenunjangkelas().forEach((penunjangkelas) -> {
				penunjangkelas.setPenunjang(data);
			});
		}

		penunjangDAO.PenunjangUpdate(data);
	}

	@Override
	@Transactional
	public void delete(MPenunjang data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setPenunjangmedis_aktif("T");
		data.setPenunjangmedis_deleted_by("Admin");
		data.setPenunjangmedis_deleted_date(currentTime);
		penunjangDAO.PenunjangDelete(data);
	}
}