package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_Tindakan;

public interface TindakanDAO {
	public List<m_Tindakan> getTindakans();
	public List<m_Tindakan> getTindakans(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Tindakan getTindakan(int TindakanId);
	
	public void TindakanStore(m_Tindakan TindakanModel);
	public void TindakanUpdate(m_Tindakan TindakanModel);
	public void TindakanDelete(m_Tindakan TindakanModel);
}
