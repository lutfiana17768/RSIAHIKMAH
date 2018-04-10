/*
* @Author: PRADESGA
* @Date:   2018-04-07 04:02:55
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-08 19:43:39
*/
package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.TindakanDAO;
import com.rsia.madura.entity.MTindakan;

@Service
public class TindakanServiceAction implements TindakanService {
	@Autowired
	private TindakanDAO tindakanDAO;

	@Override
	@Transactional
	public List<MTindakan> findAll() {
		// TODO Auto-generated method stub
		return this.tindakanDAO.getTindakans();
	}

	@Override
	@Transactional
	public List<MTindakan> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return tindakanDAO.getTindakans(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return tindakanDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MTindakan getById(int id) {
		// TODO Auto-generated method stub
		return tindakanDAO.getTindakan(id);
	}

	@Override
	@Transactional
	public void store(MTindakan data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setTindakan_aktif("Y");
		data.setTindakan_created_by("Admin");	
		data.setTindakan_created_date(currentTime);
		tindakanDAO.TindakanStore(data);
	}

	@Override
	@Transactional
	public void update(MTindakan data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setTindakan_aktif("Y");
		data.setTindakan_updated_by("Admin");
		data.setTindakan_updated_date(currentTime);
		tindakanDAO.TindakanUpdate(data);
	}

	@Override
	@Transactional
	public void delete(MTindakan data) {
		// TODO Auto-generated method stub
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setTindakan_aktif("T");
		data.setTindakan_deleted_by("Admin");
		data.setTindakan_deleted_date(currentTime);
		tindakanDAO.TindakanDelete(data);
	}
}