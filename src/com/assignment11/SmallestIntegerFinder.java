package com.assignment11;
//Problem statement
/**
    * Given an array of integers your solution should find the smallest integer.
          For example:

        * Given [34, 15, 88, 2] your solution will return 2
        * Given [34, -345, -1, 100] your solution will return -345
        * You can assume, for the purpose of this kata, that the supplied array will not be empty.
    *
*/


public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        // Initialize the smallest element with the first element in the array
        int smallest = args[0];

        // Iterate through the array to find the smallest element
        for (int i = 1; i < args.length; i++) {
            if (args[i] < smallest) {
                smallest = args[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        // Test the function with example arrays
        int[] array1 = {34, 15, 88, 2};
        int[] array2 = {34, -345, -1, 100};

        System.out.println("Smallest Integer in array1: " + findSmallestInt(array1)); // Should output 2
        System.out.println("Smallest Integer in array2: " + findSmallestInt(array2)); // Should output -345
    }
}
