package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.KamarDAO;
import com.rsia.madura.entity.m_Kamar;

@Service
public class KamarServiceAction implements KamarService{
	@Autowired
	private KamarDAO KamarDAO;
	
	@Transactional
	@Override
	public List<m_Kamar> getKamar() {
		return KamarDAO.getKamar();
	}

	@Override
	public void simpan(m_Kamar kamarModel) {
		// TODO Auto-generated method stub
		
	}
}
