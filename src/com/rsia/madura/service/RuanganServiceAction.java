package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.RuanganDAO;
import com.rsia.madura.entity.m_Ruang;

@Service
public class RuanganServiceAction implements RuanganService {
	@Autowired
	private RuanganDAO ruanganDAO;
	
	@Override
	@Transactional
	public List<m_Ruang> getRuangs() {
		// TODO Auto-generated method stub
		return ruanganDAO.getRuangs();
	}

	@Override
	@Transactional
	public List<m_Ruang> getRuangs(int page, int limit) {
		// TODO Auto-generated method stub
		return ruanganDAO.getRuangs(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return ruanganDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public m_Ruang getRuang(int id) {
		// TODO Auto-generated method stub
		return ruanganDAO.getRuang(id);
	}

	@Override
	@Transactional
	public void store(m_Ruang data) {
		// TODO Auto-generated method stub
		ruanganDAO.Store(data);
		
	}

	@Override
	@Transactional
	public void update(m_Ruang data) {
		// TODO Auto-generated method stub
		ruanganDAO.Update(data);
		
	}

	@Override
	@Transactional
	public void delete(m_Ruang data) {
		// TODO Auto-generated method stub
		ruanganDAO.Delete(data);
	}


}
