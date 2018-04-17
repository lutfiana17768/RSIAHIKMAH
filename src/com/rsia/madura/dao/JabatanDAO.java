package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_Jabatan;

public interface JabatanDAO {
	public List<m_Jabatan> getJabatans();
	public m_Jabatan getJabatan(int jabatanId);
	
	public void jabatanStore(m_Jabatan jabatanModel);
	public void jabatanUpdate(m_Jabatan jabatanModel);
	public void jabatanDelete(m_Jabatan jabatanModel);
}
