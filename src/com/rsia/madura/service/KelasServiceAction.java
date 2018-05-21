/*
* @Author: PRADESGA
* @Date:   2018-04-07 04:02:55
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-08 02:35:59
*/
package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.KelasDAO;
import com.rsia.madura.entity.MKelas;

@Service
public class KelasServiceAction implements KelasService {
	@Autowired
	private KelasDAO kelasDAO;

	@Override
	@Transactional
	public List<MKelas> findAll() {
		// TODO Auto-generated method stub
		return this.kelasDAO.getKelases();
	}

	@Override
	@Transactional
	public List<MKelas> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return kelasDAO.getKelases(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return kelasDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MKelas getById(int id) {
		// TODO Auto-generated method stub
		return kelasDAO.getKelas(id);
	}

	@Override
	@Transactional
	public void store(MKelas data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setKelas_aktif("Y");
		data.setKelas_created_by("Admin");	
		data.setKelas_created_date(currentTime);
		kelasDAO.KelasStore(data);
	}

	@Override
	@Transactional
	public void update(MKelas data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setKelas_aktif("Y");
		data.setKelas_updated_by("Admin");
		data.setKelas_updated_date(currentTime);
		kelasDAO.KelasUpdate(data);
	}

	@Override
	@Transactional
	public void delete(MKelas data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setKelas_aktif("T");
		data.setKelas_deleted_by("Admin");
		data.setKelas_deleted_date(currentTime);
		kelasDAO.KelasDelete(data);
	}
}