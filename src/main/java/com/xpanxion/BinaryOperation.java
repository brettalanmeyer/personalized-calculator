package com.xpanxion;

public class BinaryOperation {

    private final String operation;

    public BinaryOperation(String op) {
        this.operation = op;
    }

    public Calculation successfulCalculation(int leftHandSide, int rightHandSide, int result) {

        Calculation calculation = new Calculation();

        calculation.setTextResult("    " + leftHandSide + " " + this.operation + " " + rightHandSide + " = " + result);

        return calculation;

    }

}
