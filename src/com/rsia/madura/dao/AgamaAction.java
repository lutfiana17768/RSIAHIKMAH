package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Agama; 

@Repository
public class AgamaAction implements AgamaDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<m_Agama> getAgama() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_Agama> query = current.createQuery("from m_Agama", m_Agama.class);
		
		List<m_Agama> Agama = query.getResultList();
		
		return Agama;
	}
	@Override
	public void agamaSimpan(m_Agama agamaModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(agamaModel);
	}

}
