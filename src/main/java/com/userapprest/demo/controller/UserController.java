package com.userapprest.demo.controller;
	
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userapprest.demo.model.User;

	@RestController
	public class UserController {

	  @RequestMapping("/user")
	  public List<User> getUsers() {
	    
		  List<User> users = new ArrayList();
		  
		  	//user1
			User user1 = new User();
			user1.setUserId(100);
			user1.setUserName("Macus");;
			
			//user2
			User user2 = new User();
			user2.setUserId(101);
			user2.setUserName("Ephrem");;
			
			//users
			users.add(user1);
			users.add(user2);
			
		  
		  return users;
	  }
}