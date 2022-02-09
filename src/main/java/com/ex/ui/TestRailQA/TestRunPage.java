package com.ex.ui.TestRailQA;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class TestRunPage extends BasePage {

    public TestRunPage(WebDriver webDriver) {
        super(webDriver);
    }

    private By testCaseCheckBox = By.xpath("//td[@class='checkbox']/input");
    private By addResultLink = By.xpath("//a[@id='massAddResult']");
    private By addResultField = By.xpath("//div[@id='addResultStatus_chzn']/a");
    private By testCaseStatuses = By.xpath("//div[@id='addResultStatus_chzn']//li");
    private By addResultButton = By.xpath("//button[@id='addResultSubmit']");
    private By testCaseStatusDropDown = By.xpath("..//following-sibling::td[@class='js-status']/a");

    private By testCaseId = By.xpath("//td[@class='id']");



    public TestRunPage clickRandomTestCase () {
        List<WebElement> randomCaseId = webDriver.findElements(testCaseId);
        Random random = new Random();
        WebElement randomTestCaseID = randomCaseId.get(random.nextInt(randomCaseId.size()));
        randomTestCaseID.click();
        return this;
    }

    public TestRunPage randomCaseSelection () {
        List<WebElement> randomCaseCheckBoxes = webDriver.findElements(testCaseCheckBox);
        Random random = new Random();
        WebElement randomCheckBox = randomCaseCheckBoxes.get(random.nextInt(randomCaseCheckBoxes.size()));

        List<WebElement> randomTestCaseStatusDropDown = randomCheckBox.findElements(testCaseStatusDropDown);

        randomCheckBox.click();
        clickAddResultLink().addRandomResultStatus();
        waitForAjax(webDriver);

        WebElement statusLink = randomTestCaseStatusDropDown.get(1);
        System.out.println(statusLink.getText());

        Assertions.assertThat(statusLink.getText()).doesNotMatch("Untested");

//        for (int i = 0; i <= 5; i++) {
//
//            randomCheckBox = randomCaseCheckBoxes.get(random.nextInt(randomCaseCheckBoxes.size()));
//            randomTestCaseStatusDropDown = randomCheckBox.findElement(testCaseStatusDropDown);
//
//            if (randomCheckBox.findElement(testCaseCheckBox).isSelected()) {
//                continue;
//            } else {
//                randomCheckBox.click();
//                clickAddResultLink().addRandomResultStatus();
//                waitForAjax(webDriver);
//                Assertions.assertThat(randomTestCaseStatusDropDown.getAttribute("rel")).doesNotMatch("3");
//            }
//        }
        return this;
    }

    public TestRunPage clickAddResultLink () {
        findElement(webDriver, addResultLink).click();
        return this;
    }

    public TestRunPage addRandomResultStatus() {
        findElement(webDriver, addResultField).click();
        chooseRandomCaseStatus();
        clickAddResultButton();
        return this;
    }

    public void chooseRandomCaseStatus () {
        List<WebElement> randomCaseStatusList = webDriver.findElements(testCaseStatuses);
        Random random = new Random();
        WebElement randomStatus = randomCaseStatusList.get(random.nextInt(randomCaseStatusList.size()));
        randomStatus.click();
    }
    public void clickAddResultButton () {
        findElement(webDriver, addResultButton).click();
    }
}