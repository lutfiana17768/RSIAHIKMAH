package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.AgamaDAO;
import com.rsia.madura.entity.m_Agama;

@Service
public class AgamaServiceAction implements AgamaService {
	@Autowired
	private AgamaDAO agamaDAO;

	@Override
	@Transactional
	public List<m_Agama> getAgamas() {
		// TODO Auto-generated method stub
		return agamaDAO.getAgamas();
	}

	@Override
	@Transactional
	public List<m_Agama> getAgamas(int page, int limit) {
		// TODO Auto-generated method stub
		return agamaDAO.getAgamas(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return agamaDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public m_Agama getAgama(int id) {
		// TODO Auto-generated method stub
		return agamaDAO.getAgama(id);
	}

	@Override
	@Transactional
	public void store(m_Agama data) {
		// TODO Auto-generated method stub
		agamaDAO.AgamaStore(data);
		
	}

	@Override
	@Transactional
	public void update(m_Agama data) {
		// TODO Auto-generated method stub
		agamaDAO.AgamaUpdate(data);
		
	}

	@Override
	@Transactional
	public void delete(m_Agama data) {
		// TODO Auto-generated method stub
		agamaDAO.AgamaDelete(data);
	}

}
