package com.assignment8;

import java.sql.SQLOutput;
import java.util.Scanner;

//Problem 1: Write a function that takes two integers as input and returns their sum.
public class SumofIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = sum(a,b);
        System.out.println("Sum of " + a + " and " + b + " is: " + result);
    }

    public static int sum(int a, int b){
        int sum;
        sum = a+b;
        return sum;
    }
}
