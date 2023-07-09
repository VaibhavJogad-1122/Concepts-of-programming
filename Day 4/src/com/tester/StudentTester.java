package com.tester;
import java.util.Scanner;

import com.code.Student;

public class StudentTester {
	public static void main(String[] args) {
		Student s1 = new Student();
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Roll no.:  Marks 1: Marks 2: Marks 3: ");
		s1.acceptInfo(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		s1.display();
	}

}
