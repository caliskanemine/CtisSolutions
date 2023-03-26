package com.ctis.step_definitions;

import com.ctis.pages.FilterAndSearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FilterAndSearchStepDefinitions {

    FilterAndSearchPage filterAndSearchPage = new FilterAndSearchPage();

    @When("user hover over and clicks the filter and search box")
    public void userHoverOverAndClicksTheFilterAndSearchBox() {
        filterAndSearchPage.filterAndSearchBox.click();
        System.out.println(filterAndSearchPage.workFilter.isEnabled());

    }

    @Then("user should be able to see default filters as my activity, work, favorite, announcements and workflows")
    public void user_should_be_able_to_see_default_filters_as_my_activity_work_favorite_announcements_and_workflows() {
        // filterAndSearchPage.dateInputBox.click();
       // filterAndSearchPage.days60.click();
        //filterAndSearchPage.workFilter.isEnabled();


    }


    @When("user clicks the add field button")
    public void userClicksTheAddFieldButton() {
    }
}
