package com.ex.automationpractice;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

abstract class BasePage {

    protected SelenideElement contactUs = $(Selectors.byId("contact-link"));
    protected SelenideElement singIn = $(Selectors.byClassName("login"));
    protected SelenideElement myAccount = $(Selectors.byCssSelector("a[title='View my customer account'] span"));
    protected SelenideElement searchQuery = $(Selectors.byId("search_query_top"));
    protected SelenideElement submitSearch = $(Selectors.byName("submit_search"));
    protected SelenideElement cart = $(Selectors.byClassName("shopping_cart"));
    protected SelenideElement cartSum = $(Selectors.byClassName("cart_block_total"));
    protected SelenideElement womenTab = $(Selectors.byCssSelector("a[title='Women']"));
    protected SelenideElement dressesTab = $(Selectors.byCssSelector("ul.sf-js-enabled>li>a[title='Dresses']"));
    protected SelenideElement tshirtsTab = $(Selectors.byCssSelector("a[title='T-shirts']"));

}
