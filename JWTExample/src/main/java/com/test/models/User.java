package com.test.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



public class User {
   private int uId;
   private String username;
   private String email;
   
public int getuId() {
	return uId;
}
public void setuId(int uId) {
	this.uId = uId;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public User(int uId, String username, String email) {
	super();
	this.uId = uId;
	this.username = username;
	this.email = email;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User [uId=" + uId + ", username=" + username + ", email=" + email + "]";
}

   
   
}
