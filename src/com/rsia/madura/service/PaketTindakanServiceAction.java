package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PaketTindakanDAO;
import com.rsia.madura.entity.m_PaketTindakan;

@Service
public class PaketTindakanServiceAction implements PaketTindakanService {
	@Autowired
	private PaketTindakanDAO PaketTindakanDAO;

	@Override
	@Transactional
	public List<m_PaketTindakan> getPaketTindakans() {
		// TODO Auto-generated method stub
		return PaketTindakanDAO.getPaketTindakans();
	}

	@Override
	@Transactional
	public List<m_PaketTindakan> getPaketTindakans(int page, int limit) {
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
	public m_PaketTindakan getPaketTindakan(int id) {
		// TODO Auto-generated method stub
		return PaketTindakanDAO.getPaketTindakan(id);
	}

	@Override
	@Transactional
	public void store(m_PaketTindakan data) {
		// TODO Auto-generated method stub
		PaketTindakanDAO.Store(data);

	}

	@Override
	@Transactional
	public void update(m_PaketTindakan data) {
		// TODO Auto-generated method stub
		PaketTindakanDAO.Update(data);

	}

	@Override
	@Transactional
	public void delete(m_PaketTindakan data) {
		// TODO Auto-generated method stub
		PaketTindakanDAO.Delete(data);
	}

}
