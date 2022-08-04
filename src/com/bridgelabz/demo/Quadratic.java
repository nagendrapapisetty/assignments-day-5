package com.bridgelabz.demo;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ordinate of quadratic equation");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float d = b * b - 4 * a * c;
        double root1 = (-b + Math.sqrt(d)) / (2 * a);
        double root2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println("Root of quadratic Equation is: " + root1 + "and" + root2);
    }
}