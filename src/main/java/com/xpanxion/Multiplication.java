package com.xpanxion;

public class Multiplication extends BinaryOperation {

    public Multiplication() {

        super("*");

    }

    @Override
    protected long calculate(long multiplier, long multiplicand) {

        return multiplier * multiplicand;

    }

    @Override
    protected boolean isValid(long multiplier, long multiplicand) {

        return true;

    }

    @Override
    protected String errorMessage() {
        return "";
    }

}
