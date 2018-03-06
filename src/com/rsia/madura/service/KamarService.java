package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_Kamar;
import com.rsia.madura.entity.m_Kondisi;

public interface KamarService {
	public List<m_Kamar> getKamar();

	public void simpan(m_Kamar kamarModel);

	public static void simpan(m_Kondisi kondisiModel) {
		// TODO Auto-generated method stub
		
	}
}
