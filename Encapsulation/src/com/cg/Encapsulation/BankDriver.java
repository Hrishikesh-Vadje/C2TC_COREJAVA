package com.cg.Encapsulation;

import java.util.Scanner;
class BankDriver{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter acc no");
        int accNo=sc.nextInt();
        System.out.println("enter acc holder name");
        String name= sc.next();
        int bal= 10000;
        System.out.println("Enter Password");
        int pswd= sc.nextInt();
       Bank b1= new Bank(accNo,name,bal,pswd);
        for(;;)
        {
        	System.out.println("Choose what to do:\n1. Show Acc Number\n2.Show Name\n3.Show Balance\4.Change Password\n5.Exit");
            switch(sc.nextInt())
            {
                case 1: System.out.println(b1.getAccno());
                break;
                case 2:
                    System.out.println(b1.getAccHolderName());
                case 3:
                	System.out.println(b1.getBalance());
                case 4:
                	
                	System.out.println("Enter new Password");
                		
                			b1.setPswd(sc.nextInt());
                			
                	
                case 5:System.exit(0);
                default:
                {
                	System.out.println("Enter Valid Choice");
                }
                break;
            }
        }


    }
}