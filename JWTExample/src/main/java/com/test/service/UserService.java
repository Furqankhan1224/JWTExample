package com.test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.test.models.User;

@Service
public class UserService {
   List<User> list =new ArrayList<>();
   public UserService() {
	 list.add(new User(1 ,"furqan khan","furqan656@gmail.com"));
	 list.add(new User(2,"faiz khan","furqan656@gmail.com"));
	 list.add(new User(4,"rohit kumar","furqan656@gmail.com"));
  }
   
   public List<User> getuser() {
	   return this.list;
   }
}
