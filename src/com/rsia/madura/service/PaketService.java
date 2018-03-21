package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_Paket;

public interface PaketService {
	public List<m_Paket> getPakets();
	public List<m_Paket> getPakets(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Paket getPaket(int id);
	
	public void store(m_Paket data);
	public void update(m_Paket data);
	public void delete(m_Paket data);
}
