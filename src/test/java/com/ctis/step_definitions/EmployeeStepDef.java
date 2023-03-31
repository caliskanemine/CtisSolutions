package com.ctis.step_definitions;

import com.ctis.pages.EmployeePage;
import com.ctis.pages.LoginPageElements;
import com.ctis.pages.LogoutPageElements;
import com.ctis.utilities.BrowserUtils;
import com.ctis.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class EmployeeStepDef {

    EmployeePage employeePage = new EmployeePage();
    LogoutPageElements logoutPageElements = new LogoutPageElements();
    LoginPageElements loginPageElements = new LoginPageElements();

    @When("user should click Employee tab")
    public void user_should_click_employee_tab() {
    employeePage.employeeTab.click();
    BrowserUtils.sleep(2);
    }
    @Then("user should see Company Structure tab")
    public void user_should_see_company_structure_tab() {
        employeePage.companyStructureTab.isDisplayed();
        BrowserUtils.sleep(2);
    }

    @When("Hr user click ADD DEPARTMENT button")
    public void hr_user_click_add_department_button() {
    employeePage.addDepartmentButton.click();
        BrowserUtils.sleep(2);
    }
    @When("user write a name")
    public void user_write_a_name() {
     employeePage.departmentName.sendKeys("Everything2");
        BrowserUtils.sleep(2);
    }
    @When("user click ADD button")
    public void user_click_add_button() {
        employeePage.addButton.click();
        BrowserUtils.sleep(2);
    }


    @When("user click Parent Department dropdown button")
    public void userClickParentDepartmentDropdownButton() {
        Select select = new Select(employeePage.parentDepartmentDropdown);
        select.selectByIndex(5);
        BrowserUtils.sleep(2);
    }

    @When("user click Select from structure button")
    public void userClickSelectFromStructureButton() {
        employeePage.selectFromStructureButton.click();
    }

    @Then("user select recent")
    public void userSelectRecent() {
        employeePage.recent.click();
        BrowserUtils.sleep(2);
    }

    @Then("user select Company")
    public void userSelectCompany() {
        employeePage.company.click();
        BrowserUtils.sleep(2);
    }

    @Then("user select Search")
    public void userSelectSearch() {
        employeePage.search.click();
        BrowserUtils.sleep(2);

    }

    @Then("user select any")
    public void userSelectAny() {
        employeePage.selectASupervisor.click();
        BrowserUtils.sleep(2);
    }

    @And("user click CLOSE button")
    public void userClickCLOSEButton() {
        employeePage.closeButton.click();
        BrowserUtils.sleep(2);
    }

    @And("different user enter")
    public void differentUserEnter() {
        loginPageElements.inputUsername.clear();
    }


    @And("user click Add child department button")
    public void userClickAddChildDepartmentButton() {
        employeePage.addDepartmentButton.click();
    }

    @When("user hover over on a department")
    public void userHoverOverOnADepartment() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(employeePage.cyberVetDepartmentButton).perform();
    }

    @And("user click Edit department button")
    public void userClickEditDepartmentButton() {
        employeePage.editDepartmentButton.click();
    }

    @And("user write a new name")
    public void userWriteANewName() {
        employeePage.departmentName.clear();
        employeePage.departmentName.sendKeys("Everything3");
        BrowserUtils.sleep(2);
    }

    @And("user click save button")
    public void userClickSaveButton() {
        employeePage.saveButton.click();
    }

    @Then("user see ADD DEPARTMENT button")
    public void userSeeADDDEPARTMENTButton() {
        //employeePage.addDepartmentButton.isDisplayed();
        //String str = (employeePage.addDepartmentContainer).getText();
        //System.out.println(str);
        //Assert.assertFalse(str.equals("ADD DEPARTMENT"));
        WebElement c=Driver.getDriver().findElement(By.xpath("//span[@class='menu-item-link-text'][contains(.,'Employees')]"));
        c.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        WebElement dr=Driver.getDriver().findElement(By.xpath("//div[@class='pagetitle-inner-container']"));
        System.out.println(dr.getText());
        Assert.assertTrue(dr.getText().contains("ADD DEPARTMENT"));
    }

   @Then("user should not see ADD DEPARTMENT button")
    public void userShouldNotSeeADDDEPARTMENTButton(){
    //String str = (employeePage.addDepartmentContainer).getText();
       //Assert.assertFalse(str.equals("ADD DEPARTMENT"));
       WebElement c=Driver.getDriver().findElement(By.xpath("//span[@class='menu-item-link-text'][contains(.,'Employees')]"));
       c.click();
       Driver.getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
       WebElement dr=Driver.getDriver().findElement(By.xpath("//div[@class='pagetitle-inner-container']"));
       System.out.println(dr.getText());
       Assert.assertFalse(dr.getText().contains("ADD DEPARTMENT"));

       /* try{
            Assert.assertFalse(employeePage.addDepartmentButton.getText().equals("ADD DEPARTMENT"));
        }
        catch (RuntimeException e){
            System.out.println("You dont have permission");
        }*/
    }


    @When("user drag and drop a department under another department")
    public void userDragAndDropADepartmentUnderAnotherDepartment() {
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(employeePage.childDepartment,employeePage.parentDepartment).perform();
    }

    @And("user click Delete department button")
    public void userClickDeleteDepartmentButton() {
        //method
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(employeePage.developerDepartmentButton).perform();
        employeePage.deleteDepartmentButton.click();

    }
}
