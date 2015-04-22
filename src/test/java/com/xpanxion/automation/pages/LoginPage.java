package com.xpanxion.automation.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private static final String LOGIN_PAGE = "http://localhost:8080/index.html";
    private final WebDriver     driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;

    }

    public LoginPage shouldHavePageTitle(String title) {

        String pageTitle = this.driver.getTitle();
        assertEquals(title, pageTitle);

        return this;

    }

    public LoginPage shouldBeDisplayed() {

        String currentUrl = this.driver.getCurrentUrl();
        assertEquals(LOGIN_PAGE, currentUrl);

        return this;

    }

    public LoginPage shouldDisplayError() {

        WebElement errorMessage = this.driver.findElement(By.className("error-message"));
        assertEquals(true, errorMessage.isDisplayed());

        return this;

    }

    public LoginPage navigationToLoginPage() {

        this.driver.get(LOGIN_PAGE);

        return this;

    }

    public CalculationPage loginAs(String user) {

        this.navigationToLoginPage();
        this.driver.get(LOGIN_PAGE);

        WebElement guestField = this.driver.findElement(By.name("guest"));
        guestField.sendKeys(user);
        guestField.submit();

        ExpectedCondition<Boolean> pageIsLoaded = new ExpectedCondition<Boolean>() {

            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }

        };

        Wait<WebDriver> wait = new WebDriverWait(this.driver, 30);
        wait.until(pageIsLoaded);

        return new CalculationPage(this.driver);

    }

}
