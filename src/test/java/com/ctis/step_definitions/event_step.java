package com.ctis.step_definitions;

import com.ctis.pages.EventPageElements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class event_step {

    EventPageElements eventPageElements = new EventPageElements();

    @When("user click to event button")
    public void user_click_to_event_button() {
       eventPageElements.eventButton.click();
    }

    @When("user add event start date")
    public void user_add_event_start_date() {
   eventPageElements.startDate.sendKeys(Keys.CLEAR+"23/04/2023");
    }

    @When("user add event start time")
    public void user_add_event_start_time() {
       eventPageElements.startTime.click();
       eventPageElements.clockHour.sendKeys("08");
       eventPageElements.clockMinutes.sendKeys("30");
       eventPageElements.setTime.click();
    }
    @Then("user add event end date")
    public void user_add_event_end_date() {
        eventPageElements.endDate.sendKeys(Keys.CLEAR+"24/04/2023");
    }
    @Then("user add event end time")
    public void user_add_event_end_time() {
        eventPageElements.startTime.click();
        eventPageElements.clockHour.sendKeys("17");
        eventPageElements.clockMinutes.sendKeys("30");
        eventPageElements.setTime.click();
    }






    @Then("user specify the time zone")
    public void user_specify_the_time_zone() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user click all day radiobutton")
    public void user_click_all_day_radiobutton() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("user click set reminder button")
    public void user_click_set_reminder_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user set remind count")
    public void user_set_remind_count() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user set remind type")
    public void user_set_remind_type() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user set event location")
    public void user_set_event_location() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("user click members bar")
    public void user_click_members_bar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user add {string}")
    public void user_add(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user click Employees and department button")
    public void user_click_employees_and_department_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user click {string} radiobutton")
    public void user_click_radiobutton(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("click send button")
    public void click_send_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user click event name bar")
    public void user_click_event_name_bar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user write event name")
    public void user_write_event_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user cancel event")
    public void user_cancel_event() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
