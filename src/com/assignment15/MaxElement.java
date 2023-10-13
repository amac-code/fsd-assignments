package com.assignment15;

//Find the maximum element in an array of integers in Java.

import java.util.*;
public class MaxElement {
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
        int maximumElement = findMax(arr);
        System.out.print("Maximum element is: " + maximumElement);
    }

    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int num: arr) {
            if (num > max){
                max = num;
            }

        }
        return max;
    }
}

/*
 *
 * Time complexity: O(n)
 * Space complexity: O(n)
 *
 * */
