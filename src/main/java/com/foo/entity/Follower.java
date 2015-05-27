package com.foo.entity;

/**
 * The followers of the given user.
 */
public class Follower {

    private int id;
    private int follower;
    
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getFollower() {
		return follower;
	}
	
	public void setFollower(int follower) {
		this.follower = follower;
	}
}