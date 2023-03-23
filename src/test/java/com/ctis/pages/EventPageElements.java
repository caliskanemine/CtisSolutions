package com.ctis.pages;

import com.ctis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventPageElements {
    public EventPageElements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "feed-add-post-form-tab-calendar")
    public WebElement eventButton;

    @FindBy(name = "EVENT_NAME")
    public WebElement eventName;

    @FindBy(name = "DATE_FROM")
    public WebElement startDate;
    @FindBy(name = "DATE_TO")
    public WebElement endDate;

    @FindBy(name = "TIME_FROM_")
    public WebElement startTime;

    @FindBy(xpath = "//input[@title='Hours']")
    public WebElement clockHour;

    @FindBy(xpath = "//input[@title='Minutes']")
    public WebElement clockMinutes;
    @FindBy(xpath = "//input[@value='Set Time']")
    public WebElement setTime;

    @FindBy(name = "TIME_TO_")
    public WebElement endTime;


    @FindBy(xpath = "//span[@class='feed-ev-tz-open']")
    public WebElement specifytimezone;

    @FindBy (id = "feed-cal-tz-fromcal_3Jcl")
    public WebElement timeZone;


    @FindBy(id = "event-full-daycal_3Jcl")
    public WebElement allDayButton;

    @FindBy(name = "EVENT_REMIND")
    public WebElement setReminderButton;

    @FindBy(name = "EVENT_REMIND_COUNT")
    public WebElement remindercountButton;

    @FindBy(name = "EVENT_REMIND_TYPE")
    public WebElement remindertypeButton;

    @FindBy(name = "EVENT_LOCATION")
    public WebElement eventlocationButton;

    @FindBy(id = "feed-event-dest-add-link")
    public WebElement membersBarButton;

    @FindBy(id = "destDepartmentTab_calnAJEM3")
    public WebElement allDepartmentButton;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-text'])[3]")
    public WebElement group15Button;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-check-arrow'])[2]")
    public WebElement group15AllDepartmentButton;


    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;


}
