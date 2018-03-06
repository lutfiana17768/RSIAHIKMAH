package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Pasien;

@Repository
public class PasienAction implements PasienDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<m_Pasien> getPasien() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_Pasien> query = current.createQuery("from m_Pasien", m_Pasien.class);
		
		List<m_Pasien> Pasien = query.getResultList();
		
		return Pasien;
	}


}
