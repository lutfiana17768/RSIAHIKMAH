package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.JualDAO;
import com.rsia.madura.entity.MJual;

@Service
public class JualServiceAction implements JualService {
	@Autowired
	private JualDAO jualDAO;
	
	@Override
	@Transactional
	public List<MJual> getJuals() {
		
		return jualDAO.getJuals();
	}

	@Override
	@Transactional
	public List<MJual> getJuals(int page, int limit) {
		
		return jualDAO.getJuals(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return jualDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MJual getJual(int jualId) {
		
		return jualDAO.getJual(jualId);
	}

	@Override
	@Transactional
	public int store(MJual jualModel) {
		
		return jualDAO.jualStore(jualModel);
	}

	@Override
	@Transactional
	public int update(MJual jualModel) {
		
		return jualDAO.jualUpdate(jualModel);
	}

	@Override
	@Transactional
	public int delete(MJual jualModel) {

		return jualDAO.jualDelete(jualModel);
	}

}
