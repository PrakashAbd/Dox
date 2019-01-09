package com.example.entity;

public class Orphanage 
{
	int orphanageId;
	String orphanageName;
	String password;
	String orphanageEmail;
	String phoneNumber;
	String district;
	
	public Orphanage() {
		super();
	}

	public Orphanage(int orphanageId, String orphanageName, String password, String orphanageEmail, String phoneNumber,
			String district) {
		super();
		this.orphanageId = orphanageId;
		this.orphanageName = orphanageName;
		this.password = password;
		this.orphanageEmail = orphanageEmail;
		this.phoneNumber = phoneNumber;
		this.district = district;
	}

	public int getOrphanageId() {
		return orphanageId;
	}

	public void setOrphanageId(int orphanageId) {
		this.orphanageId = orphanageId;
	}

	public String getOrphanageName() {
		return orphanageName;
	}

	public void setOrphanageName(String orphanageName) {
		this.orphanageName = orphanageName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOrphanageEmail() {
		return orphanageEmail;
	}

	public void setOrphanageEmail(String orphanageEmail) {
		this.orphanageEmail = orphanageEmail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
}