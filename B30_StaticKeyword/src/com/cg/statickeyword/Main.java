package com.cg.statickeyword;
public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Hrishi", 8459933453L, "Hrishi@gmail.com",  8.34f);
		Student s2 = new Student("baburao", 8459955453L, "babu@gmail.com",  8.85f);
		System.out.println(s1.getName()); 
		
		 /*s1.change();
	    System.out.println(s1.getName());  
	    System.out.println(s1.getMobile());
	    System.out.println(s1.getEmail());
	    
	    System.out.println(s1.getCollege());
	    s1.setCollege("TSSM");
	    System.out.println(s1.getCollege());
	    System.out.println(s1.getCgpa());
	    */
		
		
		s1.info();
		s2.info();
	    
	    
	}

}
                               