package com.mindtree.entity;

public class Employee extends Department
{
	private int empId;
	private String name;
	private double salary;
	
	public Employee() {
		super();
	}
	
	public Employee(int empId, String name, double salary) {
		super();
		
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public void setDept(int id, String name)
	{
		this.setId(id);
		this.setDeptName(name);
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
	@Override
	public String toString() {
		return "empId=" + empId + ", name=" + name + ", salary=" + salary;
	}
		
}
