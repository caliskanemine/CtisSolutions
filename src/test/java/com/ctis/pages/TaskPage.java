package com.ctis.pages;

import com.ctis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

    public TaskPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Task']")
    public WebElement taskbutton;

    @FindBy(xpath = "//input[@id='tasks-task-priority-cb']")
    public WebElement highPriorityCheckbox;

    @FindBy(xpath = "//input[@placeholder='Things to do']")
    public WebElement thingsToDo;

    @FindBy(xpath = "//*[@id=\"bx-component-scope-lifefeed_task_form-responsible\"]/span[2]/a[1]/text()")
    public WebElement addMore;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"341953217_last_U700\"]/div[3]/div")
    public WebElement hrmail;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closingX;


    @FindBy(xpath = "//span[@class='feed-task-info-text-title']")
    public WebElement addedTask;

}
