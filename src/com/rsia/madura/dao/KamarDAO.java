package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_Kamar;

public interface KamarDAO {
	public List<m_Kamar> getKamars();
	public List<m_Kamar> getKamars(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Kamar getKamar(int KamarId);
	
	public void Store(m_Kamar Model);
	public void Update(m_Kamar Model);
	public void Delete(m_Kamar Model);

}
