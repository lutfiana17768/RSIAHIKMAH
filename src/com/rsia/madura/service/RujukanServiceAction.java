package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.m_Rujukan;
import com.rsia.madura.dao.RujukanDAO;

@Service
public class RujukanServiceAction implements RujukanService {
	@Autowired
	private RujukanDAO rujukanDAO;

	@Override
	@Transactional
	public List<m_Rujukan> getRujukans() {
		// TODO Auto-generated method stub
		return rujukanDAO.getRujukans();
	}

	@Override
	@Transactional
	public List<m_Rujukan> getRujukans(int page, int limit) {
		// TODO Auto-generated method stub
		return rujukanDAO.getRujukans(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return rujukanDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public m_Rujukan getRujukan(int id) {
		// TODO Auto-generated method stub
		return rujukanDAO.getRujukan(id);
	}

	@Override
	@Transactional
	public void store(m_Rujukan data) {
		// TODO Auto-generated method stub
		rujukanDAO.Store(data);

	}

	@Override
	@Transactional
	public void update(m_Rujukan data) {
		// TODO Auto-generated method stub
		rujukanDAO.Update(data);

	}

	@Override
	@Transactional
	public void delete(m_Rujukan data) {
		// TODO Auto-generated method stub
		rujukanDAO.Delete(data);
	}

}
