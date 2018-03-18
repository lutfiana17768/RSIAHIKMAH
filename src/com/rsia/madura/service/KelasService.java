package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_Kelas;

public interface KelasService {
	public List<m_Kelas> getKelases();
	public List<m_Kelas> getKelases(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Kelas getKelas(int id);
	
	public void store(m_Kelas data);
	public void update(m_Kelas data);
	public void delete(m_Kelas data);
}
