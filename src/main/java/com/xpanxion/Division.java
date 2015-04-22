package com.xpanxion;

public class Division extends BinaryOperation {

    public Division() {

        super("/");

    }

    @Override
    protected long calculate(long dividend, long divisor) {

        return dividend / divisor;

    }

    @Override
    protected boolean isValid(long dividend, long divisor) {

        return divisor != 0;

    }

    @Override
    protected String errorMessage() {

        return "I'm sorry, but you cannot divide by zero. Only Chuck Norris can do that.";

    }

}
