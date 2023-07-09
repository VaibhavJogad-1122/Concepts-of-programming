package com.code;

public class Student {
     
	private float percentage,rollNo, marks1, marks2, marks3, total;
	private  String grade;
	
	public void acceptInfo(int rollNo, int marks1, int marks2, int marks3)
	{
		this.rollNo = marks1;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks1;
	}
	
	public void display()
	{
		total = marks1 + marks2+ marks3;
		percentage =(total/300)*100;
		if(percentage>=80)
			grade = "A";
		else if(percentage>=60 && percentage<80)
			grade = "B";
		else
			grade = "C";
		System.out.println("-------Student Info-------");
		System.out.println("Roll No.: " +rollNo);
		System.out.println("Marks 1: " +marks1);
		System.out.println("Marks 2: " +marks2);
		System.out.println("Marks 3: " +marks3);
		System.out.println("Percentage: " +percentage);
		System.out.println("Grade: " +grade);
	}
}
