package com.ex.automationpractice;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.assertj.core.api.Assertions;

import static com.codeborne.selenide.Selenide.$;

public class SummerDresses extends BasePage {

    private SelenideElement firstSummerDresses = $(Selectors.byXpath("//div[@class='product-container'][1]"));
    private SelenideElement addToWishList = $(Selectors.byClassName("addToWishlist"));
    private SelenideElement addPopup = $(Selectors.byText("Added to your wishlist."));


    public SummerDresses hoverFirstDress(){
        firstSummerDresses.hover();
        return this;
    }

    public SummerDresses addToWishList(){
        addToWishList.click();
        return this;
    }

    public SummerDresses checkIsAdded(){
        addPopup.shouldBe(Condition.visible);
        return this;
    }



}
