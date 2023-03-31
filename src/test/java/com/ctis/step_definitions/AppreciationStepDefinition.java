package com.ctis.step_definitions;

import com.ctis.pages.AppreciationPageElements;
import com.ctis.utilities.BrowserUtils;
import com.ctis.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class AppreciationStepDefinition {

    AppreciationPageElements appreciationPageElements = new AppreciationPageElements();

    @When("User should click More button")
    public void user_should_click_more_button() {
        appreciationPageElements.moreButton.click();
    }
    @And("User should click Appreciation button")
    public void user_should_click_appreciation_button() {
        appreciationPageElements.appreeciationButton.click();
    }

    @When("User should see Upload Files button and click")
    public void user_should_see_upload_files_button_and_click() {
        BrowserUtils.sleep(2);
        appreciationPageElements.uploadFilesButton.click();
        BrowserUtils.sleep(2);
    }
    @When("User should upload {string}")
    public void user_should_upload(String string) {
        BrowserUtils.sleep(2);

        String filePath1 ="C:\\Users\\sinan\\OneDrive\\Masaüstü\\CtisSolutionsTestDocuments\\PNG1.png";
        String filePath2 ="C:\\Users\\sinan\\OneDrive\\Masaüstü\\CtisSolutionsTestDocuments\\PNG2.png";
        String filePath3 ="C:\\Users\\sinan\\OneDrive\\Masaüstü\\CtisSolutionsTestDocuments\\PNG3.png";
        String filePath4 ="C:\\Users\\sinan\\OneDrive\\Masaüstü\\CtisSolutionsTestDocuments\\ExcelDoc.xlsx";
        String filePath5 ="C:\\Users\\sinan\\OneDrive\\Masaüstü\\CtisSolutionsTestDocuments\\WordDoc.docx";

        appreciationPageElements.uploadFileAndImagesButton.sendKeys(filePath1);
        BrowserUtils.sleep(2);
        appreciationPageElements.uploadFileAndImagesButton.sendKeys(filePath4);
        BrowserUtils.sleep(2);
        appreciationPageElements.uploadFileAndImagesButton.sendKeys(filePath5);
        BrowserUtils.sleep(2);

    }

    @Then("User should upload picture")
    public void userShouldUploadPicture() {
        BrowserUtils.sleep(2);

        String filePath6 ="C:\\Users\\sinan\\OneDrive\\Masaüstü\\CtisSolutionsTestDocuments\\PNG1.png";

        appreciationPageElements.uploadFileAndImagesButton.sendKeys(filePath6);
        BrowserUtils.sleep(2);

    }

    @Then("User should remove attachments")
    public void userShouldRemoveAttachments() {
        appreciationPageElements.removeButton.click();
        BrowserUtils.sleep(2);
    }

    @Then("User should change files name")
    public void userShouldChangeFileSName() {
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(appreciationPageElements.image).perform();
        BrowserUtils.sleep(2);
        appreciationPageElements.renameButton.click();
        BrowserUtils.sleep(2);
        appreciationPageElements.renameInput.sendKeys(Keys.chord(Keys.CONTROL, "a")+Keys.CLEAR);
        BrowserUtils.sleep(2);
        appreciationPageElements.renameInput.sendKeys("CydeoSDET");
        BrowserUtils.sleep(2);
    }

    @Then("User should click insert text button")
    public void userShouldClickInsertTextButton() {
        appreciationPageElements.insertInTextButton.click();
        BrowserUtils.sleep(2);
    }


}
