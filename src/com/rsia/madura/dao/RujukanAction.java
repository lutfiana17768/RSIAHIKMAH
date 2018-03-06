package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Rujukan;

@Repository
public class RujukanAction implements RujukanDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<m_Rujukan> getRujukan() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_Rujukan> query = current.createQuery("from m_Rujukan", m_Rujukan.class);
		
		List<m_Rujukan> Rujukan = query.getResultList();
		
		return Rujukan;
	}
	
}
