package com.assignment9;

/*
* Problem 3: Type Casting and Conditional Statements
*
* Write a Java program that takes a user input number (a floating-point number) and does the following:
* If the number is greater than or equal to 10, cast it to an integer and print "Integer part: [integer value]."
* If the number is less than 10, cast it to an integer and print "Rounded to the nearest integer: [integer value]."
*
* */


import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        float num = sc.nextFloat();
        sc.close();


        cast(num);

    }

    public static void cast(float num) {
        if (num >= 10) {
            int myInt = (int) num;
            System.out.println("Integer part: " + myInt);
        } else if (num < 10) {
            int myInt = (int) num;
            System.out.println("Rounded to the nearest integer: " + myInt);
        }
    }
}
