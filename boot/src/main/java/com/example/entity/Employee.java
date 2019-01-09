package com.example.entity;

public class Employee 
{
	String empId;
	String username;
	String password;
	String fullName;
	String emailId;
	String dob;
	String gender;
	String securityQuestion;
	String seurityAnswer;
	
	public Employee() {
		super();
	}
	
	public Employee(String empId, String username, String password, String fullName, String emailId, String dob,
			String gender, String securityQuestion, String seurityAnswer) {
		super();
		this.empId = empId;
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.emailId = emailId;
		this.dob = dob;
		this.gender = gender;
		this.securityQuestion = securityQuestion;
		this.seurityAnswer = seurityAnswer;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getSeurityAnswer() {
		return seurityAnswer;
	}
	public void setSeurityAnswer(String seurityAnswer) {
		this.seurityAnswer = seurityAnswer;
	}

}
