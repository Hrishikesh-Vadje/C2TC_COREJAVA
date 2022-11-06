package com.cg.ThisKeyword;
//Use to Invoke CUrrent class constructor

public class Base3{
	
	public Base3() {
		this('c');
		System.out.println("hiii");
	}
	
	public Base3(int a) {
		this();
		System.out.println("hello");
	}
	 
	public Base3(char a) {
		System.out.println("hrishi");
	}


}
