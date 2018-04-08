package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_PaketTindakan;

public interface PaketTindakanService {
	public List<m_PaketTindakan> getPaketTindakans();
	public List<m_PaketTindakan> getPaketTindakans(int page, int limit);
	public String createLinks(int page, int limit);
	public m_PaketTindakan getPaketTindakan(int id);
	
	public void store(m_PaketTindakan data);
	public void update(m_PaketTindakan data);
	public void delete(m_PaketTindakan data);
}
