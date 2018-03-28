package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_Obat;

public interface ObatDAO {
	public List<m_Obat> getObats();
	public List<m_Obat> getObats(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Obat getObat(int PaketObatId);
	
	public int Store(m_Obat data);
	public void Update(m_Obat data);
	public void Delete(m_Obat data);
}
