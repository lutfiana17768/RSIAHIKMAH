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
	private KelasDAO KelasDAO;
	
	@Transactional
	@Override
	public List<m_Kelas> getKelas() {
		return KelasDAO.getKelas();
	}

	@Override
	public void simpan(m_Kelas kelasModel) {
		// TODO Auto-generated method stub
		
	}
}
