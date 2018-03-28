package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.ObatDAO;
import com.rsia.madura.entity.m_Obat;

@Repository
public class ObatServiceAction implements ObatService {
	@Autowired
	private ObatDAO ObatDAO;

	@Override
	@Transactional
	public List<m_Obat> getObats() {
		// TODO Auto-generated method stub
		return ObatDAO.getObats();
	}

	@Override
	@Transactional
	public List<m_Obat> getObats(int page, int limit) {
		// TODO Auto-generated method stub
		return ObatDAO.getObats(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return ObatDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public m_Obat getObat(int id) {
		// TODO Auto-generated method stub
		return ObatDAO.getObat(id);
	}

	@Override
	@Transactional
	public void store(m_Obat data) {
		// TODO Auto-generated method stub
		ObatDAO.Store(data);

	}

	@Override
	@Transactional
	public void update(m_Obat data) {
		// TODO Auto-generated method stub
		ObatDAO.Update(data);

	}

	@Override
	@Transactional
	public void delete(m_Obat data) {
		// TODO Auto-generated method stub
		ObatDAO.Delete(data);
	}

}
