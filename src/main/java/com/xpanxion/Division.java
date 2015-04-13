package com.xpanxion;

import java.util.Scanner;

public class Division {

    public Calculation performOperation(Scanner keyboard) {

        int dividend = keyboard.nextInt();
        int divisor = keyboard.nextInt();

        Calculation result = new Calculation();

        if (divisor == 0) {

            result.setTextResult("I'm sorry, but you cannot divide by zero. Only Chuck Norris can do that.");

        } else {

            int quotient = dividend / divisor;

            result.setTextResult("    " + dividend + " / " + divisor + " = " + quotient);

        }

        return result;

    }

}
