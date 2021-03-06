package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PaketObatDAO;
import com.rsia.madura.entity.m_PaketObat;

@Repository
public class PaketObatServiceAction implements PaketObatService {
	@Autowired
	private PaketObatDAO PaketObatDAO;

	@Override
	@Transactional
	public List<m_PaketObat> getPaketObats() {
		// TODO Auto-generated method stub
		return PaketObatDAO.getPaketObats();
	}

	@Override
	@Transactional
	public List<m_PaketObat> getPaketObats(int page, int limit) {
		// TODO Auto-generated method stub
		return PaketObatDAO.getPaketObats(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return PaketObatDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public m_PaketObat getPaketObat(int id) {
		// TODO Auto-generated method stub
		return PaketObatDAO.getPaketObat(id);
	}

	@Override
	@Transactional
	public void store(m_PaketObat data) {
		// TODO Auto-generated method stub
		PaketObatDAO.Store(data);

	}

	@Override
	@Transactional
	public void update(m_PaketObat data) {
		// TODO Auto-generated method stub
		PaketObatDAO.Update(data);

	}

	@Override
	@Transactional
	public void delete(m_PaketObat data) {
		// TODO Auto-generated method stub
		PaketObatDAO.Delete(data);
	}

}
