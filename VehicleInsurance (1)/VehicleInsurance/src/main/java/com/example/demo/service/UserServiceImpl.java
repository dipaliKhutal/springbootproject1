package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserLogindto;
import com.example.demo.dto.Userdto;
import com.example.demo.entity.User;
import com.example.demo.exception.ResourceNotFound;
import com.example.demo.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private final UserRepo userRepo;

	public UserServiceImpl(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	@Override
	public User getUserById(long id) {
		Optional<User> optionalUser = userRepo.findById(id);
	       return optionalUser.orElse(null);
	}

	@Override
	public User addDoctor(User user) {
		return userRepo.save(user);
	}

	@Override
	public User updateUser(long id, User updatedUser) {
		User existingUser=userRepo.findById(id).orElseThrow(()
				->new ResourceNotFound("User","Id","id"));
		existingUser.setFirstName(updatedUser.getFirstName());
		existingUser.setLastName(updatedUser.getLastName());
		existingUser.setEmail(updatedUser.getEmail());
		existingUser.setContactNumber(updatedUser.getContactNumber());
		existingUser.setPassword(updatedUser.getPassword());
		existingUser.setRoles(updatedUser.getRoles());
		existingUser.setActive(updatedUser.getActive());
		existingUser.setGender(updatedUser.getGender());
		existingUser.setDateOfBirth(updatedUser.getDateOfBirth());
		existingUser.setAddress(updatedUser.getAddress());
		userRepo.save(existingUser);
		
		return existingUser;
	}

	@Override
	public void deleteUser(long id) {
		userRepo.deleteById(id);
		
	}

	@Override
	public User loginUser(String email, String password) {
		User user = userRepo.findByEmail(email);
	    
	    if (user != null && user.getPassword().equals(password)) {
	        return user; // Successful login
	    }
	    
	    return null;
	}

	@Override
	public User registerUser(Userdto userdto) {
		User existingUser = new User();
		existingUser.setFirstName(userdto.getFirstName());
		existingUser.setLastName(userdto.getLastName());
		existingUser.setEmail(userdto.getEmail());
		existingUser.setContactNumber(userdto.getContactNumber());
		existingUser.setPassword(userdto.getPassword());
		existingUser.setRoles(userdto.getRoles());
		existingUser.setActive(userdto.getActive());
		existingUser.setGender(userdto.getGender());
		existingUser.setDateOfBirth(userdto.getDateOfBirth());
		existingUser.setAddress(userdto.getAddress());
		return userRepo.save(existingUser);
	}

	@Override
	public User loginUser(UserLogindto credentials) {
		return loginUser(credentials.getEmail(), credentials.getPassword());
	}
	

}
