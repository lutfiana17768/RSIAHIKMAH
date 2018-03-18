package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.KelasDAO;
import com.rsia.madura.entity.m_Kelas;

@Service
public class KelasServiceAction implements KelasService {
	@Autowired
	private KelasDAO kelasDAO;

	@Override
	@Transactional
	public List<m_Kelas> getKelases() {
		// TODO Auto-generated method stub
		return kelasDAO.getKelases();
	}

	@Override
	@Transactional
	public List<m_Kelas> getKelases(int page, int limit) {
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
	public m_Kelas getKelas(int id) {
		// TODO Auto-generated method stub
		return kelasDAO.getKelas(id);
	}

	@Override
	@Transactional
	public void store(m_Kelas data) {
		// TODO Auto-generated method stub
		kelasDAO.KelasStore(data);
		
	}

	@Override
	@Transactional
	public void update(m_Kelas data) {
		// TODO Auto-generated method stub
		kelasDAO.KelasUpdate(data);
		
	}

	@Override
	@Transactional
	public void delete(m_Kelas data) {
		// TODO Auto-generated method stub
		kelasDAO.KelasDelete(data);
	}

}
