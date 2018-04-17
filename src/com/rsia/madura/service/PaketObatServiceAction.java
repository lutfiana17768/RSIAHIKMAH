package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.NPaketObatDAO;
import com.rsia.madura.entity.MPaketObat;

@Repository
public class PaketObatServiceAction implements PaketObatService {
	@Autowired
	private NPaketObatDAO paketObatDAO;

	@Override
	@Transactional
	public List<MPaketObat> findAll() {
		// TODO Auto-generated method stub
		return paketObatDAO.getPaketObats();
	}

	@Override
	@Transactional
	public List<MPaketObat> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return paketObatDAO.getPaketObats(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return paketObatDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MPaketObat getPaketObat(int id) {
		// TODO Auto-generated method stub
		return paketObatDAO.getPaketObat(id);
	}

	@Override
	@Transactional
	public void store(MPaketObat data) {
		// TODO Auto-generated method stub
		paketObatDAO.Store(data);

	}

	@Override
	@Transactional
	public void update(MPaketObat data) {
		// TODO Auto-generated method stub
		paketObatDAO.Update(data);

	}

	@Override
	@Transactional
	public void delete(MPaketObat data) {
		// TODO Auto-generated method stub
		paketObatDAO.Delete(data);
	}

}
