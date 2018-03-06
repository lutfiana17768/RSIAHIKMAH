package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.JabatanDAO;
import com.rsia.madura.entity.m_Jabatan;

@Service
public class JabatanServiceAction implements JabatanService {
	@Autowired
	private JabatanDAO jabatanDAO;
	
	@Override
	@Transactional
	public List<m_Jabatan> getJabatans() {
		
		return jabatanDAO.getJabatans();
	}

	@Override
	@Transactional
	public m_Jabatan getJabatan(int jabatanId) {
		
		return jabatanDAO.getJabatan(jabatanId);
	}

	@Override
	@Transactional
	public void store(m_Jabatan jabatanModel) {
		
		jabatanDAO.jabatanStore(jabatanModel);

	}

	@Override
	@Transactional
	public void update(m_Jabatan jabatanModel) {
		
		jabatanDAO.jabatanUpdate(jabatanModel);

	}

	@Override
	@Transactional
	public void delete(m_Jabatan jabatanModel) {
		
		jabatanDAO.jabatanDelete(jabatanModel);

	}

}
