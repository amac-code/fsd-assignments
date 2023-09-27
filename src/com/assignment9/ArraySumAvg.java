package com.assignment9;


//* Problem 2: Array Sum and Average
//* Create an array of integers in Java. Calculate and print the sum of all the elements in the array.
//* Then, calculate and print the average of the elements.


import java.util.*;

public class ArraySumAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to enter?: ");
        int n = sc.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }

        System.out.println("Numbers you have entered are: " + Arrays.toString(num));

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += num[i];
        }

        System.out.println("Sum of all the numbers in this array is: " + sum);
        int avg = sum / n;
        System.out.println("Average of all the numbers is: " + avg);
        sc.close();
    }

}