package com.xpanxion.automation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.xpanxion.automation.pages.Application;
import com.xpanxion.automation.pages.CalculationPage;

public class CalculateScenarios {

    private Application app;

    private CalculationPage start() {

        return this.app.start().loginAs("Brett");

    }

    @Before
    public void setup() {

        this.app = new Application();

    }

    @After
    public void teardown() {

        this.app.quit();

    }

    @Test
    public void addingLargeNumbersCausesError() {

        this.start().performCalculation("Add", "9999999999 1").shouldDisplayResults("9999999999 + 1 = 10000000000");

    }

    @Test
    public void addition() {

        this.start().performCalculation("Add", "1 2").shouldDisplayResults("1 + 2 = 3");

    }

    @Test
    public void subtraction() {

        this.start().performCalculation("Subtract", "45 17").shouldDisplayResults("45 - 17 = 28");

    }

    @Test
    public void multiplication() {

        this.start().performCalculation("Multiply", "7 13").shouldDisplayResults("7 * 13 = 91");

    }

    @Test
    public void division() {

        this.start().performCalculation("Divide", "54 3").shouldDisplayResults("54 / 3 = 18");

    }

    @Test
    public void factorial() {

        this.start().performCalculation("Factorial", "12").shouldDisplayResults("12! = 479001600");

    }

}
