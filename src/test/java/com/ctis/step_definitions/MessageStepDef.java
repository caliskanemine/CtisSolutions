package com.ctis.step_definitions;

import com.ctis.pages.MessagePage;
import com.ctis.utilities.BrowserUtils;
import com.ctis.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;

public class MessageStepDef {
    MessagePage messagePage=new MessagePage();



    @When("User should click Message button")
    public void user_should_click_message_button() {
        messagePage.messageButton.click();
    }
    @When("User should see Upload Files button and click it")
    public void user_should_see_upload_files_button_and_click_it() {
        BrowserUtils.sleep(2);
        messagePage.uploadFileButton.click();
        BrowserUtils.sleep(2);
    }
    @When("User should Upload {string}")
    public void user_should_upload(String string) {
        BrowserUtils.sleep(2);

       messagePage.uploadFileAndImagesButton.sendKeys("C:\\Users\\Rose\\Desktop\\abc1.png");
       BrowserUtils.sleep(2);
       messagePage.uploadFileAndImagesButton.sendKeys("C:\\Users\\Rose\\Desktop\\abc2.xlsx");
       BrowserUtils.sleep(2);
       messagePage.uploadFileAndImagesButton.sendKeys("C:\\Users\\Rose\\Desktop\\abc3.docx");
       BrowserUtils.sleep(2);
        messagePage.uploadFileAndImagesButton.sendKeys("C:\\Users\\Rose\\Desktop\\abc5.png");
        BrowserUtils.sleep(2);


    }



    @Then("User should remove files and images")
    public void userShouldRemoveFilesAndImages() {
messagePage.removeButton.click();
        messagePage.removeButton.click();
    }

    @Then("User should change file's name")
    public void userShouldChangeFileSName() {
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(messagePage.image).perform();
        BrowserUtils.sleep(2);
        messagePage.renameButton.click();
        BrowserUtils.sleep(2);
        messagePage.renameInput.sendKeys(Keys.chord(Keys.CONTROL, "a")+Keys.CLEAR);
        BrowserUtils.sleep(2);
        messagePage.renameInput.sendKeys("abcd");
        BrowserUtils.sleep(2);
    }

    @Then("User should click insert in text button")
    public void userShouldClickInsertInTextButton() {
        messagePage.insertInTextButton.click();
    }
}
