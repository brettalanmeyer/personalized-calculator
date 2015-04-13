package com.xpanxion;

import java.util.Scanner;

public class Addition {

    public Calculation performOperation(Scanner keyboard) {

        int addend = keyboard.nextInt();
        int augend = keyboard.nextInt();

        int sum = addend + augend;

        Calculation result = new Calculation();
        result.setTextResult("    " + addend + " + " + augend + " = " + sum);

        return result;

    }

}
