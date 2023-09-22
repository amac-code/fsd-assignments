package com.assignment7CodeWar;


/*Problem Statement:
* It's the academic year's end, fateful moment of your school report.
* The averages must be calculated. All the students come to you and entreat you to calculate their average for them.
*
*
* Return the average of the given array rounded down to its nearest integer.
*
* The array will never be empty.
* */


import java.util.*;

public class School {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the total marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        System.out.println("The average mark is: " + getAverage(marks));
        sc.close();
    }

    public static int getAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
}