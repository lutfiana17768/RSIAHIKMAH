package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Tindakan;


@Repository
public class TindakanAction implements TindakanDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<m_Tindakan> getTindakan() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_Tindakan> query = current.createQuery("from m_Tindakan", m_Tindakan.class);
		
		List<m_Tindakan> Rujukan = query.getResultList();
		
		return Rujukan;
	}

}
