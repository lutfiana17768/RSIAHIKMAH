package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.rsia.madura.entity.m_Kondisi;
import com.rsia.madura.dao.KondisiPasienDAO;

@Service

public class KondisiPasienServiceAction implements KondisiPasienService {
	@Autowired
	private KondisiPasienDAO KondisiPasienDAO;
	

	@Transactional
	@Override
	public List<m_Kondisi> getKondisi() {
		return KondisiPasienDAO.getKondisi();
		 
	}

}
