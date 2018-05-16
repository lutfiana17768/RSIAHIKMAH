package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.t_Pendaftaran;

public interface PelayananService {
	public List<t_Pendaftaran> getPelayanans();
	public List<t_Pendaftaran> getPelayanans(int page, int limit);
	public String createLinks(int page, int limit);
	public t_Pendaftaran getPelayanans(int id);
	
	public void store(t_Pendaftaran data);
	public void update(t_Pendaftaran data);
	public void delete(t_Pendaftaran data);
}
