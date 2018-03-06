package com.rsia.madura.service;

import java.util.List;
 
import com.rsia.madura.entity.m_Agama; 

public interface AgamaService {
	public List<m_Agama> getAgama(int agama_id);
	public List<m_Agama> getAgama(int page, int limit);
	public List<m_Agama> getAgama();
	public void tambah(m_Agama AgamaModel);
	public void update(m_Agama AgamaModel);
	public void delete(m_Agama AgamaModel);
	public void simpan(m_Agama agamaModel);
	
}
