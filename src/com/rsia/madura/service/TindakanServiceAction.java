package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.m_Tindakan;
import com.rsia.madura.dao.TindakanDAO;

 

@Service
public class TindakanServiceAction implements TindakanService{
	@Autowired
	private TindakanDAO TindakanDAO;

	@Override
	@Transactional
	public List<m_Tindakan> getTindakans() {
		// TODO Auto-generated method stub
		return TindakanDAO.getTindakans();
	}

	@Override
	@Transactional
	public List<m_Tindakan> getTindakans(int page, int limit) {
		// TODO Auto-generated method stub
		return TindakanDAO.getTindakans(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return TindakanDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public m_Tindakan getTindakan(int id) {
		// TODO Auto-generated method stub
		return TindakanDAO.getTindakan(id);
	}

	@Override
	@Transactional
	public void store(m_Tindakan data) {
		// TODO Auto-generated method stub
		TindakanDAO.TindakanStore(data);
		
	}

	@Override
	@Transactional
	public void update(m_Tindakan data) {
		// TODO Auto-generated method stub
		TindakanDAO.TindakanUpdate(data);
		
	}

	@Override
	@Transactional
	public void delete(m_Tindakan data) {
		// TODO Auto-generated method stub
		TindakanDAO.TindakanDelete(data);
	}
}
