package com.example.dao;

import java.util.List;
import com.example.entity.User;

public interface UserDao 
{
	String addUser(User u);
	String deleteUser(int id);
	String updateUser(User u);
	User displayByid(int id);
	List<User> displayAll();
}