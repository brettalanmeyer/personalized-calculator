package com.xpanxion;

import java.util.Scanner;

public class Subtraction {

    public Calculation performOperation(Scanner keyboard) {

        int minuend = keyboard.nextInt();
        int subtrahend = keyboard.nextInt();

        int difference = minuend - subtrahend;

        Calculation result = new Calculation();
        result.setTextResult("    " + minuend + " - " + subtrahend + " = " + difference);

        return result;

    }

}
