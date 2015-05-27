package com.foo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foo.dao.UserDAO;
import com.foo.entity.User;
import com.foo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public int addUser(User user) {
        return userDAO.addUser(user);
    }

    public int updateUser(User user) {
	    return userDAO.updateUser(user);
    }
    
    public User getUser(User user) {
	    return userDAO.getUser(user);
    }

    public int deleteUser(User user) {
	    return userDAO.deleteUser(user);
    }
}