package com.simplilearn.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.web.model.UserEntity;
import com.simplilearn.web.model.UserEntityCrudRepository;

@Service
public class EditService {

	@Autowired
	UserEntityCrudRepository userEntityCrudRepository;

	public boolean updateUser(UserEntity user) {
		System.out.println("Inside updateUser fileName = EditService.java");
		userEntityCrudRepository.save(user);
		return true;
	}
}
