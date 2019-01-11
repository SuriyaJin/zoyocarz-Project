package com.zoyocarz.pojo;

import com.zoyocarz.domain.User;

public class SessionEntity {
	private User userIns;

	public SessionEntity() {
		super();
	}
	
	public SessionEntity(User userIns) {
		super();
		this.userIns = userIns;
	}

	public User getUserIns() {
		return userIns;
	}

	public void setUserIns(User userIns) {
		this.userIns = userIns;
	}

}
