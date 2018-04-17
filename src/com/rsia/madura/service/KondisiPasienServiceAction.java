package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.m_Kondisi;
import com.rsia.madura.entity.m_Provinsi;
import com.rsia.madura.dao.KondisiPasienDAO;

@Service

public class KondisiPasienServiceAction implements KondisiPasienService {
	@Autowired
	private KondisiPasienDAO KondisiPasienDAO;

	@Override
	@Transactional
	public List<m_Kondisi> getKondisis() {
		// TODO Auto-generated method stub
		return KondisiPasienDAO.getKondisis();
	}

	@Override
	@Transactional
	public List<m_Kondisi> getKondisis(int page, int limit) {
		// TODO Auto-generated method stub
		return KondisiPasienDAO.getKondisis(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return KondisiPasienDAO.createLinks(page, limit);
	}
	
	@Override
	@Transactional
	public m_Kondisi getKondisi(int kondisiId) {
		return KondisiPasienDAO.getKondisi(kondisiId);
	}
	
	@Override
	@Transactional
	public void store(m_Kondisi kondisiModel) {
		KondisiPasienDAO.kondisiStore(kondisiModel);
	}

	@Override
	@Transactional
	public void update(m_Kondisi kondisiModel) {
		KondisiPasienDAO.kondisiUpdate(kondisiModel);

	}

	@Override
	@Transactional
	public void delete(m_Kondisi kondisiModel) {
		KondisiPasienDAO.kondisiDelete(kondisiModel);
	}

}
