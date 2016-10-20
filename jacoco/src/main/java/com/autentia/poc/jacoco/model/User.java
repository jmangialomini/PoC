package com.autentia.poc.jacoco.model;

public class User {
	
    private long id;
    private String username;
    private String email;
	
    public User(long id,String username, String email){
      super();
      this.id = id;
      this.username = username;
      this.email = email;
    }
	
    @Override
    public String toString(){
      return "ID: "+this.id+" - Username: "+this.username+" - Email: "+ this.email;
    }
}
