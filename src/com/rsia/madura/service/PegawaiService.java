package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_Pegawai;

public interface PegawaiService {
	public List<m_Pegawai> getPegawais();
	public m_Pegawai getPegawai(int pegawaiId);
	
	public void store(m_Pegawai pegawaiModel);
	public void update(m_Pegawai pegawaiModel);
	public void delete(m_Pegawai pegawaiModel);
}
