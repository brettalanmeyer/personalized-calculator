package com.xpanxion;

import java.util.Scanner;

public class Calculator {

    public static final int QUIT           = 0;
    public static final int ADDITION       = 1;
    public static final int SUBTRACTION    = 2;
    public static final int MULTIPLICATION = 3;
    public static final int DIVISION       = 4;
    public static final int FACTORIAL      = 5;

    public static Calculation performAction(int operation, String name, Scanner keyboard) {

        Calculation result = new Calculation();

        switch (operation) {

        case QUIT:

            result.setTextResult("Goodbye, " + name);

            break;

        case ADDITION:

            int addend = keyboard.nextInt();
            int augend = keyboard.nextInt();

            int sum = addend + augend;

            result.setTextResult("    " + addend + " + " + augend + " = " + sum);

            break;

        case SUBTRACTION:

            int minuend = keyboard.nextInt();
            int subtrahend = keyboard.nextInt();

            int difference = minuend - subtrahend;

            result.setTextResult("    " + minuend + " - " + subtrahend + " = " + difference);

            break;

        case MULTIPLICATION:

            int multiplier = keyboard.nextInt();
            int multiplicand = keyboard.nextInt();

            int product = multiplier * multiplicand;

            result.setTextResult("    " + multiplier + " * " + multiplicand + " = " + product);

            break;

        case DIVISION:

            int dividend = keyboard.nextInt();
            int divisor = keyboard.nextInt();

            if (divisor == 0) {

                result.setTextResult("I'm sorry, but you cannot divide by zero. Only Chuck Norris can do that.");

            } else {

                int quotient = dividend / divisor;

                result.setTextResult("    " + dividend + " / " + divisor + " = " + quotient);

            }

            break;

        case FACTORIAL:

            int value = keyboard.nextInt();
            int total = 1;

            for (int i = value; i > 0; i--) {

                total = total * i;

            }

            result.setTextResult("    " + value + "! = " + total);

            break;

        default:

            result.setTextResult("I'm sorry, I don't understand what '" + operation + "' is.");

            break;

        }

        return result;

    }

}
