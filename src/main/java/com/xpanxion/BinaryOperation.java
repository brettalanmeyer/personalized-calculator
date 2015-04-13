package com.xpanxion;

import java.util.Scanner;

public abstract class BinaryOperation {

    private final String operation;

    protected abstract int calculate(int leftHandSide, int rightHandSide);

    protected abstract boolean isValid(int leftHandSide, int rightHandSide);

    protected abstract String errorMessage();

    public BinaryOperation(String op) {

        this.operation = op;

    }

    public Calculation performOperation(Scanner keyboard) {

        int leftHandSide = keyboard.nextInt();
        int rightHandSide = keyboard.nextInt();

        if (this.isValid(leftHandSide, rightHandSide)) {

            int result = this.calculate(leftHandSide, rightHandSide);
            return this.successfulCalculation(leftHandSide, rightHandSide, result);

        } else {

            return this.invalidCalculation(this.errorMessage());

        }

    }

    public Calculation invalidCalculation(String errorMessage) {

        Calculation result = new Calculation();

        result.setTextResult(errorMessage);

        return result;

    }

    public Calculation successfulCalculation(int leftHandSide, int rightHandSide, int result) {

        Calculation calculation = new Calculation();

        calculation.setTextResult("    " + leftHandSide + " " + this.operation + " " + rightHandSide + " = " + result);

        return calculation;

    }

}
