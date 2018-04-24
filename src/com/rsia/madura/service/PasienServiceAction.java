/*
 * @Author: Pradesga 
 * @Date: 2018-04-14 17:53:00 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-14 17:53:00 
 */
package com.rsia.madura.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PasienDAO;
import com.rsia.madura.entity.MPasien;

@Service
public class PasienServiceAction implements PasienService {
	@Autowired
	private PasienDAO pasienDAO;

	@Transactional
	@Override
	public List<MPasien> getPasien() {
		return pasienDAO.getPasien();
	}

	@Override
	@Transactional
	public List<MPasien> getPasiens(int page, int limit) {
		// TODO Auto-generated method stub
		return pasienDAO.getPasiens(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return pasienDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MPasien getPasien(int id) {
		// TODO Auto-generated method stub
		return pasienDAO.getPasien(id);
	}

	@Override
	@Transactional
	public void store(MPasien data) {
		// TODO Auto-generated method stub
		pasienDAO.PasienStore(data);

	}

	@Override
	@Transactional
	public void update(MPasien data) {
		// TODO Auto-generated method stub
		pasienDAO.PasienUpdate(data);		
	}

	@Override
	@Transactional
	public void delete(MPasien data) {
		// TODO Auto-generated method stub
		pasienDAO.PasienDelete(data);

	}

}
