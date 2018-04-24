package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MUser;

public interface UserService {
	public List<MUser> getUsers();
	public MUser getUser(int userId);
	
	public int store(MUser userModel);
	public int update(MUser userModel);
	public int delete(MUser userModel);
}
