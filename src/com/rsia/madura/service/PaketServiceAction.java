/*
* @Author: PRADESGA
* @Date:   2018-04-07 04:02:55
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 11:29:50
*/
package com.rsia.madura.service;

import java.util.List;
import java.util.ArrayList;
import java.sql.Timestamp;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PaketDAO;
import com.rsia.madura.dao.PaketHargaDAO;
import com.rsia.madura.entity.MPaket;
import com.rsia.madura.entity.MPaketHarga;

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

		if (data.getPaketHarga() != null) {
			data.getPaketHarga().forEach((harga) -> {
				harga.setPaket(data);
				harga.setPaketHarga_created_by("Admin");	
				harga.setPaketHarga_created_date(currentTime);
				harga.setPaketHarga_updated_date(currentTime);
			});
		}

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

		if (data.getPaketHarga() != null) {
			// masih error
			// alternative: https://gist.github.com/gtiwari333/8db9d5e4acf3dd17ea9bd65b22735eec
			MPaket oldPaketModel = this.getById(data.getPaket_id());

			data.getPaketHarga().forEach((harga) -> {
				oldPaketModel.getPaketHarga().forEach((oldHarga) -> {
					if (oldHarga.getPaketHarga_id() == harga.getPaketHarga_id()) {
						// update
						
					} else {
						if (harga.getPaketHarga_id() != null) {
							// new
							
						} else {
							// delete
							
						}
					}
				});

				harga.setPaket(data);
				harga.setPaketHarga_updated_date(currentTime);
			});
		}

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