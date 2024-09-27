package com.arcada.devops;

// User is a POJO
public class User {
	
	String username;
	String[] friendList;

	public User(String username, String[] friendList) {
		this.username = username;
		this.friendList = friendList;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String[] getFriendList() {
		return this.friendList;
	}
}
