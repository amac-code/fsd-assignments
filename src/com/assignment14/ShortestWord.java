package com.assignment14;

import java.util.*;
public class ShortestWord {
    public static int findShort(String s) {
        String[] words = s.split(" "); // Split the string by spaces
        int minLength = Integer.MAX_VALUE; // Initialize minLength to maximum possible integer value

        // Loop through each word to find the shortest one
        for(String word : words) {
            if(word.length() < minLength) {
                minLength = word.length();
            }
        }

        return minLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initialize Scanner for user input

        System.out.print("Please enter a string of words: ");
        String userInput = scanner.nextLine(); // Read a line of input from the user

        // Call findShort and print the result
        System.out.println("The length of the shortest word is: " + findShort(userInput));

        scanner.close(); // Close the Scanner
    }
}

