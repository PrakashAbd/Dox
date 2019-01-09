package com.mindtree.entity;

public class Student 
{
	int rollNum;
	String name;
	double percentage;
	
	public Student() {
		super();
	}
	public Student(int rollNum, String name, double percentage) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.percentage = percentage;
	}
	
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "rollNum=" + rollNum + ", name=" + name + ", percentage=" + percentage;
	}
	
}