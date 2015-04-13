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

        Operation op = null;

        Calculation result = new Calculation();

        switch (operation) {

        case QUIT:

            result.setTextResult("Goodbye, " + name);
            break;

        case ADDITION:

            op = new Addition();
            break;

        case SUBTRACTION:

            op = new Subtraction();
            break;

        case MULTIPLICATION:

            op = new Multiplication();
            break;

        case DIVISION:

            op = new Division();
            break;

        case FACTORIAL:

            op = new Factorial();
            break;

        default:

            result.setTextResult("I'm sorry, I don't understand what '" + operation + "' is.");
            break;

        }

        if (op != null) {

            result = op.performOperation(keyboard);

        }

        return result;

    }
}
