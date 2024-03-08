package com.springboot.crud.operation.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.springboot.crud.operation.entitites.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>
{
	public Student findById(int id);
	
	public List<Student> findAll();
}