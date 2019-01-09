package com.mindtree.entity;

public class Employee
{
	private Department bank;
	private int empId;
	private String name;
	private double salary;
	private String department;
	private String designation;
	private String gender;
	private String dateOfJoining;
	
	public Employee() {
		super();
	}	
	public Department getBank() {
		return bank;
	}
	public void setBank(Department bank) {
		this.bank = bank;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	@Override
	public String toString() {
		return "bank=" + bank + ", empId=" + empId + ", name=" + name + ", salary=" + salary + ", department="
				+ department + ", designation=" + designation + ", gender=" + gender + ", dateOfJoining="
				+ dateOfJoining;
	}
}