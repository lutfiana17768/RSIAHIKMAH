package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Ruang;

@Repository
public class RuanganAction implements RuanganDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<m_Ruang> getRuang() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_Ruang> query = current.createQuery("from m_Ruang", m_Ruang.class);
		
		List<m_Ruang> Ruang = query.getResultList();
		
		return Ruang;
	}


}
