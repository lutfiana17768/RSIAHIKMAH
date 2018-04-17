package com.rsia.madura.service;

import java.util.List;
import com.rsia.madura.entity.m_Kondisi;

public interface KondisiPasienService {
	public List<m_Kondisi> getKondisis();
	public List<m_Kondisi> getKondisis(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Kondisi getKondisi(int kondisiId);
	
	public void store(m_Kondisi kondisiModel);
	public void update(m_Kondisi kondisiModel);
	public void delete(m_Kondisi kondisiModel);
}
