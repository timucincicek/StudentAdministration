package com.timucin.springdemo.dao;

import java.util.List;

import com.timucin.springdemo.entity.Student;

public interface StudentDAO {
	  public List<Student>getStudents();  //Getting all students as a list

	public void saveStudent(Student theStudent);

	public Student getStudent(int theId);

	public void deleteStudent(int theId);


}
