package com.ex.automationpractice;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    private SelenideElement contactUs = $(Selectors.byId("contact-link"));
    private SelenideElement singIn = $(Selectors.byClassName("login"));
    private SelenideElement myAccount = $(Selectors.byCssSelector("a[title='View my customer account'] span"));
    private SelenideElement searchQuery = $(Selectors.byId("search_query_top"));
    private SelenideElement submitSearch = $(Selectors.byName("submit_search"));
    private SelenideElement cart = $(Selectors.byClassName("shopping_cart"));
    private SelenideElement cartSum = $(Selectors.byClassName("cart_block_total"));
    private SelenideElement womenTab = $(Selectors.byCssSelector("a[title='Women']"));
    private SelenideElement dressesTab = $(Selectors.byCssSelector("ul.sf-js-enabled>li>a[title='Dresses']"));
    private SelenideElement tshirtsTab = $(Selectors.byCssSelector("a[title='T-shirts']"));


    public String getCartPriceTotal() {
        return cartSum.getText();
    }

    public String getUser() {
        return myAccount.getText();
    }

    public WomenTab openWomenTab() {
        womenTab.click();
        return new WomenTab();
    }

    public DressesTab openDressesTab() {
        dressesTab.click();
        return new DressesTab();
    }

    public TshirtsTab openTshirtsTab() {
        tshirtsTab.click();
        return new TshirtsTab();
    }



}
