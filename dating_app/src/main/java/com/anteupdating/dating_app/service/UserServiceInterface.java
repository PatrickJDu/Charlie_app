package com.anteupdating.dating_app.service;

import java.util.List;

import com.anteupdating.dating_app.entity.User;
import com.anteupdating.dating_app.exception.UserNotFoundException;


public interface UserServiceInterface {
	User addNewUser(User user);
	List<User> getAllUsers();
	User updateUser(User user, Long id) throws UserNotFoundException;
	User getUser(Long id) throws UserNotFoundException;
	void deleteUser(Long id)throws UserNotFoundException;
}