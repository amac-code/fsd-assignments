package com.assignment14;

import java.util.*;
public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        String[] numStrings = numbers.split(" "); // Split the string by spaces
        int[] nums = new int[numStrings.length];


        for(int i = 0; i < numStrings.length; i++) {
            nums[i] = Integer.parseInt(numStrings[i]);
        }


        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];

        return max + " " + min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter space-separated numbers: ");
        String userInput = scanner.nextLine();

        System.out.println("The highest and lowest numbers are: " + highAndLow(userInput));

        scanner.close();
    }
}
