package com.springboot.crud.operation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crud.operation.entitites.Student;
import com.springboot.crud.operation.repository.StudentRepository;

@RestController //takes care of mapping request data to the defined request handler method
public class StudentController 
{	
	@Autowired //spring will inject the required dependency into the field when the class is instantiated
	private StudentRepository studentRepository;
	
	@PostMapping("/student/add")
	public Student addStudent(@RequestBody Student student)
	{
		studentRepository.save(student);
		return student;
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable("id") int id)
	{
		Student student = studentRepository.findById(id);
		return student;
	}
	
	@GetMapping("/student")
	public List<Student> getAllStudents()
	{
		List<Student> list = studentRepository.findAll();
		return list;
	}
	
	@PutMapping("/student/{id}")
	public Student updateStudent(@PathVariable("id") int id, @RequestBody Student student)
	{
		studentRepository.save(student);
		return student;
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable("id") int id)
	{
		studentRepository.deleteById(id);
		System.out.println("Deleted");
	}
}
