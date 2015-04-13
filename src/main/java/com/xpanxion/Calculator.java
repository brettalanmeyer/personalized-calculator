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

            Addition addition = new Addition();
            result = addition.performOperation(keyboard);

            break;

        case SUBTRACTION:

            Subtraction subtraction = new Subtraction();
            result = subtraction.performOperation(keyboard);

            break;

        case MULTIPLICATION:

            Multiplication multiplication = new Multiplication();
            result = multiplication.performOperation(keyboard);

            break;

        case DIVISION:

            Division division = new Division();
            result = division.performOperation(keyboard);

            break;

        case FACTORIAL:

            Factorial factorial = new Factorial();
            result = factorial.performOperation(keyboard);

            break;

        default:

            result.setTextResult("I'm sorry, I don't understand what '" + operation + "' is.");

            break;

        }

        return result;

    }

}
