package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_Ruang;

public interface RuanganDAO {
	public List<m_Ruang> getRuangs();
	public List<m_Ruang> getRuangs(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Ruang getRuang(int RuangId);
	
	public void Store(m_Ruang Model);
	public void Update(m_Ruang Model);
	public void Delete(m_Ruang Model);
}
