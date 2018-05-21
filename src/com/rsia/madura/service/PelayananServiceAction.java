/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-18 09:58:19
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-18 10:11:59
*/

package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.MPendaftaran;
import com.rsia.madura.dao.PelayananDAO;
 

@Service
public class PelayananServiceAction implements PelayananService{
	@Autowired
	private PelayananDAO PelayananDAO;

	@Override
	@Transactional
	public List<MPendaftaran> getPelayanans() {
		// TODO Auto-generated method stub
		return PelayananDAO.getPelayanans();
	}

	@Override
	@Transactional
	public List<MPendaftaran> getPelayanans(int page, int limit) {
		// TODO Auto-generated method stub
		return PelayananDAO.getPelayanans(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return PelayananDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MPendaftaran getPelayanan(int id) {
		// TODO Auto-generated method stub
		return PelayananDAO.getPelayanan(id);
	}

	@Override
	@Transactional
	public void store(MPendaftaran data) {
		// TODO Auto-generated method stub
		PelayananDAO.PelayananStore(data);
		
	}

	@Override
	@Transactional
	public void update(MPendaftaran data) {
		// TODO Auto-generated method stub
		PelayananDAO.PelayananUpdate(data);
		
	}

	@Override
	@Transactional
	public void delete(MPendaftaran data) {
		// TODO Auto-generated method stub
		PelayananDAO.PelayananDelete(data);
	}
}