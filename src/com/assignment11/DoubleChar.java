package com.assignment11;

/**
 * Given a string, you have to return a string in which each character (case-sensitive) is repeated once.

 * Examples  (Input        ->  Output):
             "String"      -> "SSttrriinngg"
             "Hello World" -> "HHeelllloo  WWoorrlldd"
             "1234!_ "     -> "11223344!!__  "
 */

public class DoubleChar {

    public static String doubleChar(String s) {
        StringBuilder doubledString = new StringBuilder(); // Using StringBuilder for efficient string manipulation

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            doubledString.append(c).append(c); // Appending each character twice
        }

        return doubledString.toString();
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("String"));
        System.out.println(doubleChar("Hello World"));
        System.out.println(doubleChar("1234!_ "));
    }
}

