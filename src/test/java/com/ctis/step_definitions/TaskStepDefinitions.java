package com.ctis.step_definitions;

import com.ctis.pages.PollPage;
import com.ctis.pages.TaskPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class TaskStepDefinitions {

    TaskPage taskPage = new TaskPage();


    @Given("User clicks Task tab")
    public void user_clicks_task_tab() {
        taskPage.taskbutton.click();
    }
    @Given("User writes into things to do title")
    public void user_writes_into_things_to_do_title() {
        taskPage.thingsToDo.sendKeys("important task");
    }
    @Given("User clicks high priority ckeckbox")
    public void user_clicks_high_priority_ckeckbox() {
        taskPage.highPriorityCheckbox.click();
    }
    @When("User clicks Add more button")
    public void user_clicks_add_more_button() {
        taskPage.addMore.click();
    }
    @When("User selects one responsible person")
    public void user_selects_one_responsible_person() {
        taskPage.hrmail.click();
    }
    @When("User clicks closing x btn")
    public void user_clicks_closing_x_btn() {
        taskPage.closingX.click();
    }
    @When("User clicks send button")
    public void user_clicks_send_button() {
        taskPage.saveButton.click();
    }
    @Then("Verify hr user creates high priority task with mandatory fields")
    public void verify_hr_user_creates_high_priority_task_with_mandatory_fields() {
        Assert.assertTrue(taskPage.popupView.isDisplayed());
    }


    @And("User clicks add more button, and select three users")
    public void userClicksAddMoreButtonAndSelectThreeUsers() {

        taskPage.addMore.click();
        taskPage.hrmail.click();
        taskPage.helpdeskmail.click();
        taskPage.closingX.click();

    }

    @Then("Verify hr user creates task to more three users")
    public void verifyHrUserCreatesTaskToMoreThreeUsers() {

        Assert.assertTrue(taskPage.popupView.isDisplayed());

    }

    @And("User clicks Checklist and add two things")
    public void userClicksChecklistAndAddTwoThings() {

        taskPage.checklist();

    }

    @Then("Verify hr user can add checklist while creating task")
    public void verifyHrUserCanAddChecklistWhileCreatingTask() {
        Assert.assertTrue(taskPage.popupView.isDisplayed());
    }

    @And("User clicks deadline and select the default deadline")
    public void userClicksDeadlineAndSelectTheDefaultDeadline() {

        taskPage.deadline();
    }

    @Then("Verify hr user can add deadline while creating task")
    public void verifyHrUserCanAddDeadlineWhileCreatingTask() {
        Assert.assertTrue(taskPage.popupView.isDisplayed());
    }
}
