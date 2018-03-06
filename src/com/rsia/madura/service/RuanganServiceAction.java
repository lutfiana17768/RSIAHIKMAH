package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.RuanganDAO;
import com.rsia.madura.entity.m_Ruang;

@Service
public class RuanganServiceAction implements RuanganService {
	@Autowired
	private RuanganDAO RuanganDAO;
	
	@Transactional
	@Override
	public List<m_Ruang> getRuang() {
		return RuanganDAO.getRuang();
	}

}
