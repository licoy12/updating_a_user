package com.simplilearn.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.web.model.UserEntity;
import com.simplilearn.web.model.UserEntityCrudRepository;

@Service
public class SearchService {

	@Autowired
	UserEntityCrudRepository userEntityCrudRepository;

	public boolean searchUser(UserEntity user) {
		System.out.println("Inside SearchUser fileName = SearchService.java");
		Long checkId = checkUser(user);
		if (checkId > 0L) {
			userEntityCrudRepository.deleteById(checkId);
			return true;
		}
		return false;
	}

	public Long checkUser(UserEntity user) {
		System.out.println("Inside checkUser fileName = SearchService.java");
		Iterable<UserEntity> listOfUsers = userEntityCrudRepository.findAll();

		for (UserEntity userEntity : listOfUsers) {
			if (userEntity.getUsername().equalsIgnoreCase(user.getUsername())) {
				return userEntity.getId();
			}
		}
		return 0L;
	}

}
