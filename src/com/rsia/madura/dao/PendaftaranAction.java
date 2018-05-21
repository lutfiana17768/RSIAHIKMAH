package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MPendaftaran;


@Repository
public class PendaftaranAction implements PendaftaranDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	
	@Override
	public List<MPendaftaran> getPendaftarans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MPendaftaran> getPendaftarans(int page, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MPendaftaran getPendaftaran(int PendaftaranId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int PendaftaranStore(MPendaftaran PendaftaranModel) {
		Session current = sessionFactory.getCurrentSession();

		return (int) current.save(PendaftaranModel);
	}

	@Override
	public void PendaftaranUpdate(MPendaftaran PendaftaranModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PendaftaranDelete(MPendaftaran PendaftaranModel) {
		// TODO Auto-generated method stub
		
	}
}
