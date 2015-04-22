package com.xpanxion.automation;

import org.junit.Test;

import com.xpanxion.automation.pages.Application;

public class CalculateScenarios {

    @Test
    public void addition() {

        Application app = new Application();

        app.start().loginAs("Brett").performCalculation("Add", "1 2").shouldDisplayResults("1 + 2 = 3");

        app.quit();

    }

}
