package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_Kelurahan;

public interface KelurahanService {
	public List<m_Kelurahan> getKelurahans();
	public List<m_Kelurahan> getKelurahans(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Kelurahan getKelurahan(int kelurahanId);
	
	public void store(m_Kelurahan kelurahanModel);
	public void update(m_Kelurahan kelurahanModel);
	public void delete(m_Kelurahan kelurahanModel);
}
