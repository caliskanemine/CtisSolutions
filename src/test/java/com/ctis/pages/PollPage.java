package com.ctis.pages;

import com.ctis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PollPage {

    public PollPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-vote']/span")
    public WebElement PollButton;

    @FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement AddmoreButton;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement EmployeesAndDepartmentsButton;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[1]/div[1]/div[1]")
    public WebElement marketingEmail;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[2]/div[1]/div[1]")
    public WebElement hrEmail;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[3]/div[1]/div[1]")
    public WebElement helpdeskEmail;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closeXbutton;

    @FindBy(xpath = "//input[@id='question_0']")
    public WebElement questionInput;

    @FindBy(xpath = "//input[@id='answer_0__0_']")
    public WebElement answer1input;

    @FindBy(xpath = "//input[@id='answer_0__1_']")
    public WebElement answer2input;

    @FindBy(xpath = "//input[@id='answer_0__2_']")
    public WebElement answer3input;

    @FindBy(xpath = "//input[@id='multi_0']")
    public WebElement allowMultipleChoiceCheckbox;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement SaveButton;

    @FindBy(xpath = "//div[@id='bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm']//iframe[@class='bx-editor-iframe']")
    public WebElement titleMessageBox;

    @FindBy(xpath = "//span[@class='feed-post-more-text']")
    public WebElement moreButton;

    @FindBy(xpath = "//span[text()='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[text()='The post has been deleted.']")
    public WebElement deletingMessage;





}
