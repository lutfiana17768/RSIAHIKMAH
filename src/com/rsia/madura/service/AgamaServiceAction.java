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
	
	@Transactional
	@Override
	public List<m_Agama> getAgama() {
		return agamaDAO.getAgama();
	}

	@Override
	public List<m_Agama> getAgama(int agama_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<m_Agama> getAgama(int page, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void tambah(m_Agama AgamaModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(m_Agama AgamaModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(m_Agama AgamaModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void simpan(m_Agama agamaModel) {
		// TODO Auto-generated method stub
		
	}
	

}
