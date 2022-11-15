package com.cg.Encapsulation;

import java.util.Scanner;
public class FacebookDriver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name");
        String name= sc.nextLine();
        System.out.println("Enter the password");
        int pswd= sc.nextInt();
        Facebook f1=new Facebook(name,pswd);

        for(;;)
        {
            System.out.println("1. Get Name \n2. Set Name \n3. Exit");
            switch(sc.nextInt())
            {
                case 1:
                    System.out.println(f1.getName());
                break;
                case 2: {
                    String name1=sc.next();
                    f1.setName(name1);}
                break;
                case 3: System.exit(0);
            }

        }


    }
}
