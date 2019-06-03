package com.letsgettin.sahiudhyog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsgettin.sahiudhyog.reposiotry.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService {

	
	@Autowired 
	private UsersRepository usr;

	@Override
	public List<String> search(String keyword) {
		// TODO Auto-generated method stub
		return usr.search (keyword);
	}
	
	
}
