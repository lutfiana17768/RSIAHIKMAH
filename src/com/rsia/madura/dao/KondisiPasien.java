package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Kondisi;

@Repository
public class KondisiPasien implements KondisiPasienDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<m_Kondisi> getKondisi() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_Kondisi> query = current.createQuery("from m_Kondisi", m_Kondisi.class);
		
		List<m_Kondisi> Kondisi = query.getResultList();
		
		return Kondisi;
	}

}
