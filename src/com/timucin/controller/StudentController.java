package com.timucin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.timucin.springdemo.dao.StudentDAO;
import com.timucin.springdemo.entity.Student;
import com.timucin.springdemo.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
    @GetMapping("/")
	public String listStudents(Model theModel)
    {
		List<Student>theStudent = studentService.getStudents(); //fetchs students from Database
		
		theModel.addAttribute("student", theStudent); //Fetched students added into model is called "student"
		
		return "list-student";
		
    }
    @GetMapping("/showStudentForm")
	public String showStudentForm(Model theModel)
	{
    	Student theStudent = new Student();
    	theModel.addAttribute("student",theStudent);
		return"student-form";
	}
    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student theStudent)
    {
    	studentService.saveStudent(theStudent);
    	return "redirect:/";
    }
    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("studentID") int theId,Model theModel) //studentId, attached with theId variable
    {
    	Student theStudent= studentService.getStudent(theId);
    	theModel.addAttribute("student",theStudent);
    	return "student-form";
    	
    }
    @GetMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("studentID") int theId,Model theModel) 
    {
    	studentService.deleteStudent(theId);
    	return "redirect:/";
    	
    }
}
