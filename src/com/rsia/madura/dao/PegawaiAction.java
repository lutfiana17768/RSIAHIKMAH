package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Pegawai;

@Repository
public class PegawaiAction implements PegawaiDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<m_Pegawai> getPegawais() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_Pegawai> pegawaiQuery = current.createQuery("from m_Pegawai", m_Pegawai.class);
		List<m_Pegawai> result = pegawaiQuery.getResultList();
		
		return result;
	}

	@Override
	public m_Pegawai getPegawai(int pegawaiId) {
		Session current = sessionFactory.getCurrentSession();
		
		m_Pegawai result = current.get(m_Pegawai.class, pegawaiId);
		
		return result;
	}

	@Override
	public void pegawaiStore(m_Pegawai pegawaiModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(pegawaiModel);

	}

	@Override
	public void pegawaiUpdate(m_Pegawai pegawaiModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(pegawaiModel);

	}

	@Override
	public void pegawaiDelete(m_Pegawai pegawaiModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(pegawaiModel);
	}

}
