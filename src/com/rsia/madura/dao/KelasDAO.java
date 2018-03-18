package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_Kelas;

public interface KelasDAO {
	public List<m_Kelas> getKelases();
	public List<m_Kelas> getKelases(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Kelas getKelas(int KelasId);
	
	public void KelasStore(m_Kelas KelasModel);
	public void KelasUpdate(m_Kelas KelasModel);
	public void KelasDelete(m_Kelas KelasModel);
}
