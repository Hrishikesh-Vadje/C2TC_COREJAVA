package com.cg.Encapsulation;

import java.util.Scanner;
class Bank{
    private int accno;
    private String accHolderName;
    private int balance;
    private int pswd;
    Scanner sc=new Scanner(System.in);
    public Bank(int a1,String ah1,int b1,int p1)
    {
        accno=a1;
        accHolderName=ah1;
        balance=b1;
        pswd=p1;
    }

    public int getAccno() {
        System.out.println("Enter Password");
        int pw=sc.nextInt();
        if (pw==pswd)
        return accno;
        else return 0;
    }

    public String getAccHolderName() {
        System.out.println("Enter Password");
        int pw=sc.nextInt();
        if (pw==pswd)
        return accHolderName;
        else return null;
    }

	public int getBalance() {
		System.out.println("Enter Password");
        int pw=sc.nextInt();
        if (pw==pswd)
        return balance;
        else
        
        	return 0;
	
	}

	

	 public void setPswd(int np)
	    {
	        System.out.println("Enter the previous Password");
	        int p1=sc.nextInt();
	        if(p1==pswd)
	        {
	            pswd=np;
	            System.out.println("Password updated");
	        }
	        else System.out.println("Enter Valid Password");

	    }
	


	
	
}