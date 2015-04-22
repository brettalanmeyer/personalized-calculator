package com.xpanxion;

public class Addition extends BinaryOperation {

    public Addition() {

        super("+");

    }

    @Override
    protected long calculate(long addend, long augend) {

        return addend + augend;

    }

    @Override
    protected boolean isValid(long addend, long augend) {

        return true;

    }

    @Override
    protected String errorMessage() {
        return "";
    }

}
