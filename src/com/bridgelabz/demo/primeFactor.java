package com.bridgelabz.demo;
import java.util.Scanner;

public class primeFactor {

        public static boolean isPrime(int i)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args)
        {
            Scanner r=new Scanner(System.in);
            System.out.println("Enter the no. to find PrimeFactors:");
            int n= r.nextInt();
            System.out.println();
            System.out.println("The prime factors for the "+n+" is:");
            System.out.println();

            for(int i=2;i<=n;i++)
            {
                if(isPrime(i))
                {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }

