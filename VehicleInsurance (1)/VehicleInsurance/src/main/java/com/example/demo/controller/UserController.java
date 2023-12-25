package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dto.UserLogindto;
import com.example.demo.dto.Userdto;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
	@Autowired
    private final UserRepo userRepo;
	private UserService userService;
	public UserController(UserRepo userRepo, UserService userService) {
		super();
		this.userRepo = userRepo;
		this.userService = userService;
	}
	@GetMapping
    public List<User> getAllUser() {
        return userRepo.findAll();
    }
	@GetMapping("{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepo.findById(id).orElse(null);
    }
	@PostMapping
    public User addUser(@RequestBody User user) {
        return userRepo.save(user);
    }
	@PutMapping("{id}")
	public ResponseEntity<User>updateUser(@PathVariable("id")
	long id,@RequestBody User updatedUser)
	{
		return new ResponseEntity<User>(userService
				.updateUser(id, updatedUser),HttpStatus.OK);
	}
	 @DeleteMapping("{id}")
	    public void deleteUser(@PathVariable Long id) {
		 userRepo.deleteById(id);
	    }
	 @PostMapping("/register")
	    public ResponseEntity<User> registerUser(@RequestBody Userdto userdto) {
		 User registeredUser = userService.registerUser(userdto);
	        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
	    }
	 @PostMapping("/login")
	    public ResponseEntity<User> loginUser(@RequestBody UserLogindto credentials) {
	        String email = credentials.getEmail();
	        String password = credentials.getPassword();

	        User loggedInUser = userService.loginUser(email, password);

	        if (loggedInUser != null) {
	            return ResponseEntity.ok(loggedInUser);
	        } else {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
	        }
	    }
	

}
