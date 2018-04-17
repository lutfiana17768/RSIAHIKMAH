package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.t_Pendaftaran;
import com.rsia.madura.dao.PendaftaranDAO;

 

@Service
public class PendaftaranServiceAction implements PendaftaranService{
	@Autowired
	private PendaftaranDAO PendaftaranDAO;

	@Override
	@Transactional
	public List<t_Pendaftaran> getPendaftarans() {
		// TODO Auto-generated method stub
		return PendaftaranDAO.getPendaftarans();
	}

	@Override
	@Transactional
	public List<t_Pendaftaran> getPendaftarans(int page, int limit) {
		// TODO Auto-generated method stub
		return PendaftaranDAO.getPendaftarans(page, limit);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return PendaftaranDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public t_Pendaftaran getPendaftaran(int id) {
		// TODO Auto-generated method stub
		return PendaftaranDAO.getPendaftaran(id);
	}

	@Override
	@Transactional
	public void store(t_Pendaftaran data) {
		// TODO Auto-generated method stub
		PendaftaranDAO.PendaftaranStore(data);
		
	}

	@Override
	@Transactional
	public void update(t_Pendaftaran data) {
		// TODO Auto-generated method stub
		PendaftaranDAO.PendaftaranUpdate(data);
		
	}

	@Override
	@Transactional
	public void delete(t_Pendaftaran data) {
		// TODO Auto-generated method stub
		PendaftaranDAO.PendaftaranDelete(data);
	}
}
