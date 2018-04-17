package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.t_Gaji;

@Repository
public class GajiAction implements GajiDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<t_Gaji> getGajis() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<t_Gaji> gajiQuery = current.createQuery("from t_Gaji", t_Gaji.class);
		List<t_Gaji> result = gajiQuery.getResultList();
		
		return result;
	}

	@Override
	public t_Gaji getGaji(int gajiId) {
		Session current = sessionFactory.getCurrentSession();
		
		t_Gaji result = current.get(t_Gaji.class, gajiId);
		
		return result;
	}

	@Override
	public void getTotal(t_Gaji gajiModel) {
		
		gajiModel.setGajiPendapatan((gajiModel.getGajiPokok() + gajiModel.getGajiBonus()) - gajiModel.getGajiPotongan());
		
	}

	@Override
	public void gajiStore(t_Gaji gajiModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(gajiModel);

	}

	@Override
	public void gajiUpdate(t_Gaji gajiModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(gajiModel);

	}

	@Override
	public void gajiDelete(t_Gaji gajiModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(gajiModel);
	}

}
