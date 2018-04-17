package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.t_Pendaftaran;

public interface PendaftaranService {
	public List<t_Pendaftaran> getPendaftarans();
	public List<t_Pendaftaran> getPendaftarans(int page, int limit);
	public String createLinks(int page, int limit);
	public t_Pendaftaran getPendaftaran(int id);
	
	public void store(t_Pendaftaran data);
	public void update(t_Pendaftaran data);
	public void delete(t_Pendaftaran data);
}
