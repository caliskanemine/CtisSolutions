package com.ctis.step_definitions;

import com.ctis.pages.FilterAndSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FilterAndSearchStepDefinitions {

    FilterAndSearchPage filterAndSearchPage = new FilterAndSearchPage();

    @When("user hover over and clicks the filter and search box")
    public void userHoverOverAndClicksTheFilterAndSearchBox() {
        filterAndSearchPage.filterAndSearchBox.click();
    }

    @Then("user should be able to see default filters as my activity, work, favorite, announcements and workflows")
    public void user_should_be_able_to_see_default_filters_as_my_activity_work_favorite_announcements_and_workflows() {
        Assert.assertTrue(filterAndSearchPage.workFilter.isEnabled());
        Assert.assertTrue(filterAndSearchPage.myActivityFilter.isEnabled());
        Assert.assertTrue(filterAndSearchPage.favoritesFilter.isEnabled());
        Assert.assertTrue(filterAndSearchPage.announcementsFilter.isEnabled());
        Assert.assertTrue(filterAndSearchPage.workFlowsFilter.isEnabled());
    }


    @When("user clicks the Restore default fields button and add field button")
    public void userClicksTheRestoreDefaultFieldsButtonAndAddFieldButton() {
        filterAndSearchPage.restoreDefaultFields.click();
        filterAndSearchPage.addFieldButton.click();
    }

    @And("user sees Date, Type, Author and To fields checked, Favorites, Tag and Extranet fields unchecked as default")
    public void userSeesDateTypeAuthorAndToFieldsCheckedFavoritesTagAndExtranetFieldsUncheckedAsDefault() {

        Assert.assertTrue(filterAndSearchPage.dateInputBox.isDisplayed());
        Assert.assertTrue(filterAndSearchPage.typeInputBox.isDisplayed());
        Assert.assertTrue(filterAndSearchPage.authorInputBox.isDisplayed());
        Assert.assertTrue(filterAndSearchPage.toInputBox.isDisplayed());
        Assert.assertFalse(filterAndSearchPage.favoritesInputBox.isDisplayed());
        System.out.println(filterAndSearchPage.favoritesInputBox.isDisplayed());
        Assert.assertFalse(filterAndSearchPage.tagInputBox.isDisplayed());
        Assert.assertFalse(filterAndSearchPage.extranetInputBox.isDisplayed());
    }

    @And("user clicks to the Favorites, Tag and Extranet field checkboxes")
    public void userClicksToTheFavoritesTagAndExtranetFieldCheckboxes() {
        filterAndSearchPage.favoritesFieldCheckBox.click();
        filterAndSearchPage.extranetFieldCheckBox.click();
        filterAndSearchPage.tagFieldCheckBox.click();
    }

    @And("user sees all choosen fields' input boxes is displayed on the screen")
    public void userSeesAllChoosenFieldsInputBoxesIsDisplayedOnTheScreen() {
        Assert.assertTrue(filterAndSearchPage.favoritesInputBox.isDisplayed());
        Assert.assertTrue(filterAndSearchPage.extranetInputBox.isDisplayed());
        Assert.assertTrue(filterAndSearchPage.tagInputBox.isDisplayed());
    }

    @Then("user unclicks all field checkboxes and user sees all input boxes disappeared")
    public void userUnclicksAllFieldCheckboxesAndUserSeesAllInputBoxesDisappeared() {
        filterAndSearchPage.dateFieldCheckBox.click();
        filterAndSearchPage.toFieldCheckBox.click();
        filterAndSearchPage.authorFieldCheckBox.click();
        filterAndSearchPage.typeFieldCheckBox.click();
        filterAndSearchPage.favoritesFieldCheckBox.click();
        filterAndSearchPage.extranetFieldCheckBox.click();
        filterAndSearchPage.tagFieldCheckBox.click();
    }

}

