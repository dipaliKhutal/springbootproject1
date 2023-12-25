package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserLogindto;
import com.example.demo.dto.Userdto;
import com.example.demo.entity.User;

public interface UserService {
	List<User> getAllUser();

	User getUserById(long id);

	User addDoctor(User user);

	User updateUser(long id, User updatedUser);

	void deleteUser(long id);
	User loginUser(String email, String password);

	User registerUser(Userdto userdto);
	User loginUser(UserLogindto credentials);

}
