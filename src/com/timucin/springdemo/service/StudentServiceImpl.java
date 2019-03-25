package com.timucin.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.timucin.springdemo.dao.StudentDAO;
import com.timucin.springdemo.entity.Student;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired  //DI
	private StudentDAO studentDAO;
	@Override
    @Transactional //service fetches student list,Data deal with Database
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentDAO.getStudents();
	}
	@Override
	@Transactional 
	public void saveStudent(Student theStudent) {
		 studentDAO.saveStudent(theStudent);
	}
	@Override
	@Transactional
	public Student getStudent(int theId) {
       return studentDAO.getStudent(theId);
		
	}
	@Override
	@Transactional

	public void deleteStudent(int theId) {
	        studentDAO.deleteStudent(theId);

	}
}