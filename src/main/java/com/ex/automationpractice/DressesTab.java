package com.ex.automationpractice;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class DressesTab extends BasePage {

    private SelenideElement casualDresses = $(Selectors.byCssSelector("a[title='Casual Dresses']"));
    private SelenideElement eveningDresses = $(Selectors.byCssSelector("a[title='Evening Dresses']"));
    private SelenideElement summerDresses = $(Selectors.byCssSelector("div>a[title='Summer Dresses']"));


    public SummerDresses getSummerDresses() {
        summerDresses.click();
        return new SummerDresses();
    }

}
