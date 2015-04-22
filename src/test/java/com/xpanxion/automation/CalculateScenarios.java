package com.xpanxion.automation;

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

    @Test
    public void addition() {

        this.start().performCalculation("Add", "1 2").shouldDisplayResults("1 + 2 = 3");
        this.app.quit();

    }

    @Test
    public void subtraction() {

        this.start().performCalculation("Subtract", "45 17").shouldDisplayResults("45 - 17 = 28");
        this.app.quit();

    }

    @Test
    public void multiplication() {

        this.start().performCalculation("Multiply", "7 13").shouldDisplayResults("7 * 13 = 91");
        this.app.quit();

    }

    @Test
    public void division() {

        this.start().performCalculation("Divide", "54 3").shouldDisplayResults("54 / 3 = 18");
        this.app.quit();

    }

    @Test
    public void factorial() {

        this.start().performCalculation("Factorial", "12").shouldDisplayResults("12! = 479001600");
        this.app.quit();

    }

}
