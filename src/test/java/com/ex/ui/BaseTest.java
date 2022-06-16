package com.ex.ui;

import com.ex.BaseParameters;
import com.ex.WebDriverManagerClass;
import com.ex.ui.TestRailQA.LoginPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest extends BaseParameters {
    public static WebDriver webDriver;

    @Step("Startup browser")
    @BeforeTest

    public void setUp(){
        webDriver = WebDriverManagerClass.getWebDriver();
    }

    @Step("Login verification")
    @BeforeClass

    public void doLogin() {
        new LoginPage(webDriver, testrail1236)
                .inputEmail(email)
                .inputPassword(password)
                .clickOnLoginButton();
    }
    @Step("Close browser")
    @AfterClass

    public void shutDown() {
        webDriver.quit();
    }
}
