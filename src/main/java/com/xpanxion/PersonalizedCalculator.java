package com.xpanxion;

import java.util.Scanner;

public class PersonalizedCalculator {

    public static final int ADDITION       = 1;
    public static final int SUBTRACTION    = 2;
    public static final int MULTIPLICATION = 3;
    public static final int DIVISION       = 4;

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

        System.out.println(" )" + ADDITION + " Addition");
        System.out.println(" )" + SUBTRACTION + " Subtraction");
        System.out.println(" )" + MULTIPLICATION + " Multiplication");
        System.out.println(" )" + DIVISION + " Division");

        System.out.print("What would you like to do? ");

        int operation = keyboard.nextInt();

        if (operation == ADDITION) {

            promptForNumbers();

            int addend = keyboard.nextInt();
            int augend = keyboard.nextInt();

            int sum = addend + augend;

            displayResultHeader();
            System.out.println("    " + addend + " + " + augend + " = " + sum);

        } else if (operation == SUBTRACTION) {

            promptForNumbers();

            int minuend = keyboard.nextInt();
            int subtrahend = keyboard.nextInt();

            int difference = minuend - subtrahend;

            displayResultHeader();
            System.out.println("    " + minuend + " - " + subtrahend + " = " + difference);

        } else if (operation == MULTIPLICATION) {

            promptForNumbers();

            int multiplier = keyboard.nextInt();
            int multiplicand = keyboard.nextInt();

            int product = multiplier * multiplicand;

            displayResultHeader();
            System.out.println("    " + multiplier + " * " + multiplicand + " = " + product);

        } else if (operation == DIVISION) {

            promptForNumbers();

            int dividend = keyboard.nextInt();
            int divisor = keyboard.nextInt();

            if (divisor == 0) {

                System.out.println("I'm sorry, but you cannot divide by zero. Only Chuck Norris can do that.");

            } else {

                int quotient = dividend / divisor;

                displayResultHeader();
                System.out.println("    " + dividend + " / " + divisor + " = " + quotient);

            }

        } else {

            System.out.println("I'm sorry, I don't understand what '" + operation + "' is.");

        }

    }
}
