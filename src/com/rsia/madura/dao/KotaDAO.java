package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_Kota;


public interface KotaDAO {
	public List<m_Kota> getKotas(int page, int limit);
	public List<m_Kota> getKotas();
	public String createLinks(int page, int limit);
	public m_Kota getKota(int kotaId);
	
	public void kotaStore(m_Kota kotaModel);
	public void kotaUpdate(m_Kota kotaModel);
	public void kotaDelete(m_Kota kotaModel);
}
