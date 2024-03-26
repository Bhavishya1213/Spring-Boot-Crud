package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.User;
import com.user.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		User adduser = userService.addUser(user);
		return new ResponseEntity<User>(adduser, HttpStatus.CREATED);

	}

	@PutMapping("/update")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		User updateUser = userService.updateUser(user);
		return new ResponseEntity<User>(updateUser, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable("id") Integer Id) {
		User deleteUser = userService.deleteUser(Id);
		return new ResponseEntity<User>(deleteUser, HttpStatus.OK);
	}

	@GetMapping("/read/{id}")
	public ResponseEntity<User> readUser(@PathVariable("id") Integer Id) {
		User readUser = userService.deleteUser(Id);
		return new ResponseEntity<User>(readUser, HttpStatus.OK);
	}
}
