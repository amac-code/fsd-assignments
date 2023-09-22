package com.assignment7CodeWar;

import java.util.*;

public class RemoveChars {
    public static String remove(String str) {
        // Check if the input string has at least two characters
        if (str.length() >= 2) {
            // Use substring to remove the first and last characters
            return str.substring(1, str.length() - 1);
        } else {
            // Return an empty string for strings with less than two characters
            return "";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = remove(input);
        System.out.println("Original: " + input);
        System.out.println("After removal: " + result);

        sc.close();
    }
}