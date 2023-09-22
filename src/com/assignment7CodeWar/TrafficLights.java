package com.assignment7CodeWar;

/* Problem Statement:
 * Write a code to Control your town's traffic lights.
 * You need a function to handle each change from green, to yellow, to red, and then to green again.

 * Complete the function that takes a string as an argument representing the current state of the light
 * and returns a string representing the state the light should change to.

 * For example, when the input is green, output should be yellow.
 * */

import java.util.Scanner;

public class TrafficLights {

    public static String updateLight(String current) {
        String lowercase = current.toLowerCase();
        switch (lowercase) {
            case "green":
                return "yellow";
            case "yellow":
                return "red";
            case "red":
                return "green";
            default:
                System.out.println("Invalid traffic light state: " + current);
                return "unknown";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the current traffic light state (green/yellow/red): ");
        String input = sc.nextLine();

        String result = updateLight(input);
        System.out.println("The next traffic light state is: " + result);

        sc.close();
    }
}
