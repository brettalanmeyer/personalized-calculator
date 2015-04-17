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

    private WebDriver driver;

    public static void main(String[] args) {

        AutomatedTest test = new AutomatedTest();

        test.setup();
        test.successfulLoginLogout();
        test.missingRequiredField();
        test.tearDown();

    }

    private void tearDown() {

        this.driver.quit();

    }

    private void setup() {

        System.setProperty("webdriver.chrome.driver", "C:/projects/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();

    }

    protected void successfulLoginLogout() {

        this.driver.get("http://localhost:8080/index.html");

        String pageTitle = this.driver.getTitle();
        System.out.println(pageTitle);

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
        System.out.println(greeting.getText());

        WebElement logoutLink = this.driver.findElement(By.linkText("Log Out"));
        logoutLink.click();

        String currentUrl = this.driver.getCurrentUrl();
        System.out.println(currentUrl);

    }

    protected void missingRequiredField() {

        // sad-path scenario
        this.driver.get("http://localhost:8080/");
        this.driver.findElement(By.name("guest")).submit();
        WebElement errorMessage = this.driver.findElement(By.className("error-message"));
        System.out.println(errorMessage.isDisplayed());

    }

}
