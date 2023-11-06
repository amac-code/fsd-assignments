package com.assignment15;
//Calculate the sum of all elements in an array of integers in Java.


import java.util.*;
public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid array length greater than 0.");
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i]= sc.nextInt();
        }
        System.out.println("Elements of array are: " + Arrays.toString(arr));
        int sumOfElements = sumOfElements(arr);
        System.out.print("Sum of all elements is: " + sumOfElements);
    }

    public static int sumOfElements(int[] arr){
        int sum = 0;
        for (int num: arr) {

            sum+=num;
        }
        return sum;
    }
}


/*
 * Time complexity: O(n)
 * Space complexity: O(n)
 *
 * */