package com.xpanxion.automation;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginLogoutScenarios {

    private WebDriver driver;

    @After
    public void tearDown() {

        this.driver.quit();

    }

    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:/projects/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();

    }

    @Test
    public void successfulLoginLogout() {

        this.driver.get("http://localhost:8080/index.html");

        String pageTitle = this.driver.getTitle();
        assertEquals("Web-based Personalized Calculator", pageTitle);

        WebElement guestField = this.driver.findElement(By.name("guest"));
        guestField.sendKeys("Brett");
        guestField.submit();

        ExpectedCondition<Boolean> pageIsLoaded = new ExpectedCondition<Boolean>() {

            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }

        };

        Wait<WebDriver> wait = new WebDriverWait(this.driver, 30);
        wait.until(pageIsLoaded);

        WebElement greeting = this.driver.findElement(By.xpath("/html/body/h1"));
        assertEquals("Hi, Brett", greeting.getText());

        WebElement logoutLink = this.driver.findElement(By.linkText("Log Out"));
        logoutLink.click();

        String currentUrl = this.driver.getCurrentUrl();
        assertEquals("http://localhost:8080/", currentUrl);

    }

    @Test
    public void missingRequiredField() {

        // sad-path scenario
        this.driver.get("http://localhost:8080/");
        this.driver.findElement(By.name("guest")).submit();
        WebElement errorMessage = this.driver.findElement(By.className("error-message"));
        assertEquals(true, errorMessage.isDisplayed());

    }

}
