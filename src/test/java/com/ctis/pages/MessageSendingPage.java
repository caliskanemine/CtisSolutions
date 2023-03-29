package com.ctis.pages;

import com.ctis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageSendingPage {

    public MessageSendingPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[text()='Message']")
    public WebElement messagebtn;

    @FindBy (xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement frame;

    @FindBy (xpath = "//body[@contenteditable]")  ////iframe[@class='bx-editor-iframe']
    public WebElement textArea;

    @FindBy (xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendBtn;

    @FindBy (xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelBtn;

    @FindBy (xpath = "//span[text()='All employees']")
    public WebElement allEmployees;

    @FindBy (xpath = "//a[text()='Add more']")
    public WebElement addMoreBtn;

    @FindBy (xpath = "//a[contains(@id, 'destDepartmentTab_destination')]")
    public WebElement employeesAndDepartmentsBtn;

    @FindBy (xpath = "//div[contains(text(),'marketing1@cybertekschool.com')]")
    public WebElement marketing1Mail;

    @FindBy (xpath = "//div[contains(@class,'bx-finder-company-department-employee-name')][normalize-space()='hr1@cybertekschool.com']")
    public WebElement hr1Mail;

    @FindBy (xpath = "//div[normalize-space()='helpdesk22@cybertekschool.com']")
    public WebElement helpDesk22Mail;

    @FindBy (xpath = "//span[@class='popup-window-close-icon']")
    public WebElement recipientPopUpCloseBtn;

    @FindBy (xpath = "//input[@id='feed-add-post-destination-input']")
    public WebElement recipientInputArea;

    @FindBy (xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement recipientDelBtn;





    @FindBy (xpath = "//span[@class='feed-add-info-text']")
    public WebElement mssageTitleErrorText;

    @FindBy (xpath = "//span[@class='feed-add-info-text']")
    public WebElement noRecipientErrorText;



}
