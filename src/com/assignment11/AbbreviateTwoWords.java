package com.assignment11;

/**
 * Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
 * The output should be two capital letters with a dot separating them.

 * It should look like this:
             * Sam Harris => S.H
             * patrick feeney=>P.F
 */

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        // Split the name into an array of words
        String[] words = name.split(" ");

        // Take the first character from each word and convert it to uppercase
        char firstInitial = Character.toUpperCase(words[0].charAt(0));
        char secondInitial = Character.toUpperCase(words[1].charAt(0));

        // Concatenate the initials with a dot in between
        return firstInitial + "." + secondInitial;
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris")); // Should output "S.H"
        System.out.println(abbrevName("patrick feeney")); // Should output "P.F"
    }
}

