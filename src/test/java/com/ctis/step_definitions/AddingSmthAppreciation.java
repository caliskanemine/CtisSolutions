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
import org.openqa.selenium.Keys;
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
        adding_appreciation.textBox.click();
        BrowserUtils.sleep(1);
        adding_appreciation.textBox.sendKeys("thanks hr1 good job");
        BrowserUtils.sleep(2);
    }

    String linkUrl="https://www.bestholiday.com/";
    @And("User adds an url into the link box")
    public void userAddsAnUrlIntoTheLinkBox() {

        adding_appreciation.linkBox.click();
        BrowserUtils.sleep(1);
        adding_appreciation.linkBox.sendKeys(linkUrl);
        BrowserUtils.sleep(2);
    }

    @And("User clicks the save button")
    public void userClicksTheSaveButton() {
        adding_appreciation.saveButton.click();
        BrowserUtils.sleep(5);

    }

    @And("User clicks send button")
    public void userClicksSendButton() {

    adding_appreciation.sendButton.click();
    }
/*
    @Then("User can see the message as url into the text")
    public void userCanSeeTheMessageAsUrlIntoTheText() {
       Actions actions=new Actions(Driver.getDriver());
       actions.moveToElement(adding_appreciation.messageArea);
        String actual = adding_appreciation.linkedUrlMessage.getAttribute("href");
        String expected="https://www.bestholiday.com/";
        Assert.assertEquals(expected,actual);
    }

 */

    @Then("User sees the message or go to page that url added in to the message")
    public void userSeesTheMessageOrGoToPageThatUrlAddedInToTheMessage() {
        if(linkUrl.equals("https://www.bestholiday.com/"))
        {
        Assert.assertTrue(adding_appreciation.beforeLinkMessage.isDisplayed());
        }

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
        BrowserUtils.sleep(5);
    }


    @And("User clicks save button")
    public void userClicksSaveButton() {
        BrowserUtils.sleep(2);
      adding_appreciation.videoSaveButton.click();
      BrowserUtils.sleep(5);


    }

    @And("User clicks to send button")
    public void userClicksToSendButton() {
        BrowserUtils.sleep(10);
        adding_appreciation.sendButton.click();
        BrowserUtils.sleep(10);
    }




    @And("User enters url youtube link into the video source box")
    public void userEntersUrlYoutubeLinkIntoTheVideoSourceBox() {
        adding_appreciation.videoSourceBox.click();
        BrowserUtils.sleep(1);
        adding_appreciation.videoSourceBox.sendKeys("https://www.youtube.com/watch?v=5c5dXSbEjNM");
        BrowserUtils.sleep(10);

    }

    @And("User clicks and clears the message area")
    public void userClicksAndClearsTheMessageArea() {

        adding_appreciation.messageArea.click();
        adding_appreciation.messageArea.sendKeys(Keys.CONTROL + "a",Keys.DELETE);
       BrowserUtils.sleep(5);

    }
    @Then("User sees the thanks hr good job message area is empty")
    public void userSeesTheThanksHrGoodJobMessageAreaIsEmpty() {

        String message=adding_appreciation.messageArea.getText();
        Assert.assertTrue(message.isEmpty());
    }

    @Then("User sees the message area is empty")
    public void userSeesTheMessageAreaIsEmpty() {
        String message=adding_appreciation.messageArea.getText();
        Assert.assertTrue(message.isEmpty());
    }

    @Then("User does not see the error message")
    public void userDoesNotSeeTheErrorMessage() {
        Assert.assertFalse(adding_appreciation.videoErrorMessage.isDisplayed());
    }

    @And("User writes the message in to the message area")
    public void userWritesTheMessageInToTheMessageArea() {

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(adding_appreciation.messageArea).sendKeys("hello mate have a nice day").perform();


    }

    @And("User click tags button")
    public void userClickTagsButton() {
        adding_appreciation.tagsButton.click();
        BrowserUtils.sleep(2);
    }

    @And("Types who one wants to add")
    public void typesWhoOneWantsToAdd() {
        adding_appreciation.tagsField.sendKeys("hr2",Keys.ENTER);
        BrowserUtils.sleep(2);

    }

    @Then("User can see the person who added into the TAGS: field")
    public void userCanSeeThePersonWhoAddedIntoTheTAGSField() {
        String expected="hr2";
        String actual = adding_appreciation.addedPartTag.getText();
        Assert.assertEquals(expected,actual);

    }



    @And("User clicks x to remove the person from tag field")
    public void userClicksXToRemoveThePersonFromTagField() {
        adding_appreciation.cancelTag.click();
    }

    @Then("User sees only +add more into the tags field")
    public void userSeesOnlyAddMoreIntoTheTagsField() {
        String tagsField2Text = adding_appreciation.tagsField2.getText();
        Assert.assertEquals("Add more",tagsField2Text);
    }



}

