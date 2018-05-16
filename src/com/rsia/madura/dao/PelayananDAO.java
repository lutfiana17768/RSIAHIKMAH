package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.t_Pendaftaran;

public interface PelayananDAO {
	public List<t_Pendaftaran> getPelayanans();
	public List<t_Pendaftaran> getPelayanans(int page, int limit);
	public String createLinks(int page, int limit);
	public t_Pendaftaran getPelayanan(int PelayananId);
	
	public int PelayananStore(t_Pendaftaran PelayananModel);
	public void PelayananUpdate(t_Pendaftaran PelayananModel);
	public void PelayananDelete(t_Pendaftaran PelayananModel);
}
