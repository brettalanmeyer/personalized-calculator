package com.xpanxion.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomatedTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/projects/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8080/index.html");

        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

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

        WebElement greeting = driver.findElement(By.xpath("/html/body/h1"));
        System.out.println(greeting.getText());

        driver.quit();

    }
}
