package com.ex.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    By contactUs = By.id("contact-link");
    By singIn = By.className("login");
    By searchQuery = By.id("search_query_top");
    By submitSearch = By.name("submit_search");
    By cart = By.className("shopping_cart");
    By cartSum = By.className("cart_block_total");
    By womenTab = By.cssSelector("a[title='Women']");
    By dressesTab = By.cssSelector("a[title='Dresses']");
    By tshirtsTab = By.cssSelector("a[title='T-shirts']");

    public void hoverCartShouldBeEqual(double cartAmount){
        $(cart).hover();
        $(cartSum).getText().equals(cartAmount);
    }

}
