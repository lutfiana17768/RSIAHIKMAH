package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.m_Tindakan;
import com.rsia.madura.dao.TindakanDAO;

 

@Service
public class TindakanServiceAction implements TindakanService{
	@Autowired
	private TindakanDAO TindakanDAO;
	

	@Transactional
	public List<m_Tindakan> getTindakan() {
		return TindakanDAO.getTindakan();
		 
	}
}
