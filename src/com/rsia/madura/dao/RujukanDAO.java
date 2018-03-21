package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_Rujukan;

public interface RujukanDAO {
	public List<m_Rujukan> getRujukans();
	public List<m_Rujukan> getRujukans(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Rujukan getRujukan(int RujukanId);
	
	public void Store(m_Rujukan Model);
	public void Update(m_Rujukan Model);
	public void Delete(m_Rujukan Model);
}
