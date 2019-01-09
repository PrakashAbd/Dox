package com.mindtree.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Constituency 
{
	@Id
	int id;
	@Column(name ="PartyName",length=15)
	String name;

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}