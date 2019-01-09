package com.example.serviceimpl;

import java.util.List;
import com.example.Orphanage.Config;
import com.example.entity.Orphanage;
import com.example.service.OrphanageService;

public class OrphanageServiceImpl implements OrphanageService
{
	@Override
	public String add(Orphanage o) 
	{			return Config.getOrphanageDao().add(o);					}

	@Override
	public String delete(int orphanageId) 
	{			return Config.getOrphanageDao().delete(orphanageId);	}

	@Override
	public List<Orphanage> displayAll() 
	{			return Config.getOrphanageDao().displayAll();			}

	@Override
	public Orphanage displayById(int id) 
	{			return Config.getOrphanageDao().displayById(id);		}
}