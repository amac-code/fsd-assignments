package com.assignment8;

//Implement a function that reverses a given string and returns the reversed string.

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        String reversed = reversedString(original);
        System.out.println("Original String is: " + original);
        System.out.println("Reversed String is: " + reversed);
    }

    public static String reversedString(String original) {
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        return reversed;
    }


}
