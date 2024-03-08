package com.springboot.crud.operation.entitites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //this class's variables will be mapped to relational database columns
public class Student 
{
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private String name;
	private int rollNo;
	private int standard;
	
	//default constructor
	public Student() 
	{
		super();
	}
	
	//toString method
	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", standard=" + standard + "]";
	}

	//parameterized constructor
	public Student(int id, String name, int rollNo, int standard) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.standard = standard;
	}

	//getter and setter
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getRollNo() 
	{
		return rollNo;
	}

	public void setRollNo(int rollNo) 
	{
		this.rollNo = rollNo;
	}

	public int getStandard() 
	{
		return standard;
	}

	public void setStandard(int standard) 
	{
		this.standard = standard;
	}
}