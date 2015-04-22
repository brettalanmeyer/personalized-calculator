package com.xpanxion;

public class Subtraction extends BinaryOperation {

    public Subtraction() {

        super("-");

    }

    @Override
    protected long calculate(long minuend, long subtrahend) {

        return minuend - subtrahend;

    }

    @Override
    protected boolean isValid(long minuend, long subtrahend) {

        return true;

    }

    @Override
    protected String errorMessage() {
        return "";
    }

}
