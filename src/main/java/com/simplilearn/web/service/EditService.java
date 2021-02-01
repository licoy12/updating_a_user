package com.simplilearn.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.web.controller.SearchController;
import com.simplilearn.web.model.UserEntity;
import com.simplilearn.web.model.UserEntityCrudRepository;

@Service
public class EditService {

	@Autowired
	UserEntityCrudRepository userEntityCrudRepository;
	private static Logger logger = LoggerFactory.getLogger(SearchController.class);

	public boolean updateUser(UserEntity user) {
		logger.info("Inside updateUser fileName = EditService.java");
		userEntityCrudRepository.save(user);
		return true;
	}
}
