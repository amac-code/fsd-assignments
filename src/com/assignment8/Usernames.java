package com.assignment8;

// Problem 4: Write a program that uses a list to store usernames.
// Implement a method to add a new name to the list, and another method to check if a given name exists in the list.
// If the name exists, return "Name found," otherwise return "Name not found."


import java.util.*;

public class Usernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> usernames = new ArrayList<>();

        System.out.print("How many usernames do you want to enter?: ");
        int num = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Adding new names
        addNewNames(usernames, num);

        // Checking for existing names
        System.out.print("Enter the username you want to search for: ");
        String searchName = sc.nextLine();
        String result = checkName(usernames, searchName);
        System.out.println(result);
    }

    public static void addNewNames(ArrayList<String> usernames, int num) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            System.out.print("Enter username " + (i + 1) + ": ");
            String name = sc.nextLine();
            usernames.add(name);
        }
    }

    public static String checkName(ArrayList<String> usernames, String searchName) {
        if (usernames.contains(searchName)) {
            return "Name found";
        } else {
            return "Name not found";
        }
    }
}