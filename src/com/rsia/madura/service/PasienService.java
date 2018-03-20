package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_Pasien;

public interface PasienService {
	public List<m_Pasien> getPasien();
	
	public List<m_Pasien> getPasiens();
	public List<m_Pasien> getPasiens(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Pasien getPasien(int id);
	
	public void store(m_Pasien data);
	public void update(m_Pasien data);
	public void delete(m_Pasien data);
}
