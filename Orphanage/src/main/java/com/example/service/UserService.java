package com.example.service;

import java.util.List;
import com.example.entity.User;

public interface UserService 
{
	String addUser(User u);
	String deleteUser(int id);
	String updateUser(User u);
	User displayByid(int id);
	List<User> displayAll();
}