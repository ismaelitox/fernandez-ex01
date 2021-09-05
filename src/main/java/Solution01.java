/*
* UCF COP3330 Fall 2021 Assignment 1 Solution
* Copyright 2021 Jonah Fernandez
*/

import java.util.Scanner;

// class to contain solution01 code
public class Solution01 {

    // Creating scanner once to parse input values
    static Scanner in = new Scanner(System.in);
    // main driver method
    public static void main(String[] args) {
        Solution01 app  = new Solution01();
        // initializing string objects
        // 'name' for input method
        // 'outputString' for output method
        //  all will extend 'solution01'
        String name = app.readName();
        String outputString = app.generateOutputString(name);
        app.printOutput(outputString);
    }
    // method used to print output string to console
    // private access modifier for use only within 'solution01' class
    // taking string from 'generateOutputString()' and printing output to console
    // void function returns no value
    private void printOutput(String outputString) { {
        System.out.println(outputString);
         }
    }

    // method used to generate output string
    // private access modifier for use within 'solution01' class
    // taking 'name' from 'in.nextLine();' and passing it into output statement
    // returning value will be passed to 'printOutput'
    private String generateOutputString(String name) {
        // Intellij suggested turning into string.format instead of normal concat output
        return String.format("Hello, %s, nice to meet you!", name);
    }

    // method used for reading user input
    // private access modifier to only be used within 'solution01' class
    // print statement asking for user name
    // using scanner function 'next line' to read until end of line and return value
    // returning returning value will pass through 'generateOutputString'
    private String readName() {
        System.out.print("What is your name? ");
        return in.nextLine();
    }
}
