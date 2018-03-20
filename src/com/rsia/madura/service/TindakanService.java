package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_Tindakan;

public interface TindakanService {
	public List<m_Tindakan> getTindakans();
	public List<m_Tindakan> getTindakans(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Tindakan getTindakan(int id);
	
	public void store(m_Tindakan data);
	public void update(m_Tindakan data);
	public void delete(m_Tindakan data);
}
