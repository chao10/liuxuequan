package com.foo.dao;

import com.foo.entity.User;

public interface UserDAO {

    /**
     * Create a new user
     * 
     * @param user
     * @return
     */
    public int addUser(User user);

    
    /**
     * Update the attributes of a given user
     * 
     * @param user
     * @return
     */
    public int updateUser(User user);
    
    /**
     * Find a user either by id or by username
     * 
     * @param user
     * @return
     */
    public User getUser(User user);

    /**
     * Delete a user either by id or by username
     * 
     * @param user
     * @return
     */
	public int deleteUser(User user);
}