package com.ctis.step_definitions;

import com.ctis.pages.InteractPage;
import com.ctis.utilities.BrowserUtils;
import com.ctis.utilities.ConfigurationReader;
import com.ctis.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;
import java.util.Set;


public class InteractStepDefinitions {

    InteractPage interactPage = new InteractPage();
    Actions actions = new Actions(Driver.getDriver());

    String clickName="";

    @When("User makes a {string} on other employees' posts")
    public void userMakesAOnOtherEmployeesPosts(String comment) {


        actions.click(interactPage.addComment).perform();
        actions.sendKeys(comment).perform();

        actions.moveToElement(interactPage.sendButton).perform();
        actions.click(interactPage.sendButton).perform();
        BrowserUtils.sleep(2);
    }
    @When("User likes other employees' posts")
    public void user_likes_other_employees_posts() {
        interactPage.likeButton.click();



    }
    @Then("User unfollows other employees' posts")
    public void user_unfollows_other_employees_posts() {
        interactPage.unfollowButton.click();


    }

    @Then("User sees his post, like and unfollow command")
    public void userSeesHisPostLikeAndUnfollowCommand() {
        Assert.assertEquals(interactPage.userComment.getText(),"Hi Guys");
        Assert.assertTrue(interactPage.likeSign.getText().contains("You"));
        Assert.assertEquals(interactPage.followButton.getText(),"Follow");

    }


    @When("User likes  his\\/her own comment")
    public void user_likes_his_her_own_comment() {

        interactPage.likeCommand(ConfigurationReader.getProperty("userName"));
    }
    @Then("User replays his\\/her own comment")
    public void user_replays_his_her_own_comment() {

      interactPage.replyAndSendTExtToYourMessage(ConfigurationReader.getProperty("userName"),"Hello");

      BrowserUtils.sleep(2);

      interactPage.verifyNewComment("Hello");



    }
    @When("User sees the reviewers' name")
    public void user_sees_the_reviewers_name() {

        actions.moveToElement(interactPage.reviewers).perform();
        BrowserUtils.sleep(1);


    }
    @When("User cliks on reviewers' name")
    public void user_cliks_on_reviewers_name() {
        clickName = interactPage.reviewerName.getText();
    if(interactPage.reviewerName.isDisplayed()){
        interactPage.reviewerName.click();

    }

    }
    @Then("User visits  their profiles")
    public void user_visits_their_profiles() {

        Set<String> windows =  Driver.getDriver().getWindowHandles();

        for (String window : windows) {
            Driver.getDriver().switchTo().window(window);
        }


        Assert.assertTrue(Driver.getDriver().getTitle().contains(clickName));

    }

    @When("User adds others' posts to favorite by clicking on the Star icon.")
    public void user_adds_others_posts_to_favorite_by_clicking_on_the_star_icon() {

        interactPage.starButton.click();

    }
    @Then("User sees their post on favorites")
    public void user_sees_their_post_on_favorites() {

        String expectedText = "Remove from favorites";

        BrowserUtils.sleep(1);

        String actualText= interactPage.removeStarButton.getAttribute("title");

        Assert.assertEquals(actualText,expectedText);

    }

   }
