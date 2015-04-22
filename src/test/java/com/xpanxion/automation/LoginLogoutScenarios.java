package com.xpanxion.automation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.xpanxion.automation.pages.Application;
import com.xpanxion.automation.pages.CalculationPage;
import com.xpanxion.automation.pages.LoginPage;

public class LoginLogoutScenarios {

    private LoginPage   loginPage;
    private Application app;

    @After
    public void tearDown() {

        this.app.quit();

    }

    @Before
    public void setup() {

        this.app = new Application();
        this.loginPage = this.app.start();
        this.loginPage.navigationToLoginPage();

    }

    @Test
    public void successfulLoginLogout() {

        this.loginPage.shouldHavePageTitle("Web-based Personalized Calculator");

        CalculationPage calculationPage = this.loginPage.loginAs("Brett");
        calculationPage.shouldDisplayGreeting("Hi, Brett");
        calculationPage.logout();

        this.loginPage.shouldBeDisplayed();

    }

    @Test
    public void missingRequiredField() {

        this.loginPage.loginAs("");
        this.loginPage.shouldDisplayError();

    }

}
