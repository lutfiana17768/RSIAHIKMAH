package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.t_Pendaftaran;
import com.rsia.madura.dao.PelayananDAO;
 

@Service
public class PelayananServiceAction implements PendaftaranService{
	@Autowired
	private PelayananDAO PelayananDAO;

	@Override
	@Transactional
	public List<t_Pendaftaran> getPelayanans() {
		// TODO Auto-generated method stub
		return PelayananDAO.getPelayanans();
	}

	@Override
	@Transactional
	public List<t_Pendaftaran> getPelayanans(int page, int limit) {
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
	public t_Pendaftaran getPelayanan(int id) {
		// TODO Auto-generated method stub
		return PelayananDAO.getPelayanan(id);
	}

	@Override
	@Transactional
	public void store(t_Pendaftaran data) {
		// TODO Auto-generated method stub
		PelayananDAO.PendaftaranStore(data);
		
	}

	@Override
	@Transactional
	public void update(t_Pendaftaran data) {
		// TODO Auto-generated method stub
		PelayananDAO.PendaftaranUpdate(data);
		
	}

	@Override
	@Transactional
	public void delete(t_Pendaftaran data) {
		// TODO Auto-generated method stub
		PelayananDAO.PendaftaranDelete(data);
	}
}
