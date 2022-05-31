package com.ex.autopractice;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.ex.automationpractice.BasePage;
import com.ex.utils.JSONUtils;

import org.assertj.core.api.Assertions;
import org.json.JSONObject;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class Cookies {

    @Test
    public void cookiesTest() throws IOException {

        double sum = 78.99;

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
        basePage.hoverCartShouldBeEqual(sum);
    }
}