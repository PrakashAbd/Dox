package com.mindtree.entity;

public class Customer
{
	private Department bank;
	private long accountNumber;
	private String name;
	private String gender;
	private String location;
	private String panId;
	private String dateOfBirth;
	private String createdOn;
	private long phoneNumber;
	
	public Customer() {
		super();
	}

	public Department getBank() {
		return bank;
	}
	public void setBank(Department bank) {
		this.bank = bank;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPanId() {
		return panId;
	}
	public void setPanId(String panId) {
		this.panId = panId;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "bank=" + bank + ", accountNumber=" + accountNumber + ", name=" + name + ", gender=" + gender
				+ ", location=" + location + ", panId=" + panId + ", dateOfBirth=" + dateOfBirth + ", createdOn="
				+ createdOn + ", phoneNumber=" + phoneNumber;
	}
}