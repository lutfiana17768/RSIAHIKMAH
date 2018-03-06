package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_Agama;

public interface AgamaDAO {
	public List<m_Agama> getAgama();

	void agamaSimpan(m_Agama agamaModel);
}
