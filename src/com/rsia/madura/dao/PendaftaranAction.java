package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.t_Pendaftaran;


@Repository
public class PendaftaranAction implements PendaftaranDAO {

	@Override
	public List<t_Pendaftaran> getPendaftarans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<t_Pendaftaran> getPendaftarans(int page, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public t_Pendaftaran getPendaftaran(int PendaftaranId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int PendaftaranStore(t_Pendaftaran PendaftaranModel) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void PendaftaranUpdate(t_Pendaftaran PendaftaranModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PendaftaranDelete(t_Pendaftaran PendaftaranModel) {
		// TODO Auto-generated method stub
		
	}
}
