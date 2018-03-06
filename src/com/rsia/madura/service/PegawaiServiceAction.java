package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PegawaiDAO;
import com.rsia.madura.entity.m_Pegawai;

@Service
public class PegawaiServiceAction implements PegawaiService {
	@Autowired
	private PegawaiDAO pegawaiDAO;
	
	@Override
	@Transactional
	public List<m_Pegawai> getPegawais() {
		
		return pegawaiDAO.getPegawais();
	}

	@Override
	@Transactional
	public m_Pegawai getPegawai(int pegawaiId) {
		
		return pegawaiDAO.getPegawai(pegawaiId);
	}

	@Override
	@Transactional
	public void store(m_Pegawai pegawaiModel) {
		
		pegawaiDAO.pegawaiStore(pegawaiModel);
	}

	@Override
	@Transactional
	public void update(m_Pegawai pegawaiModel) {
		
		pegawaiDAO.pegawaiUpdate(pegawaiModel);
	}

	@Override
	@Transactional
	public void delete(m_Pegawai pegawaiModel) {
		
		pegawaiDAO.pegawaiDelete(pegawaiModel);
	}

}
