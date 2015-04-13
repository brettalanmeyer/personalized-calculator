package com.xpanxion;

import java.util.Scanner;

public class Factorial implements Operation {

    public Calculation performOperation(Scanner keyboard) {

        int value = keyboard.nextInt();
        int total = 1;

        Calculation result = new Calculation();

        for (int i = value; i > 0; i--) {

            total = total * i;

        }

        result.setTextResult("    " + value + "! = " + total);

        return result;

    }

}
