package com.ctis.step_definitions;

import com.ctis.pages.LoginPageElements;
import com.ctis.pages.PollPage;
import com.ctis.utilities.BrowserUtils;
import com.ctis.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PollStepDefinition {

    PollPage pollPage = new PollPage();

    @Given("User clicks POLL tab")
    public void user_clicks_poll_tab() {

        pollPage.PollButton.click();

    }
    @When("User clicks Add more")
    public void user_clicks_add_more() {
        pollPage.AddmoreButton.click();

    }
    @When("User clicks Employees and departments")
    public void user_clicks_employees_and_departments() {

        pollPage.EmployeesAndDepartmentsButton.click();
    }
    @When("User select multiple contacts")
    public void user_select_multiple_contacts() {

        pollPage.marketingEmail.click();
        pollPage.hrEmail.click();
        pollPage.helpdeskEmail.click();

    }
    @When("User click x for closing")
    public void user_click_x_for_closing() {

        pollPage.closeXbutton.click();
    }
    @When("User writes a title in message box")
    public void user_writes_a_title_in_message_box() {

         Actions actions = new Actions(Driver.getDriver());

        BrowserUtils.sleep(2);

        actions.click(pollPage.titleMessageBox).perform();
        actions.sendKeys("Sample Title").perform();
    }
    @When("User clicks Question and write a question")
    public void user_clicks_question_and_write_a_question() {

        pollPage.questionInput.sendKeys("Question Sample");
    }
    @When("User clicks AnswerFirst and write an answer")
    public void user_clicks_answer_first_and_write_an_answer() {

        pollPage.answer1input.sendKeys("Answer1");
    }
    @When("User clicks AnswerSecond and write an answer")
    public void user_clicks_answer_second_and_write_an_answer() {

        pollPage.answer2input.sendKeys("Answer2");
    }
    @When("User clicks AnswerThird and write an answer")
    public void user_clicks_answer_third_and_write_an_answer() {

        pollPage.answer3input.sendKeys("Answer3");
    }
    @When("User clicks Allow multiple choise  checkbox")
    public void user_clicks_allow_multiple_choise_checkbox() {

        pollPage.allowMultipleChoiceCheckbox.click();
    }
    @When("User clicks SEND button")
    public void user_clicks_send_button() {

        pollPage.SaveButton.click();
    }
    @When("User clicks More button")
    public void user_clicks_more_button() {

        pollPage.moreButton.click();
    }
    @When("User clicks Delete  button")
    public void user_clicks_delete_button() {

        pollPage.deleteButton.click();
    }
    @When("User clicks OK  button")
    public void user_clicks_ok_button() {

        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();


    }
    @Then("Verify {string} message is displayed")
    public void verify_message_is_displayed(String string) {

        Assert.assertTrue(pollPage.deletingMessage.isDisplayed());
        BrowserUtils.waitFor(1);
    }

    @And("User leaves blank in title message box, with default recipient")
    public void userLeavesBlankInTitleMessageBoxWithDefaultRecipient() {
        BrowserUtils.waitFor(1);

    }

    @Then("Verify {string} message is displayed.")
    public void verifyMessageIsDisplayed(String arg0) {
        Assert.assertTrue(pollPage.messageTitleIsNeededMessage.isDisplayed());
    }

    @And("User remove all recipients by clicking x")
    public void userRemoveAllRecipientsByClickingX() {
        pollPage.removingRecipients.click();
    }

    @Then("Verify the message {string} is displayed")
    public void verifyTheMessageIsDisplayed(String arg0) {
        Assert.assertTrue(pollPage.atLeastOnePersonMessage.isDisplayed());
    }
}
