package com.ex.ui.TestRailQA;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static io.qameta.allure.Allure.step;

public class TestCasesPage extends BasePage{

    TestCasesPage(WebDriver webDriver) {
        super(webDriver);
    }

    By sideAddNewTestCaseButton = By.id("sidebar-cases-add");
    By successMessage  = By.xpath("//div[contains(text(), 'Successfully')]");

    public TestCasesPage addNewTestCase() {
        step("Verify click on AddTestCase button is able");
        findElement(webDriver, sideAddNewTestCaseButton).click();
        return this;
    }
        public TestCasesPage checkSuccessMessageIsDisplayed() {
        Assertions.assertThat(checkIsVisible(webDriver, successMessage));
        return this;
    }
}