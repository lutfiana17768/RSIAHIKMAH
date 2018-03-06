package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_Kelas;

public interface KelasService {
	public List<m_Kelas> getKelas();

	public void simpan(m_Kelas kelasModel);
}
