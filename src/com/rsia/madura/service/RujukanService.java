package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_Rujukan;

public interface RujukanService {
	public List<m_Rujukan> getRujukans();
	public List<m_Rujukan> getRujukans(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Rujukan getRujukan(int id);
	
	public void store(m_Rujukan data);
	public void update(m_Rujukan data);
	public void delete(m_Rujukan data);
}
