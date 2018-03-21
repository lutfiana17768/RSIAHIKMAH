package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PaketDAO;
import com.rsia.madura.entity.m_Paket;

@Service
public class PaketServiceAction implements PaketService {
	@Autowired
	private PaketDAO paketDAO;

	@Override
	@Transactional
	public List<m_Paket> getPakets() {
		// TODO Auto-generated method stub
		return paketDAO.getPakets();
	}

	@Override
	@Transactional
	public List<m_Paket> getPakets(int page, int limit) {
		// TODO Auto-generated method stub
		return paketDAO.getPakets(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return paketDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public m_Paket getPaket(int id) {
		// TODO Auto-generated method stub
		return paketDAO.getPaket(id);
	}

	@Override
	@Transactional
	public void store(m_Paket data) {
		// TODO Auto-generated method stub
		paketDAO.Store(data);

	}

	@Override
	@Transactional
	public void update(m_Paket data) {
		// TODO Auto-generated method stub
		paketDAO.Update(data);

	}

	@Override
	@Transactional
	public void delete(m_Paket data) {
		// TODO Auto-generated method stub
		paketDAO.Delete(data);
	}

}
