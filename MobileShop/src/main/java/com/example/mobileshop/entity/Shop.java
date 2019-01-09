package com.example.mobileshop.entity;

public class Shop 
{
	String shopId;
	String name;
	String location;
	String mobileNumber;
	public Shop(String shopId, String name, String location, String mobileNumber) {
		super();
		this.shopId = shopId;
		this.name = name;
		this.location = location;
		this.mobileNumber = mobileNumber;
	}
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "shopId=" + shopId + ", name=" + name + ", location=" + location + ", mobileNumber=" + mobileNumber;
	}
	
}