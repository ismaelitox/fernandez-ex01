/*
* UCF COP3330 Fall 2021 Assignment 1 Solution
* Copyright 2021 Jonah Fernandez
*/

import java.util.Scanner;

public class Solution01 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution01 app  = new Solution01();

        String name = app.readName();
        String outputString = app.generateOutputString(name);
        app.printOutput(outputString);
    }

    private void printOutput(String outputString) { {
        System.out.println(outputString);
    }
    }

    private String generateOutputString(String name) {return String.format("Hello, %s, nice to meet you!", name);
    }

    private String readName() {
        System.out.println("What is your name? ");
        return in.nextLine();
    }
}
