package com.ex.ui.TestRailQA;

import com.ex.ui.BaseTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class TestRailQASuite extends BaseTest {
    @Severity(SeverityLevel.NORMAL)
        @Test(testName = "New Test Case Creation")
        public void newTestCaseCreationTest() {
            new DashboardPage(webDriver)
                    .clickOnTestCasesLink();
            new TestCasesPage(webDriver)
                    .addNewTestCase();
            new NewTestCaseCreationPage(webDriver)
                    .fillCaseTitleInput()
                    .chooseCaseTemplateSteps()
                    .chooseCaseTypeAutomated()
                    .fillPreconditionField()
                    .clickAddTestCaseButton();
            new TestCasesPage(webDriver)
                    .checkSuccessMessageIsDisplayed();
        }
    @Severity(SeverityLevel.CRITICAL)
        @Test(description = " New Test Run Creation")
        public void newTestRunCreationTest(){
            new DashboardPage(webDriver)
                    .clickOnTestRunsLink();
            new TestRunsResultsPage(webDriver)
                    .addNewTestRun();
            new NewTestRunCreationPage(webDriver)
                    .fillRunTitleInput()
                    .fillDescriptionField()
                    .clickAddTestCaseButton();
            new TestRunPage(webDriver)
                    .clickRandomTestCase();
            new TestCasePage(webDriver)
                    .clickAddTestCaseButton()
                    .addRandomResultStatus()
                    .checkStatusModification();
        }


//    @Test
//    public void newTestCaseStatusModificationTest(){
//        new DashboardPage(webDriver)
//                .clickOnTestRunsLink();
//        new TestRunsResultsPage(webDriver)
//                .addNewTestRun();
//        new NewTestRunCreationPage(webDriver)
//                .fillRunTitleInput()
//                .fillDescriptionField()
//                .clickAddTestCaseButton();
//        new TestRunPage(webDriver)
//                .randomCaseSelection();
//    }
}