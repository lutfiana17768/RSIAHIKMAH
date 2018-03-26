package com.rsia.madura.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PasienDAO;
import com.rsia.madura.entity.m_Pasien;
import com.rsia.madura.entity.m_Pasien;

@Service
public class PasienServiceAction implements PasienService {
	@Autowired
	private PasienDAO PasienDAO;

	@Transactional
	@Override
	public List<m_Pasien> getPasien() {
		return PasienDAO.getPasien();
	}

	@Override
	@Transactional
	public List<m_Pasien> getPasiens(int page, int limit) {
		// TODO Auto-generated method stub
		return PasienDAO.getPasiens(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return PasienDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public m_Pasien getPasien(int id) {
		// TODO Auto-generated method stub
		return PasienDAO.getPasien(id);
	}

	@Override
	@Transactional
	public void store(m_Pasien data) {
		// TODO Auto-generated method stub
		PasienDAO.PasienStore(data);

	}

	@Override
	@Transactional
	public void update(m_Pasien data) {
		// TODO Auto-generated method stub
		PasienDAO.PasienUpdate(data);		
	}

	@Override
	@Transactional
	public void delete(m_Pasien data) {
		// TODO Auto-generated method stub
		PasienDAO.PasienDelete(data);

	}

}
