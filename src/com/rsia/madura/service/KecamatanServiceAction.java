package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.KecamatanDAO;
import com.rsia.madura.entity.m_Kecamatan;

@Service
public class KecamatanServiceAction implements KecamatanService {
	@Autowired
	private KecamatanDAO kecamatanDAO;
	
	@Transactional
	@Override
	public List<m_Kecamatan> getKecamatans() {
		return kecamatanDAO.getKecamatans();
	}
	
	@Override
	@Transactional
	public List<m_Kecamatan> getKecamatans(int page, int limit){
		return kecamatanDAO.getKecamatans(page, limit);
	}
	
	@Override
	public String createLinks(int page, int limit) {
		return kecamatanDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public m_Kecamatan getKecamatan(int kecamatanId) {
		
		return kecamatanDAO.getKecamatan(kecamatanId);
	}

	@Override
	@Transactional
	public void store(m_Kecamatan kecamatanModel) {
		
		kecamatanDAO.kecamatanStore(kecamatanModel);
		
	}

	@Override
	@Transactional
	public void update(m_Kecamatan kecamatanModel) {
		
		kecamatanDAO.kecamatanUpdate(kecamatanModel);
		
	}

	@Override
	@Transactional
	public void delete(m_Kecamatan kecamatanModel) {
		
		kecamatanDAO.kecamatanDelete(kecamatanModel);
		
	}

}
