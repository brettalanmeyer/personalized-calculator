package com.xpanxion.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {

    private WebDriver driver;

    public LoginPage start() {

        System.setProperty("webdriver.chrome.driver", "C:/projects/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();

        return new LoginPage(this.driver);

    }

    public WebDriver getDriver() {

        return this.driver;

    }

    public void quit() {

        this.driver.quit();

    }

}
