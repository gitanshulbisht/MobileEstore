package com.niit.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User 
{
	
	private String name;
	@Id
	private String id;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
