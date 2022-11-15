package com.cg.Encapsulation;

import java.util.Scanner;
public class FlightDriver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Flight number");
        int fNo= sc.nextInt();
        System.out.println("Enter Airport name");
        String airportName= sc.next();
        System.out.println("Enter address");
        String address = sc.next();

        Airport a1=new Airport(new Flight(fNo),airportName,address);
        System.out.println(a1.airportName);
        System.out.println(a1.address);
        System.out.println(a1.f1.getfNo());

    }
}