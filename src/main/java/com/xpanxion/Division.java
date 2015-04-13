package com.xpanxion;

import java.util.Scanner;

public class Division extends BinaryOperation {

    public Division() {

        super("/");

    }

    public Calculation performOperation(Scanner keyboard) {

        int dividend = keyboard.nextInt();
        int divisor = keyboard.nextInt();

        if (divisor == 0) {

            Calculation result = new Calculation();

            result.setTextResult("I'm sorry, but you cannot divide by zero. Only Chuck Norris can do that.");

            return result;

        } else {

            int quotient = dividend / divisor;

            return this.successfulCalculation(dividend, divisor, quotient);

        }

    }

}
