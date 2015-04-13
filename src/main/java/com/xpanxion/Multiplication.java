package com.xpanxion;

public class Multiplication extends BinaryOperation {

    public Multiplication() {

        super("*");

    }

    @Override
    protected int calculate(int multiplier, int multiplicand) {

        return multiplier * multiplicand;

    }

    @Override
    protected boolean isValid(int multiplier, int multiplicand) {

        return true;

    }

    @Override
    protected String errorMessage() {
        return "";
    }

}
