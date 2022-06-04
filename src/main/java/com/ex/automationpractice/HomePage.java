package com.ex.automationpractice;

import org.openqa.selenium.WebDriver;

public class HomePage extends  BasePage{

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
