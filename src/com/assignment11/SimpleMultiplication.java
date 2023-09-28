package com.assignment11;

import java.util.Scanner;

//Problem Statement.
//This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.


public class SimpleMultiplication {

    public static int multiplyNumber(int n) {
        // Check if the number is even or odd
        if (n % 2 == 0) {
            return n * 8;
        } else {
            return n * 9;
        }
    }

    public static void main(String[] args) {
        // Initialize a Scanner to read input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        sc.close();

        // Call the multiplyNumber function and store the result
        int result = multiplyNumber(n);

        System.out.println("The result is: " + result);
    }
}
