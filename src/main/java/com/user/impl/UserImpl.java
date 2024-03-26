package com.user.impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.user.entity.User;
import com.user.repository.UserRepository;
import com.user.service.UserService;

@Service
public class UserImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) {
		User addUser = userRepository.save(user);

		return addUser;
	}

	@Override
	public User updateUser(User user) {

		User updateUser = userRepository.save(user);
		return updateUser;

	}

	@Override
	public User readUser(Integer Id) {
		Optional<User> readUser = userRepository.findById(Id);
		return readUser.get();
	}

	@Override
	public User deleteUser(Integer id) {
		Optional<User> deleteUser = userRepository.findById(id);
		User user = deleteUser.get();
		userRepository.delete(user);
		return user;
	}

}