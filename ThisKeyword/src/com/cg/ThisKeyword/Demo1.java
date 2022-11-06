package com.cg.ThisKeyword;

public class Demo1 {
	void ref(){
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		System.out.println(d);
		d.ref();
		

	}

}
