package com.mindtree.entity;

public class Department 
{
	private int deptId;
	private String deptName;
	
	public Department() {
		super();
	}
	public Department(int id, String deptName) {
		super();
		this.deptId = id;
		this.deptName = deptName;
	}
	public int getId() {
		return deptId;
	}
	public void setId(int id) {
		this.deptId = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "deptId=" + deptId + ", deptName=" + deptName;
	} 
	
}
