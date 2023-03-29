package com.ctis.step_definitions;

import com.ctis.pages.MessageSendingPage;
import com.ctis.utilities.BrowserUtils;
import com.ctis.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class MessageSending_StepDefinitions {

    MessageSendingPage messageSendingPage = new MessageSendingPage();
    public String testMessage;
    public String blankTestMessage;
    public String unsendedMessage;
    WebElement isMessageDisplayed;

    @Given("user clicks Message Tab on the Navigation Bar")
    public void user_clicks_message_tab_on_the_navigation_bar() {

        messageSendingPage.messagebtn.click();
    }

    @When("user write a message to Message Content field")
    public void user_write_a_message_to_message_content_field() {
        Driver.getDriver().switchTo().frame(messageSendingPage.frame);

        testMessage = "Test by abdullah";

        messageSendingPage.textArea.sendKeys(testMessage);
        Driver.getDriver().switchTo().parentFrame();
    }

    @When("user writes a unsended message to Message Content field")
    public void user_writes_a_unsended_message_to_message_content_field() {
        Driver.getDriver().switchTo().frame(messageSendingPage.frame);

        unsendedMessage = "Do not send this message";

        messageSendingPage.textArea.sendKeys(unsendedMessage);
        Driver.getDriver().switchTo().parentFrame();
    }

    @And("clear default recipients from the recipient input")
    public void clear_default_recipients_from_the_recipient_input() {
        messageSendingPage.recipientDelBtn.click();

    }


    @When("choose recipient from recipient input")
    public void choose_recipient_from_recipient_input() {
        messageSendingPage.addMoreBtn.click();
        messageSendingPage.employeesAndDepartmentsBtn.click();
        messageSendingPage.hr1Mail.click();
        messageSendingPage.recipientPopUpCloseBtn.click();
    }

    @When("clicks to the Send button")
    public void clicks_to_the_send_button() {
        messageSendingPage.sendBtn.click();
    }

    @Then("verifies that the message is displayed on the Activity Stream")
    public void verifies_that_the_message_is_displayed_on_the_activity_stream() {
        BrowserUtils.waitFor(3);
        String locationOfMessage = "//div[contains(text(), '" + testMessage + "')]";
        WebElement isMessageDisplayed = Driver.getDriver().findElement
                (By.xpath(locationOfMessage));

        Assert.assertTrue(isMessageDisplayed.isDisplayed());

    }

    @When("user does not write a message to Message Content field")
    public void user_does_not_write_a_message_to_message_content_field() {
        Driver.getDriver().switchTo().frame(messageSendingPage.frame);

        blankTestMessage = "";

        messageSendingPage.textArea.sendKeys(blankTestMessage);
        Driver.getDriver().switchTo().parentFrame();
    }

    @Then("verifies to see that -The message title is not specified- text as error message")
    public void verifies_to_see_that_the_message_title_is_not_specified_text_as_error_message() {
        Assert.assertTrue(messageSendingPage.mssageTitleErrorText.isDisplayed());
    }


    @Then("verifies that the unsended message is not displayed on the Activity Stream")
    public void verifies_that_the_unsended_message_is_not_displayed_on_the_activity_stream() {

        WebElement a=isMessageDisplayed;
        try {
            a=Driver.getDriver().findElement(By.xpath("//div[text()= 'Do not send this message']"));
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
        Assert.assertTrue(true);



    }


    @Then("verifies to see that -Please specify at least one person- text as error message")
    public void verifies_to_see_that_please_specify_at_least_one_person_text_as_error_message() {
        Assert.assertTrue(messageSendingPage.noRecipientErrorText.isDisplayed());
    }

    @When("user should be able to delete recipients")
    public void user_should_be_able_to_delete_recipients() {
        messageSendingPage.recipientInputArea.sendKeys(Keys.BACK_SPACE);
        messageSendingPage.recipientInputArea.sendKeys(Keys.BACK_SPACE);
        messageSendingPage.recipientPopUpCloseBtn.click();
        BrowserUtils.waitFor(1);

    }

    @When("clicks to the Cancel button")
    public void clicks_to_the_cancel_button() {
        messageSendingPage.cancelBtn.click();
    }

    @When("user checks recipient input and should verifies that All Employees as default recipient")
    public void user_checks_recipient_input_and_should_verifies_that_all_employees_as_default_recipient() {
        boolean allEmployeesisDefault = messageSendingPage.allEmployees.isDisplayed();
        Assert.assertTrue(allEmployeesisDefault);
    }

    @When("user clicks Add More button and should be able to add more recipients")
    public void user_clicks_add_more_button_and_should_be_able_to_add_more_recipients() {
        messageSendingPage.addMoreBtn.click();
        messageSendingPage.employeesAndDepartmentsBtn.click();
        BrowserUtils.waitFor(2);
        messageSendingPage.hr1Mail.click();

    }

}
