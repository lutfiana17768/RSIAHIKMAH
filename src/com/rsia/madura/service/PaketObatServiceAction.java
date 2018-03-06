package com.rsia.madura.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_PaketObat;

@Repository
public class PaketObatServiceAction implements PaketObatService{
	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	
	@Override
	public List<m_PaketObat> getPaketObat() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_PaketObat> query = current.createQuery("from m_PaketObat", m_PaketObat.class);
		
		List<m_PaketObat> PaketObat = query.getResultList();
		return PaketObat;
	}
}
