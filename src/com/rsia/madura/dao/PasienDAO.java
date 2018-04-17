package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_Pasien;
import com.rsia.madura.entity.m_Pasien;

public interface PasienDAO {
	public List<m_Pasien> getPasien();
	public List<m_Pasien> getPasiens();
	public List<m_Pasien> getPasiens(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Pasien getPasien(int PasienId);
	
	public void PasienStore(m_Pasien PasienModel);
	public void PasienUpdate(m_Pasien PasienModel);
	public void PasienDelete(m_Pasien PasienModel);
}
