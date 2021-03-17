package com.juan.license.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.license.models.User;
import com.juan.license.repositories.UserRepository;

@Service
public class UserService {
	private UserRepository uRepo;
	
	public UserService(UserRepository repo) {
		this.uRepo = repo;
	}
	// Get all users
	public List<User> getAllUsers() {
		return this.uRepo.findAll();
	}
	
	// Get one user
	public User getOneUser(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}
	
	// Create User
	public User createUser(User newUser) {
		return this.uRepo.save(newUser);
	}
}
