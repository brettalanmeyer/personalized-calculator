package com.xpanxion.automation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculateScenarios {

    @Test
    public void addition() {

        System.setProperty("webdriver.chrome.driver", "C:/projects/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8080/index.html");

        WebElement guestField = driver.findElement(By.name("guest"));
        guestField.sendKeys("Brett");
        guestField.submit();

        ExpectedCondition<Boolean> pageIsLoaded = new ExpectedCondition<Boolean>() {

            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }

        };

        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        wait.until(pageIsLoaded);

        WebElement comboBox = driver.findElement(By.name("operation"));
        Select operation = new Select(comboBox);
        operation.selectByVisibleText("Add");

        WebElement operands = driver.findElement(By.name("operands"));
        operands.sendKeys("1 2");
        operands.submit();

        WebElement results = driver.findElement(By.id("result-text"));
        assertEquals("1 + 2 = 3", results.getText());

        driver.quit();

    }
}
