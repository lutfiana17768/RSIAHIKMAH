package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PaketTindakanDAO;
import com.rsia.madura.entity.MPaketTindakan;

@Service
public class PaketTindakanServiceAction implements PaketTindakanService {
	@Autowired
	private PaketTindakanDAO PaketTindakanDAO;

	@Override
	@Transactional
	public List<MPaketTindakan> findAll() {
		// TODO Auto-generated method stub
		return PaketTindakanDAO.getPaketTindakans();
	}

	@Override
	@Transactional
	public List<MPaketTindakan> findAll(int page, int limit) {
		// TODO Auto-generated method stub
		return PaketTindakanDAO.getPaketTindakans(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return PaketTindakanDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MPaketTindakan getPaketTindakan(int id) {
		// TODO Auto-generated method stub
		return PaketTindakanDAO.getPaketTindakan(id);
	}

	@Override
	@Transactional
	public void store(MPaketTindakan data) {
		// TODO Auto-generated method stub
		PaketTindakanDAO.Store(data);

	}

	@Override
	@Transactional
	public void update(MPaketTindakan data) {
		// TODO Auto-generated method stub
		PaketTindakanDAO.Update(data);

	}

	@Override
	@Transactional
	public void delete(MPaketTindakan data) {
		// TODO Auto-generated method stub
		PaketTindakanDAO.Delete(data);
	}

}
