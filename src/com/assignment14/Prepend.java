package com.assignment14;

import java.util.*;
public class Prepend {
    public static List<String> number(List<String> lines) {
        List<String> numberedLines = new ArrayList<>();
        int lineNumber = 1;

        for (String line : lines) {
            numberedLines.add(lineNumber + ": " + line);
            lineNumber++;
        }

        return numberedLines;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        System.out.print("Enter the number of lines you want to input: ");
        int numLines = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numLines; i++) {
            System.out.print("Enter line " + (i + 1) + ": ");
            String line = scanner.nextLine();
            lines.add(line);
        }

        System.out.println("Lists of strings are: " + lines);

        List<String> result = number(lines);
        System.out.println("The numbered lines are:");
        for (String s : result) {
            System.out.println(s);
        }


        scanner.close();
    }
}


/*public class Prepend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter space-separated strings:");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");

        for (String element : elements) {
            list.add(element);
        }

        ArrayList<String> numberedLines = number(list);

        System.out.print("[");
        for (int i = 0; i < numberedLines.size(); i++) {
            System.out.print("\"" + numberedLines.get(i) + "\"");
            if (i != numberedLines.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();
    }

    public static ArrayList<String> number(ArrayList<String> lines) {
        ArrayList<String> numberedLines = new ArrayList<>();
        int lineNumber = 1;

        for (String line : lines) {
            numberedLines.add(lineNumber + ": " + line);
            lineNumber++;
        }

        return numberedLines;
    }
}*/


