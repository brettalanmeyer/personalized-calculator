package com.xpanxion;

import java.util.Scanner;

public abstract class BinaryOperation implements Operation {

    private final String operation;

    protected abstract long calculate(long leftHandSide, long rightHandSide);

    protected abstract boolean isValid(long leftHandSide, long rightHandSide);

    protected abstract String errorMessage();

    public BinaryOperation(String op) {

        this.operation = op;

    }

    public Calculation performOperation(Scanner keyboard) {

        long leftHandSide = keyboard.nextLong();
        long rightHandSide = keyboard.nextLong();

        if (this.isValid(leftHandSide, rightHandSide)) {

            long result = this.calculate(leftHandSide, rightHandSide);
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

    public Calculation successfulCalculation(long leftHandSide, long rightHandSide, long result) {

        Calculation calculation = new Calculation();

        calculation.setTextResult("    " + leftHandSide + " " + this.operation + " " + rightHandSide + " = " + result);

        return calculation;

    }

}
