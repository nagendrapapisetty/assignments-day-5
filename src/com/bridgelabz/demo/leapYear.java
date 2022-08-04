package com.bridgelabz.demo;
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        int y;
        System.out.println("enter a leap year");
        Scanner r=new Scanner(System.in);
        y=r.nextInt();
        if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
        {
            System.out.println("leap year");
    }
        else {
            System.out.println("not lear year");
        }
}
}