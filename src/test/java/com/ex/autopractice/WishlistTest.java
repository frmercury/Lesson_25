package com.ex.autopractice;

import com.ex.automationpractice.BasePage;
import com.ex.automationpractice.MyWishList;
import org.testng.annotations.Test;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.open;

public class WishlistTest extends BaseTest {

    @Test(testName = "Add first summer dress to wish list")
    public void addSummerDress() {
        new BasePage()
                .openDressesTab()
                .getSummerDresses()
                .hoverFirstDress()
                .addToWishList()
                .checkIsAdded();
        open("http://automationpractice.com/index.php?fc=module&module=blockwishlist&controller=mywishlist");
        new MyWishList()
                .wishElementIsPresent()
                .wishElementIsDeleted();
    }
}