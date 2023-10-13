package com.assignment14;

import java.util.Scanner;

public class FilterTheNumber {
    public static long filterString(final String value) {
        StringBuilder numbers = new StringBuilder();

        for(char c : value.toCharArray()) {
            if(Character.isDigit(c)) {
                numbers.append(c);
            }
        }

        return Long.parseLong(numbers.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a string with numbers and letters: ");
        String userInput = sc.nextLine();


        System.out.println("Filtered number from string is: " + filterString(userInput));

        sc.close();
    }
}
