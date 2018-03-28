package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_PaketObat;

public interface PaketObatDAO {
	public List<m_PaketObat> getPaketObats();
	public List<m_PaketObat> getPaketObats(int page, int limit);
	public String createLinks(int page, int limit);
	public m_PaketObat getPaketObat(int PaketObatId);
	
	public int Store(m_PaketObat data);
	public void Update(m_PaketObat data);
	public void Delete(m_PaketObat data);
}
