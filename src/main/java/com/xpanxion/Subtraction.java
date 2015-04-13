package com.xpanxion;

import java.util.Scanner;

public class Subtraction extends BinaryOperation {

    public Subtraction() {

        super("-");

    }

    public Calculation performOperation(Scanner keyboard) {

        int minuend = keyboard.nextInt();
        int subtrahend = keyboard.nextInt();

        int difference = minuend - subtrahend;

        return this.successfulCalculation(minuend, subtrahend, difference);

    }

}
