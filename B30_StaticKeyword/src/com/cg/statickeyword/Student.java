
package com.cg.statickeyword;
import java.util.Scanner;
public class Student {

	private String name;
	private long mobile;
	private String email;
	private static String college="jspm ntc";
	private float cgpa;
	public String getName() {
		return name;
	}
	                         
	public Student(String name, long mobile, String email,  float cgpa) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		
		this.cgpa = cgpa;
	}

	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	
	public void change()
	{
		
		this.name="Human";
	}
	
	public void info()
	{
		System.out.println(name+" "+mobile+" "+email+" "+college+" "+cgpa);
		
	}
	

}
