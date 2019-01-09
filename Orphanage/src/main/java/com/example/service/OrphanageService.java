package com.example.service;

import java.util.List;
import com.example.entity.Orphanage;

public interface OrphanageService 
{
	String add(Orphanage o);
	String delete(int orphanageId);
	List<Orphanage> displayAll();
	Orphanage displayById(int id);
}