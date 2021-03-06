package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_Jabatan;

public interface JabatanService {
	public List<m_Jabatan> getJabatans();
	public m_Jabatan getJabatan(int jabatanId);
	
	public void store(m_Jabatan jabatanModel);
	public void update(m_Jabatan jabatanModel);
	public void delete(m_Jabatan jabatanModel);
}
