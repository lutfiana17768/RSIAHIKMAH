package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.rsia.madura.dao.UserDAO;
import com.rsia.madura.entity.MUser;

@Service
public class UserServiceAction implements UserService {
	@Autowired
	private UserDAO userDAO;
	// @Autowired
	// private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	@Transactional
	public List<MUser> getUsers() {
		
		return userDAO.getUsers();
	}

	@Override
	@Transactional
	public MUser getUser(int userId) {
		
		return userDAO.getUser(userId);
	}

	@Override
	@Transactional
	public int store(MUser data) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		// user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		data.setUserAktif("Y");
		data.setUserCreatedBy("Admin");	
		data.setUserCreatedDate(currentTime);
		
		return userDAO.userStore(data);

	}

	@Override
	@Transactional
	public int update(MUser data) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setUserUpdatedBy("Admin");	
		data.setUserUpdatedDate(currentTime);
		
		return userDAO.userUpdate(data);

	}

	@Override
	@Transactional
	public int delete(MUser data) {
		
		return userDAO.userDelete(data);

	}

}
