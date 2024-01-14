package com.service.user.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class User {

	@Id
	private int userId;
	private String name;
	private String phone;

	public User() {
		super();
	}

	public User(int userId, String name, String phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}

	public int getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", phone=" + phone + "]";
	}

}
