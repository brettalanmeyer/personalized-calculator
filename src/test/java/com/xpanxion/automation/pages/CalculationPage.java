package com.xpanxion.automation.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CalculationPage {

    private final WebDriver driver;

    public CalculationPage(WebDriver driver) {

        this.driver = driver;

    }

    public CalculationPage shouldDisplayGreeting(String expectedGreeting) {

        WebElement greeting = this.driver.findElement(By.xpath("/html/body/h1"));
        assertEquals(expectedGreeting, greeting.getText());

        return this;

    }

    public CalculationPage shouldDisplayResults(String expectedResults) {

        WebElement results = this.driver.findElement(By.id("result-text"));
        assertEquals(expectedResults, results.getText());

        return this;

    }

    public CalculationPage performCalculation(String operationText, String operandsText) {

        WebElement comboBox = this.driver.findElement(By.name("operation"));
        Select operation = new Select(comboBox);
        operation.selectByVisibleText(operationText);

        WebElement operands = this.driver.findElement(By.name("operands"));
        operands.sendKeys(operandsText);
        operands.submit();

        return this;

    }

    public LoginPage logout() {

        WebElement logoutLink = this.driver.findElement(By.linkText("Log Out"));
        logoutLink.click();

        return new LoginPage(this.driver);

    }

}
