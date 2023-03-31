package com.ctis.pages;

import com.ctis.utilities.BrowserUtils;
import com.ctis.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    @FindBy(xpath = "//*[@id=\"bx-component-scope-lifefeed_task_form-responsible\"]/span[2]/a[1]")
    public WebElement addMore;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[text()='hr8@cybertekschool.com']")
    public WebElement hrmail;

    @FindBy(xpath = "//div[text()='helpdesk22@cybertekschool.com']")
    public WebElement helpdeskmail;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closingX;


    @FindBy(xpath = "//span[@class='feed-task-info-text-title']")
    public WebElement addedTask;

    @FindBy(xpath = "//*[@id=\"blogPostEditCreateTaskPopup\"]/div[2]/span")
    public WebElement popupView;


    @FindBy(xpath = "//span[text()='Checklist']")
    public WebElement checklistbutton;

    @FindBy(xpath = "//input[@class='js-id-checklist-is-form-title task-checklist-field-add']")
    public WebElement checklistToDoInput;


    @FindBy(xpath = "//span[@class='js-id-checklist-is-open-form task-dashed-link-inner']")
    public WebElement checklistAdd;


    @FindBy(xpath = "//input[@class='task-options-inp']")
    public WebElement deadlineinput;

    @FindBy(xpath = "//div[@class='bx-calendar-button-block']/a")
    public WebElement deadlineSelect;

    public void deadline(){
        deadlineinput.click();
        BrowserUtils.sleep(1);
        deadlineSelect.click();
    }

    public void checklist(){
        checklistbutton.click();
        checklistToDoInput.sendKeys("first checklist"+ Keys.ENTER);
        checklistToDoInput.sendKeys("second checklist");
        checklistAdd.click();
    }

}
