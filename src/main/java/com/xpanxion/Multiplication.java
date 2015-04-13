package com.xpanxion;

import java.util.Scanner;

public class Multiplication {

    public Calculation performOperation(Scanner keyboard) {

        int multiplier = keyboard.nextInt();
        int multiplicand = keyboard.nextInt();

        int product = multiplier * multiplicand;

        Calculation result = new Calculation();
        result.setTextResult("    " + multiplier + " * " + multiplicand + " = " + product);

        return result;

    }

}
