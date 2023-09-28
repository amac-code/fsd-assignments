package com.assignment11;

/*
 * Make a function that will return a greeting statement that uses an input;
 * your program should return,
            "Hello, <name> how are you doing today?".
 */


import java.util.Scanner;

public class ReturningString {

    public static String greet(String name) {
        return "Hello, " + name + " how are you doing today?";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        scanner.close();

        String greeting = greet(name);
        System.out.println(greeting);
    }
}


