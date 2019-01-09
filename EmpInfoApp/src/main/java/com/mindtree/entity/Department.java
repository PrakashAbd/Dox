package com.mindtree.entity;
import java.util.HashSet;
import java.util.Set;

public class Department 
{
	int depNum;
	String deptName;
	Set<Employee> employee ;
	
	public Department() {
		super();
		this.employee = new HashSet<Employee>();
	}
	public int getDepNum() {
		return depNum;
	}
	public void setDepNum(int depNum) {
		this.depNum = depNum;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Set<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "depNum=" + depNum + ", deptName=" + deptName + ", employee=" + employee;
	}
}