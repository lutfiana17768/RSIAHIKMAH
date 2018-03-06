package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_Pegawai;

public interface PegawaiDAO {
	public List<m_Pegawai> getPegawais();
	public m_Pegawai getPegawai(int pegawaiId);
	
	public void pegawaiStore(m_Pegawai pegawaiModel);
	public void pegawaiUpdate(m_Pegawai pegawaiModel);
	public void pegawaiDelete(m_Pegawai pegawaiModel);
}
