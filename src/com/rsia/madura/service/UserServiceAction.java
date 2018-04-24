package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.UserDAO;
import com.rsia.madura.entity.MUser;

@Service
public class UserServiceAction implements UserService {
	@Autowired
	private UserDAO userDAO;
	
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
	public int store(MUser userModel) {
		
		return userDAO.userStore(userModel);

	}

	@Override
	@Transactional
	public int update(MUser userModel) {
		
		return userDAO.userUpdate(userModel);

	}

	@Override
	@Transactional
	public int delete(MUser userModel) {
		
		return userDAO.userDelete(userModel);

	}

}
