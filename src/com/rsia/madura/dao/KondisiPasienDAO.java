package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_Kondisi;

public interface KondisiPasienDAO {
	public List<m_Kondisi> getKondisis();
	public List<m_Kondisi> getKondisis(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Kondisi getKondisi(int kondisiId);
	
	public void kondisiStore(m_Kondisi kondisiModel);
	public void kondisiUpdate(m_Kondisi kondisiModel);
	public void kondisiDelete(m_Kondisi kondisiModel);
}
