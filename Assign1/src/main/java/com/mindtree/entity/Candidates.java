package com.mindtree.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SecondaryTable;

@Entity
@SecondaryTable(name="Constituency")

public class Candidates 
{
	@Id
	int id;
	@OneToOne
	@JoinColumn(name="constituencyId")
	Constituency constituency;
	String name;
	String party;
	
	public Candidates() {
		super();
		this.constituency = new Constituency();
		// TODO Auto-generated constructor stub
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
	
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public Constituency getConstituency() {
		return constituency;
	}
	public void setConstituency(Constituency constituency) {
		this.constituency = constituency;
	}
	@Override
	public String toString() {
		return "id=" + id + ", constituency=" + constituency + ", name=" + name + ", party=" + party;
	}
	
	
}
