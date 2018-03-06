package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Kelas;

@Repository
public class KelasAction implements KelasDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<m_Kelas> getKelas() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_Kelas> query = current.createQuery("from m_Kelas", m_Kelas.class);
		
		List<m_Kelas> Kelas = query.getResultList();
		
		return Kelas;
	}
	

}
