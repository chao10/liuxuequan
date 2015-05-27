package com.foo.entity;

/**
 * A list of people that the given user is following.
 */
public class Following {

	private int id;
	private int following;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFollowing() {
		return following;
	}

	public void setFollowing(int following) {
		this.following = following;
	}
}