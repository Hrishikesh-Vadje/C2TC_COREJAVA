package com.cg.ThisKeyword;

//Referring current class instance variable

public class Base{
	int rollno;
	String name;
	String email;
	float cgpa;
	
	public Base(int rollno, String name, String email, float cgpa) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.email = email;
		this.cgpa = cgpa;
	}
	
	 void Display()
	 {
		 System.out.println("Roll: "+rollno);
		 System.out.println("name: "+name);
		 System.out.println("email: "+email);
		 System.out.println("cgpa: "+cgpa);
	 }
	 
	
}


