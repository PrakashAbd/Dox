package com.example.mobileshop.dao;

import java.util.List;

import com.example.mobileshop.entity.Shop;

public interface Dao 
{
	String add(Shop shop) throws Exception;
	String delete(String id);
	Shop displayById(String id);
	List<Shop> display();
}
