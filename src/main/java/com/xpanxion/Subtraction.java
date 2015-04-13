package com.xpanxion;

public class Subtraction extends BinaryOperation {

    public Subtraction() {

        super("-");

    }

    @Override
    protected int calculate(int minuend, int subtrahend) {

        return minuend - subtrahend;

    }

    @Override
    protected boolean isValid(int minuend, int subtrahend) {

        return true;

    }

    @Override
    protected String errorMessage() {
        return "";
    }

}
