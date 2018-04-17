package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Jabatan;

@Repository
public class JabatanAction implements JabatanDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<m_Jabatan> getJabatans() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_Jabatan> jabatanQuery = current.createQuery("from m_Jabatan", m_Jabatan.class);
		List<m_Jabatan> result = jabatanQuery.getResultList();
		
		return result;
	}

	@Override
	public m_Jabatan getJabatan(int jabatanId) {
		Session current = sessionFactory.getCurrentSession();
		
		m_Jabatan result = current.get(m_Jabatan.class, jabatanId);
		
		return result;
	}

	@Override
	public void jabatanStore(m_Jabatan jabatanModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(jabatanModel);

	}

	@Override
	public void jabatanUpdate(m_Jabatan jabatanModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(jabatanModel);

	}

	@Override
	public void jabatanDelete(m_Jabatan jabatanModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(jabatanModel);

	}

}
