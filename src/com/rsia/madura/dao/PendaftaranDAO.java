package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.t_Pendaftaran;

public interface PendaftaranDAO {
	public List<t_Pendaftaran> getPendaftarans();
	public List<t_Pendaftaran> getPendaftarans(int page, int limit);
	public String createLinks(int page, int limit);
	public t_Pendaftaran getPendaftaran(int PendaftaranId);
	
	public int PendaftaranStore(t_Pendaftaran PendaftaranModel);
	public void PendaftaranUpdate(t_Pendaftaran PendaftaranModel);
	public void PendaftaranDelete(t_Pendaftaran PendaftaranModel);
}
