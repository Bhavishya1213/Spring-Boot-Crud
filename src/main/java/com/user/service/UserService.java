package com.user.service;

import com.user.entity.User;

public interface UserService {

	public User addUser(User user);

	public User updateUser(User user);

	public User readUser(Integer Id);

	public User deleteUser(Integer id);

}
