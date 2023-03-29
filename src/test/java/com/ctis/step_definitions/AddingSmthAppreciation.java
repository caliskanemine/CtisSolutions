package com.ctis.step_definitions;

import com.ctis.pages.Adding_Appreciation;
import com.ctis.pages.LoginPageElements;
import com.ctis.utilities.BrowserUtils;
import com.ctis.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AddingSmthAppreciation {

    Adding_Appreciation adding_appreciation=new Adding_Appreciation();
    @When("User clicks on More button")
    public void user_clicks_on_more_button() {
    adding_appreciation.moreBtn.click();
    }
    @When("User clicks on Appreciation button")
    public void user_clicks_on_appreciation_button() {
    adding_appreciation.appreciationBtn.click();
    }
    @When("User writes message")
    public void user_writes_message() {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(adding_appreciation.messageArea).sendKeys("thank you hr1 good job").perform();


    }
    @When("User clicks on mention")
    public void user_clicks_on_mention() {

    adding_appreciation.mentionBtn.click();
    }

    String expectedMention="";
    @Then("User chooses hr1@cybertekschool.com from list")
    public void user_chooses_hr1_cybertekschool_com_from_list() {

        BrowserUtils.sleep(1);
    expectedMention=adding_appreciation.mentionSelect.getText();
    adding_appreciation.mentionSelect.click();
    }


    @And("User can see who are mentioned in the TO field")
    public void userCanSeeWhoAreMentionedInTheTOField() {
        String actualMention =adding_appreciation.mentionText.getText();
        Assert.assertEquals(expectedMention,actualMention);
    }

    @And("User clicks link button")
    public void userClicksLinkButton() {
    adding_appreciation.linkButton.click();
    }

    @And("User writes a text into the text box")
    public void userWritesATextIntoTheTextBox() {
        adding_appreciation.textBox.sendKeys("thanks hr1 good job");
    }

    @And("User adds an url into the link box")
    public void userAddsAnUrlIntoTheLinkBox() {
        adding_appreciation.linkBox.sendKeys("https://www.bestholiday.com/");
    }

    @And("User clicks the save button")
    public void userClicksTheSaveButton() {
        adding_appreciation.saveButton.click();
    }

    @And("User clicks send button")
    public void userClicksSendButton() {

    adding_appreciation.sendButton.click();
    }

    @Then("User can see the message as url under the activity stream")
    public void userCanSeeTheMessageAsUrlUnderTheActivityStream() {
        String actual = adding_appreciation.linkedUrlMessage.getAttribute("href");
        String expected="https://www.bestholiday.com/";
        Assert.assertEquals(expected,actual);
    }

    @And("User clicks insert video button")
    public void userClicksInsertVideoButton() {
        BrowserUtils.sleep(1);
        adding_appreciation.insertVideoButton.click();
    }


    @And("User enters url vimeo link into the video source box")
    public void userEntersUrlVimeoLinkIntoTheVideoSourceBox() {
        adding_appreciation.videoSourceBox.click();
        BrowserUtils.sleep(1);
        adding_appreciation.videoSourceBox.sendKeys("https://vimeo.com/741292588");
        BrowserUtils.sleep(15);
    }

    @And("User clicks save button")
    public void userClicksSaveButton() {
        BrowserUtils.sleep(2);
      adding_appreciation.videoSaveButton.click();
      BrowserUtils.sleep(2);

    }

    @And("User clicks to send button")
    public void userClicksToSendButton() {
        BrowserUtils.sleep(10);
        adding_appreciation.sendButton.click();
        BrowserUtils.sleep(10);
    }

    @Then("User can see the usertype on the video")
    public void userCanSeeTheUsertypeOnTheVideo() {

        Assert.assertTrue(adding_appreciation.userTypeName.isDisplayed());

    }


    @And("User enters url youtube link into the video source box")
    public void userEntersUrlYoutubeLinkIntoTheVideoSourceBox() {
        adding_appreciation.videoSourceBox.click();
        BrowserUtils.sleep(1);
        adding_appreciation.videoSourceBox.sendKeys("https://www.youtube.com/watch?v=5c5dXSbEjNM");
        BrowserUtils.sleep(10);

    }

    @Then("User see the error message")
    public void userSeeTheErrorMessage() {
        Assert.assertTrue(adding_appreciation.videoErrorMessage.isDisplayed());
    }
}

