package com.foo.entity;

/**
 * 用户表
 */
public class User {

	private int id;
	private String username;
	private String password;
	private boolean locked;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	/**
	 * Return the JSON representation of this object.Intended only for
	 * debugging.
	 */
	@Override
	public String toString() {
		return "{\"id\":" + id + ", \"username\":\"" + username
		        + "\", \"password\":\"" + password + "\", \"locked\":" + locked
		        + "}";
	}
}