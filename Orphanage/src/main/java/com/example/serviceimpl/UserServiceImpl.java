package com.example.serviceimpl;

import java.util.List;
import com.example.Orphanage.Config;
import com.example.entity.User;
import com.example.service.UserService;

public class UserServiceImpl implements UserService
{
	@Override
	public String addUser(User u) 
	{			return Config.getUserDao().addUser(u);			}

	@Override
	public String deleteUser(int id) 
	{			return Config.getUserDao().deleteUser(id);		}

	@Override
	public String updateUser(User u) 
	{			return Config.getUserDao().updateUser(u);		}

	@Override
	public User displayByid(int id) 
	{			return Config.getUserDao().displayByid(id);		}

	@Override
	public List<User> displayAll() 
	{			return Config.getUserDao().displayAll();		}
}