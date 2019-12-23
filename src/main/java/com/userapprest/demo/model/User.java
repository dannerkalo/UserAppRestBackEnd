package com.userapprest.demo.model;

public class User {

	  private int id;
	  private String name;

	  
	  public void setUserId(int id) {
			this.id = id;
	  }
	  
	  public long getUserId() {
	    return this.id;
	  }

	  
	  public void setUserName(String name) {
			this.name = name;
	  }
	  
	  public String getUserName() {
	    return this.name;
	  }
	}