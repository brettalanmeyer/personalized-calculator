package com.xpanxion.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatedTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/projects/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.reddit.com");

        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        driver.quit();

    }
}
