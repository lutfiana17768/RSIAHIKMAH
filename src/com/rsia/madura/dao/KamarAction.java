package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Kamar;

@Repository
public class KamarAction implements KamarDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<m_Kamar> getKamar() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_Kamar> query = current.createQuery("from m_Kamar", m_Kamar.class);
		
		List<m_Kamar> Kamar = query.getResultList();
		
		return Kamar;
	}

}
