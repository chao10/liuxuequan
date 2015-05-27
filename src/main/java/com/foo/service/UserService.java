package com.foo.service;

import com.foo.entity.User;

public interface UserService {

    public int addUser(User user);

	public int updateUser(User user);

	public int deleteUser(User user);
	
	public User getUser(User user);
}