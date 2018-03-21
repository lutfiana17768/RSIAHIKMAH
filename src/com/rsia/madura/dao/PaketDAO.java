package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_Paket;

public interface PaketDAO {
	public List<m_Paket> getPakets();
	public List<m_Paket> getPakets(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Paket getPaket(int PaketId);
	
	public void Store(m_Paket PaketModel);
	public void Update(m_Paket PaketModel);
	public void Delete(m_Paket PaketModel);
}
