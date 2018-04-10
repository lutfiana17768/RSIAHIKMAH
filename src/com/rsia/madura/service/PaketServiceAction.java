/*
* @Author: PRADESGA
* @Date:   2018-04-07 04:02:55
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 11:29:50
*/
package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PaketDAO;
import com.rsia.madura.entity.MPaket;

@Service
public class PaketServiceAction implements PaketService {
	@Autowired
	private PaketDAO paketDAO;

	@Override
	@Transactional
	public List<MPaket> findAll() {
		// TODO Auto-generated method stub
		return this.paketDAO.getPakets();
	}

	@Override
	@Transactional
	public List<MPaket> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return paketDAO.getPakets(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return paketDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MPaket getById(int id) {
		// TODO Auto-generated method stub
		return paketDAO.getPaket(id);
	}

	@Override
	@Transactional
	public void store(MPaket data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setPaket_aktif("Y");
		data.setPaket_created_by("Admin");	
		data.setPaket_created_date(currentTime);
		paketDAO.PaketStore(data);
	}

	@Override
	@Transactional
	public void update(MPaket data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setPaket_aktif("Y");
		data.setPaket_updated_by("Admin");
		data.setPaket_updated_date(currentTime);
		paketDAO.PaketUpdate(data);
	}

	@Override
	@Transactional
	public void delete(MPaket data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setPaket_aktif("T");
		data.setPaket_deleted_by("Admin");
		data.setPaket_deleted_date(currentTime);
		paketDAO.PaketDelete(data);
	}
}