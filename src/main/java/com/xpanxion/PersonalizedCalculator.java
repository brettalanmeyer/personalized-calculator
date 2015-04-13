package com.xpanxion;

import java.util.Scanner;

public class PersonalizedCalculator {

    private static void promptForNumbers() {

        System.out.println("");
        System.out.print("Please enter numbers (separated by spaces): ");

    }

    private static void displayResultHeader() {

        System.out.println("");
        System.out.println("Results: ");

    }

    public static void main(String[] args) {

        System.out.println("** Welcome to the Personalized Calcaultor **");
        System.out.println("");
        System.out.print("What is your name? ");

        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.next();

        System.out.println("Hi, " + name);

        System.out.println("I can perform the following operations:");

        System.out.println(" " + Calculator.QUIT + ") Quit");
        System.out.println(" " + Calculator.ADDITION + ") Addition");
        System.out.println(" " + Calculator.SUBTRACTION + ") Subtraction");
        System.out.println(" " + Calculator.MULTIPLICATION + ") Multiplication");
        System.out.println(" " + Calculator.DIVISION + ") Division");
        System.out.println(" " + Calculator.FACTORIAL + ") Factorial");

        int operation = -1;

        while (operation != Calculator.QUIT) {

            System.out.print("What would you like to do? ");

            operation = keyboard.nextInt();

            if (operation >= Calculator.ADDITION && operation <= Calculator.FACTORIAL) {
                promptForNumbers();
            }

            Calculation answer = Calculator.performAction(operation, name, keyboard);

            displayResultHeader();
            System.out.println(answer.getTextResult());

        }

    }
}
