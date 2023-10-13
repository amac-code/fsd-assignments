package com.assignment15;
//Check if an array of integers is sorted in non-decreasing order in Java.

import java.util.*;
public class CheckSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i]= sc.nextInt();
        }

        if (isSorted(arr)) {
            System.out.println("The array is sorted in non-decreasing order.");
        } else {
            System.out.println("The array is not sorted in non-decreasing order.");
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
}

/*

* Time complexity: O(n)
* Space complexity: O(n)
*
* */