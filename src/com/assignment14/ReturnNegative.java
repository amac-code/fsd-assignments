package com.assignment14;

import java.util.Scanner;

public class ReturnNegative {

    public static int makeNegative(final int x) {
        if (x > 0) {
            return -x;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        int result = makeNegative(userInput);
        System.out.println("The negative form is: " + result);

        scanner.close();
    }
}

