package com.ex.automationpractice;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Alert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class MyWishList extends BasePage {

    SelenideElement wishListElement = $(Selectors.byCssSelector("tbody>tr"));
    SelenideElement wishListElementDelete = $(Selectors.byClassName("icon-remove"));
    SelenideElement wishListTable = $(Selectors.byId("block-history"));

    public MyWishList wishElementIsPresent(){
        wishListElement.shouldBe(Condition.visible);
        return this;
    }

    public MyWishList removeWishList() {
        wishListElementDelete.click();

        Alert alert = switchTo().alert();
        alert.accept();

        wishListTable.shouldNotBe(Condition.visible);
        return this;
    }
}
