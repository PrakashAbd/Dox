package com.mindtree.entity;
import java.util.Date;

public class Employee 
{
	int empNum;
	String empName;
	Date dob;
	String email;
	double salary;
	Department department;
	
	public Employee() {
		super();
		this.department = new Department();
	}
	public Employee(int empNum, String empName, Date dob, String email, double salary, Department department) {
		super();
		this.empNum = empNum;
		this.empName = empName;
		this.dob = dob;
		this.email = email;
		this.salary = salary;
		this.department = department;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "empNum=" + empNum + ", empName=" + empName + ", dob=" + dob + ", email=" + email + ", salary=" + salary
				+ ", departmentNo =" + department.getDepNum();
	}
}