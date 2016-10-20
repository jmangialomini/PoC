package com.autentia.poc.jacoco.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

    long ID = 1l;
    String NAME = "TEST_NAME";
    String EMAIL = "EMAIL_TEST";
	
    @Test
    public void testUser() {
      User userSUT = new User(ID,NAME,EMAIL);
      assertEquals(userSUT.toString(), "ID: "+this.ID+" - Username: "+this.NAME+" - Email: "+ this.EMAIL);
    }
}
