package com.letsgettin.sahiudhyog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.letsgettin.sahiudhyog.model.Users;
import com.letsgettin.sahiudhyog.reposiotry.UsersRepository;
import com.letsgettin.sahiudhyog.service.UsersServiceImpl;

@RestController
@RequestMapping(value="search")
public class UsersController {

	@Autowired
	private UsersServiceImpl userService;
	
	@Autowired
	private UsersRepository usr;
	
	
	
//	
//	@Autowired(no need to use)
//	private UsersService usersservice;
	
	
//get data by name	
	 @GetMapping(value="name/{name}")
	 public List<Users> searchName(@PathVariable("name") final String text){
		 return usr.findByName(text);
	 }
	 
//get data by email	 
	 @GetMapping(value="email/{email}")
	 public List<Users> searchEmail(@PathVariable("email") final String  email){
		 return usr.findByEmail(email);
	  }
	
//get all users data	 
	 @GetMapping(value = "/all")
	 public List<Users> searchAll() {
	     List<Users> usersList = new ArrayList<>();
	     Iterable<Users> userses = usr.findAll();
	     userses.forEach(usersList::add);
	     return usersList;
	 }
	 
//Get data by keyword
	 
	 @GetMapping(value="/search/{keyword}",produces= {MimeTypeUtils.APPLICATION_JSON_VALUE})
		public ResponseEntity<List<String>> search(@PathVariable("keyword") String keyword)
		{
			try {
				
				return new ResponseEntity<List<String>>(userService.search(keyword),HttpStatus.OK);
				
			} catch (Exception e)
			{
				return new ResponseEntity<List<String>>(HttpStatus.BAD_REQUEST);
			}
		}}
