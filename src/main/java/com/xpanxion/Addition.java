package com.xpanxion;

public class Addition extends BinaryOperation {

    public Addition() {

        super("+");

    }

    @Override
    protected int calculate(int addend, int augend) {

        return addend + augend;

    }

    @Override
    protected boolean isValid(int addend, int augend) {

        return true;

    }

    @Override
    protected String errorMessage() {
        return "";
    }

}
