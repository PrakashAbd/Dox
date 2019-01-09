package com.example.dao;

import java.util.List;
import com.example.entity.Orphanage;

public interface OrphanageDao 
{
	String add(Orphanage o);
	String delete(int orphanageId);
	List<Orphanage> displayAll();
	Orphanage displayById(int id);
}