package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.Student;

public interface StudentDao 
{
	String addStudent(Student s);
	String deleteStudent(int rollNum);
	List<Student> displayAll();
	List<Student> displayById(int rollNum);
}
