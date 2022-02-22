package com.ex.ui.TestRailQA;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static io.qameta.allure.Allure.step;

public class DashboardPage extends BasePage{
    public DashboardPage(WebDriver webDriver) {
        super(webDriver);
    }

    private By testCaseLink = By.xpath("//a[contains(@href, 'suites')]");
    private By testRunsLink = By.xpath("//a[contains(@href, 'runs')]");


    public DashboardPage clickOnTestCasesLink(){
        step("Verify click on TestCase Link is able", () -> {
            step("Check");
        });
        findElement(webDriver, testCaseLink).click();
        return this;
    }
    @Step("Check redirection to TestRuns page")
        public DashboardPage clickOnTestRunsLink (){
        findElement(webDriver, testRunsLink).click();
        return this;
    }

}
