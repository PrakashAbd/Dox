package com.example.mobileshop.service;

import java.util.List;

import com.example.mobileshop.entity.Shop;

public interface Service 
{
	String add(Shop shop) throws Exception;
	String delete(String id) throws Exception;
	Shop displayById(String id) throws Exception;
	List<Shop> display() throws Exception;
}
