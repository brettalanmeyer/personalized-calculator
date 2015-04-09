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

    }

}
