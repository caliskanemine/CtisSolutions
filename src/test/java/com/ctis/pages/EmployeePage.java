package com.ctis.pages;

import com.ctis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {

    public EmployeePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employeeTab;

    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement companyStructureTab;

    @FindBy(xpath = "//span[@class='webform-small-button-text']")
    public WebElement addDepartmentButton;

    @FindBy(id = "NAME")
    public WebElement departmentName;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement addButton;

    @FindBy(xpath = "//select[@id='IBLOCK_SECTION_ID']")
    public WebElement parentDepartmentDropdown;

    @FindBy(xpath = "//a[@id='single-user-choice']")
    public WebElement selectFromStructureButton;

    @FindBy(xpath = "(//span[@class='finder-box-tab-text'])[1]")
    public WebElement recent;

    @FindBy(xpath = "(//span[@class='finder-box-tab-text'])[2]")
    public WebElement company;

    @FindBy(xpath = "(//span[@class='finder-box-tab-text'])[3]")
    public WebElement search;

    @FindBy(xpath = "(//div[@bx-tooltip-user-id='486'])[3]")
    public WebElement selectASupervisor;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-link popup-window-button-link-cancel']")
    public WebElement closeButton;


    @FindBy(xpath = "//div[@title='Add child department']")
    public WebElement addChildButton;
    @FindBy(xpath = "//td[@class='bx-str-top']//div[@title='Edit department']")
    public WebElement editDepartmentButton;

    @FindBy(xpath = "//span[@id='bx_str_129']")
    public WebElement cyberVetDepartmentButton;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@class='pagetitle-inner-container']//span[@class='webform-small-button-text']")
    public WebElement addDepartmentContainer;


    @FindBy(xpath = "//span[@id='bx_str_141']")
    public WebElement childDepartment;

    @FindBy(xpath = "//span[@id='bx_str_149']")
    public WebElement parentDepartment;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/div/div[2]/div/div/table[2]/tbody/tr[1]/td[1]/span/div[1]/div[1]")
    public WebElement developerDepartmentButton;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/div/div[2]/div/div/table[2]/tbody/tr[1]/td[1]/span/div[1]/div[2]/div[2]")
    public WebElement deleteDepartmentButton;
}