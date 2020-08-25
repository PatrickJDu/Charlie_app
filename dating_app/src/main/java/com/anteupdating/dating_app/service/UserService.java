package com.anteupdating.dating_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anteupdating.dating_app.entity.User;
import com.anteupdating.dating_app.exception.UserNotFoundException;
import com.anteupdating.dating_app.repository.UserRepository;


@Service
public class UserService implements UserServiceInterface{
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public User addNewUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public User updateUser(User user, Long id) throws UserNotFoundException {
		Optional<User> userOption = userRepo.findById(id);
		if(userOption.isPresent()) {
			user.setId(userOption.get().getId());
			user.setFirstName(userOption.get().getFirstName());
			user.setMiddleName(userOption.get().getMiddleName());
			user.setLastName(userOption.get().getLastName());
			user.setEmail(userOption.get().getEmail());
			user.setGender(userOption.get().getGender());
			user.setPhoneNumber(userOption.get().getPhoneNumber());
			user.setDateAddress(userOption.get().getDateAddress());
			user.setDateRadius(userOption.get().getDateRadius());
			user.setUsername(userOption.get().getUsername());
			user.setPassword(userOption.get().getPassword());
			return userRepo.save(user);
		}else {
			throw new UserNotFoundException(id);
		}
	}

	@Override
	public User getUser(Long id) throws UserNotFoundException {
		Optional<User> userOption = userRepo.findById(id);
		if(userOption.isPresent()) {
			return userOption.get();
		}else{
            throw new UserNotFoundException(id);
        }
	}

	@Override
	public void deleteUser(Long id) throws UserNotFoundException {
		Optional<User> userOption = userRepo.findById(id);
		if(userOption.isPresent()) {
			userRepo.deleteById(id);
		}else{
            throw new UserNotFoundException(id);
        }
	}

}

