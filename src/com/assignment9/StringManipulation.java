package com.assignment9;

/* Problem 1: String Manipulation
           * Write a Java program that takes a user input string and then performs the following operations:
           * Print the length of the string.
           * Convert the string to uppercase and print it.
           * Check if the string contains the word "Java" (case-insensitive) and print "Contains 'Java'" or "Does not contain 'Java'" accordingly.
*
*/


import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        // Print the length of the string
        System.out.println("Length of String is: " + str.length());

        // Convert the string to uppercase and print it
        String upperCase = str.toUpperCase();
        System.out.println("Upper case of String is: " + upperCase);

        // Check if the string contains the word "Java" (case-insensitive)
        boolean check = false;
        for (int i = 0; i <= str.length() - 4; i++) {
            if (str.substring(i, i + 4).equalsIgnoreCase("Java")) {
                check = true;
                break;
            }
        }

        if (check) {
            System.out.println("Contains 'Java'");
        } else {
            System.out.println("Does not contain 'Java'");
        }
    }
}