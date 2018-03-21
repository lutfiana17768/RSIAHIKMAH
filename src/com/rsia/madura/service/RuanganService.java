package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_Ruang;

public interface RuanganService {
	public List<m_Ruang> getRuangs();
	public List<m_Ruang> getRuangs(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Ruang getRuang(int id);
	
	public void store(m_Ruang data);
	public void update(m_Ruang data);
	public void delete(m_Ruang data);
}
