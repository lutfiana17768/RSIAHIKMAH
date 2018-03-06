package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PasienDAO;
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

}
