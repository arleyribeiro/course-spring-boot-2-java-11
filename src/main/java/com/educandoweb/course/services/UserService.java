package com.educandoweb.course.services;
import com.educandoweb.course.entities.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.repositories.UserRepository;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

	@Autowired
	private UserRepository _userRepository;
	
	public List<User> findAll() {
		return _userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = _userRepository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return _userRepository.save(obj);
	}
}
