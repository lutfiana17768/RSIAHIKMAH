package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_PaketTindakan;

public interface PaketTindakanDAO {
	public List<m_PaketTindakan> getPaketTindakans();
	public List<m_PaketTindakan> getPaketTindakans(int page, int limit);
	public String createLinks(int page, int limit);
	public m_PaketTindakan getPaketTindakan(int pakettindakanId);
	
	public int Store(m_PaketTindakan data);
	public void Update(m_PaketTindakan data);
	public void Delete(m_PaketTindakan data);
}
