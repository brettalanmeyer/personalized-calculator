package com.xpanxion;

import java.util.Scanner;

public class Multiplication extends BinaryOperation {

    public Multiplication() {

        super("*");

    }

    public Calculation performOperation(Scanner keyboard) {

        int multiplier = keyboard.nextInt();
        int multiplicand = keyboard.nextInt();

        int product = multiplier * multiplicand;

        return this.successfulCalculation(multiplier, multiplicand, product);

    }

}
