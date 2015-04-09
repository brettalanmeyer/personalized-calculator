package com.xpanxion;

import java.util.Scanner;

public class PersonalizedCalculator {

    public static void main(String[] args) {

        System.out.println("** Welcome to the Personalized Calcaultor **");
        System.out.println("");
        System.out.print("What is your name? ");

        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.next();

        System.out.println("Hi, " + name);

        System.out.println("I can perform the following operations:");
        System.out.println(" 1) Addition");
        System.out.print("What would you like to do? ");

        int operation = keyboard.nextInt();

        if (operation == 1) {

            System.out.println("");
            System.out.print("Please enter numbers (separated by spaces): ");

            int addend = keyboard.nextInt();
            int augend = keyboard.nextInt();

            int sum = addend + augend;

            System.out.println("");
            System.out.println("Results: ");
            System.out.println("    " + addend + " + " + augend + " = " + sum);

        } else {

            System.out.println("I'm sorry, I don't understand what '" + operation + "' is.");

        }

    }
}
