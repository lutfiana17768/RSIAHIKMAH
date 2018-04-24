package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.rsia.madura.entity.MUser;

@Repository
public class UserAction implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<MUser> getUsers() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<MUser> query = current.createQuery("from MUser where userAktif = 'Y'", MUser.class);
		 
		List<MUser> result = query.getResultList();
		
		return result;
	}

	@Override
	public MUser getUser(int userId) {
		Session current = sessionFactory.getCurrentSession();
		
		MUser result = current.get(MUser.class, userId);
		
		return result;
	}

	@Override
	public int userStore(MUser userModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(userModel);
		current.flush();
		
		return userModel.getUser_id();
	}

	@Override
	public int userUpdate(MUser userModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(userModel);
		current.flush();
		
		return userModel.getUser_id();
	}

	@Override
	public int userDelete(MUser userModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(userModel);
		current.flush();
		
		return userModel.getUser_id();

	}

}
