package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.m_Rujukan;
import com.rsia.madura.dao.RujukanDAO;
 

@Service
public class RujukanServiceAction implements RujukanService{
	@Autowired
	private RujukanDAO RujukanDAO;
	
	@Transactional
	@Override
	public List<m_Rujukan> getRujukan() {
		return RujukanDAO.getRujukan();
	}

}
