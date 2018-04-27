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

import com.rsia.madura.dao.PaketHargaDAO;
import com.rsia.madura.entity.MPaketHarga;

@Service
public class PaketHargaServiceAction implements PaketHargaService {
	@Autowired
	private PaketHargaDAO paketHargaDAO;

	@Override
	@Transactional
	public List<MPaketHarga> findAll() {
		// TODO Auto-generated method stub
		return this.paketHargaDAO.getPaketHargas();
	}

	@Override
	@Transactional
	public List<MPaketHarga> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return paketHargaDAO.getPaketHargas(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return paketHargaDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MPaketHarga getById(int id) {
		// TODO Auto-generated method stub
		return paketHargaDAO.getPaketHarga(id);
	}

	@Override
	@Transactional
	public void store(MPaketHarga data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setPaketHarga_created_date(currentTime);
		paketHargaDAO.PaketHargaStore(data);
	}

	@Override
	@Transactional
	public void update(MPaketHarga data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setPaketHarga_updated_date(currentTime);
		paketHargaDAO.PaketHargaUpdate(data);
	}

	@Override
	@Transactional
	public void delete(MPaketHarga data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		paketHargaDAO.PaketHargaDelete(data);
	}
}