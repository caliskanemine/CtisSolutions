package com.ctis.step_definitions;

import com.ctis.pages.Adding_Appreciation;
import com.ctis.pages.LoginPageElements;
import com.ctis.utilities.BrowserUtils;
import com.ctis.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

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
        actions.moveToElement(adding_appreciation.messageArea).sendKeys("hello hr1").perform();


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
    @Then("User can see the hr1@cybertekschool.com as mention beside message")
    public void user_can_see_the_hr1_cybertekschool_com_as_mention_beside_message() {
        String actualMention =adding_appreciation.mentionText.getText();
        Assert.assertEquals(expectedMention,actualMention);

    }






}
