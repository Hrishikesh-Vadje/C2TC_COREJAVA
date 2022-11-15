package com.cg.Encapsulation;

import java.util.Scanner;
class Facebook {
    private String name;
    private int pswd;
    Scanner sc=new Scanner(System.in);
    public Facebook(String s1, int i1)
    {
        name=s1;
        pswd=i1;
    }
    public String getName()
    {
        System.out.println("Enter the Password");
        int p1=sc.nextInt();
        if(p1==pswd)
            return name;
        else return null;
    }
    public void setName(String s1)
    {
        System.out.println("Enter the Password");
        int p1=sc.nextInt();
        if(p1==pswd)
        {
            name=s1;
            System.out.println("Name updated");
        }
        else System.out.println("Enter Valid Password");

    }
}
