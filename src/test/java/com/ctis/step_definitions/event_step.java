package com.ctis.step_definitions;

import com.ctis.pages.EventPageElements;
import com.ctis.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class event_step {

    EventPageElements eventPageElements = new EventPageElements();

    @When("user click to event button")
    public void user_click_to_event_button() {
        eventPageElements.eventButton.click();
    }

    @And("user add new event start date as {string}")
    public void userAddNewEvent(String date) {
        eventPageElements.startDate.sendKeys(Keys.chord(Keys.CONTROL + "a") + Keys.BACK_SPACE + date);
    }

    @And("user add new event start time {int} and {int}")
    public void userAddNewEventStartTimeAnd(int hour, int minute) {
        eventPageElements.startTime.click();
        eventPageElements.clockHour.sendKeys(Keys.chord(Keys.CONTROL + "a") + Keys.BACK_SPACE + hour);
        eventPageElements.clockMinutes.sendKeys(Keys.chord(Keys.CONTROL + "a") + Keys.BACK_SPACE + minute);
        eventPageElements.setTime.click();
    }

    @Then("user add new event end date {string}")
    public void userAddNewEventEndDate(String date) {
        eventPageElements.endDate.sendKeys(Keys.chord(Keys.CONTROL + "a") + Keys.BACK_SPACE + date);
    }

    @Then("user add new event end time {int} and {int}")
    public void userAddNewEventEndTimeAnd(int hour, int minute) {
        eventPageElements.startTime.click();
        eventPageElements.clockHour.sendKeys(Keys.chord(Keys.CONTROL + "a") + Keys.BACK_SPACE + hour);
        eventPageElements.clockMinutes.sendKeys(Keys.chord(Keys.CONTROL + "a") + Keys.BACK_SPACE + minute);
        eventPageElements.setTime.click();
    }

    @Then("user specify the time zone as {string}")
    public void user_specify_the_time_zone_as(String zone) {
        eventPageElements.specifytimezone.click();
        Select simpleDropdown = new Select(eventPageElements.timeZone);
        simpleDropdown.selectByVisibleText(zone);
    }

    @Then("user click all day radiobutton")
    public void user_click_all_day_radiobutton() {
        eventPageElements.allDayButton.click();
    }




    @When("user click set reminder button")
    public void user_click_set_reminder_button() {
   Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        eventPageElements.setReminderButton.click();
    }

    @Then("user set remind count as {int}")
    public void user_set_remind_count_as(int count) {
        eventPageElements.setReminderButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        eventPageElements.remindercountButton.sendKeys(Keys.chord(Keys.CONTROL + "a") + Keys.BACK_SPACE + count);
    }

    @Then("user set remind type")
    public void user_set_remind_type() {

        Select simpleDropdown = new Select(eventPageElements.remindertypeButton);
        simpleDropdown.selectByVisibleText("days");
    }



    @Then("user set event location as {string}")
    public void user_set_event_location(String location) {
        eventPageElements.eventlocationButton.sendKeys(location);
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

    @Then("user write {string}")
    public void userWrite(String name) {
    }

    @Then("user cancel event")
    public void user_cancel_event() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
