package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_Kamar;

public interface KamarService {
	public List<m_Kamar> getKamars();
	public List<m_Kamar> getKamars(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Kamar getKamar(int id);
	
	public void store(m_Kamar data);
	public void update(m_Kamar data);
	public void delete(m_Kamar data);
}
