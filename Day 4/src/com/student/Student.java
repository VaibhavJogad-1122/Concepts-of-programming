package com.student;

public class Student {
	private int rollNo;
	private String name, address;
	private static int rollCounter; 
	
	static {
		rollCounter = 100;
	}

	public Student(String name, String address) {
		rollCounter++;
		this.rollNo = rollCounter;
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getRollNo()
	{
		return rollNo;
	}
	
	public void display() {
		System.out.println("Roll No.: " +rollNo+" Name: "+name+" Address: "+address);
	}
	
}
