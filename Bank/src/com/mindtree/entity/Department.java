package com.mindtree.entity;

public class Department 
{
	private int bankCode;
	private String name;
	private String ifscCode;
	private String branch;
	public Department() {
		super();
	}
	public Department(int bankCode, String name, String ifscCode, String branch) {
		super();
		this.bankCode = bankCode;
		this.name = name;
		this.ifscCode = ifscCode;
		this.branch = branch;
	}
	public int getBankCode() {
		return bankCode;
	}
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "bankCode=" + bankCode + ", name=" + name + ", ifscCode=" + ifscCode + ", branch=" + branch;
	}
}
