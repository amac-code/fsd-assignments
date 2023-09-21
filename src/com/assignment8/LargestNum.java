package com.assignment8;

//Create a method that accepts a list of numbers and returns the largest number in the list.

import java.util.*;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to enter?: ");
        int size = sc.nextInt();

        int result = large(size, sc);

        System.out.println("\nLargest number among this is: " + result);
    }

    public static int large(int size, Scanner sc) { //passed the Scanner from the main method to the large method as an argument

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Numbers you have entered are: " + Arrays.toString(arr));

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }


}
