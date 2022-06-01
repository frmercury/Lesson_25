package com.ex.autopractice;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.ex.automationpractice.BasePage;
import com.ex.utils.JSONUtils;

import org.assertj.core.api.Assertions;
import org.json.JSONObject;
import org.openqa.selenium.Cookie;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeClass
    public void authCookies() throws IOException {

        String mainUser = "qwerty qwerty";

        open("http://automationpractice.com");
        Selenide.clearBrowserCookies();

        JSONObject jsCookies = JSONUtils.getJSONFileAsObj("src/main/resources/Cookies.json");
        Cookie cookie = new Cookie(
                jsCookies.getString("name"),
                jsCookies.getString("value")
        );

        WebDriverRunner.getWebDriver().manage().addCookie(cookie);
        WebDriverRunner.getWebDriver().navigate().refresh();

        BasePage basePage = new BasePage();
        Assertions.assertThat(basePage.getUser().equals(mainUser)).as("Auth completed");
    }
}