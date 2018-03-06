package com.rsia.madura.dao;

import java.util.List;
import com.rsia.madura.entity.m_Provinsi;

public interface ProvinsiDAO {
	public List<m_Provinsi> getProvinsis();
	public List<m_Provinsi> getProvinsis(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Provinsi getProvinsi(int provinsiId);
	
	public void provinsiStore(m_Provinsi provinsiModel);
	public void provinsiUpdate(m_Provinsi provinsiModel);
	public void provinsiDelete(m_Provinsi provinsiModel);
	
}
