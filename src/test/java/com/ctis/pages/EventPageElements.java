package com.ctis.pages;

import com.ctis.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EventPageElements {

    public EventPageElements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

public String groupName;
public String groupAllemployee;

public String employeeEmail;

public int hour, minute;
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
    public WebElement startclockHour;

    @FindBy(xpath = "//input[@title='Minutes']")
    public WebElement startclockMinutes;

    @FindBy(xpath = "(//input[@title='Hours'])[2]")
    public WebElement endclockHour;

    @FindBy(xpath = "(//input[@title='Minutes'])[2]")
    public WebElement endclockMinutes;
    @FindBy(xpath = "//input[@value='Set Time']")
    public WebElement setstartTimeButton;
    @FindBy(xpath = "(//input[@value='Set Time'])[2]")
    public WebElement setendTimeButton;

    @FindBy(name = "TIME_TO_")
    public WebElement endTime;


    @FindBy(xpath = "//span[@class='feed-ev-tz-open']")
    public WebElement specifytimezone;

    @FindBy(id = "feed-cal-tz-fromcal_3Jcl")
    public WebElement timeZone;


    @FindBy(id = "event-full-daycal_3Jcl")
    public WebElement allDayButton;

    @FindBy(xpath = "//input[@class='feed-event-rem-ch']")
    public WebElement setReminderButton;

    @FindBy(id = "event-remind_countcal_3Jcl")
    public WebElement remindercountButton;

    @FindBy(name = "EVENT_REMIND_TYPE")
    public WebElement remindertypeButton;

    @FindBy(id = "event-locationcal_3Jcl")
    public WebElement eventlocationButton;

    @FindBy(xpath = "//a[@id='feed-event-dest-add-link']")
    public WebElement membersBarButton;
    @FindBy(xpath = "/html//input[@id='feed-event-dest-input']")
    public WebElement membersWriteBarButton;


    @FindBy(partialLinkText = "hr15@cybertekschool.com")
    public WebElement hr15Button;

    @FindBy(xpath = "/html//div[@id='bx-lm-box-search-content']//a[@href='#U510']//div[@class='bx-finder-box-item-t7-name']")
    public WebElement hd20Button;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement allDepartmentButton;

    @FindBy(xpath = "/html//div[@id='bx-lm-box-last-content']/table[@class='bx-finder-box-tabs-content-table']//td/div[2]/div[2]/div[5]/a[@href='#DR138']/div[@class='bx-finder-company-department-text']")
    public WebElement group15Button;

    @FindBy(xpath = "/html//div[@id='bx-lm-box-last-content']/table[@class='bx-finder-box-tabs-content-table']//td[@class='bx-finder-box-tabs-content-cell']/div[2]/div[2]/div[6]/a[@href='#DR138']//div[@class='bx-finder-company-department-check-arrow']")
    public WebElement group15AllDepartmentButton;


    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;

    public void getGroupName(String groupName){
        this.groupName=groupName;
        String locater = groupName;
        Driver.getDriver().findElement(By.partialLinkText(locater)).click();
    }


    public void setStartTime(int hour, int minute){
        this.hour=hour;
        this.minute=minute;
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),10);
        WebElement hourLocater = Driver.getDriver().findElement(By.xpath("//input[@title='Hours']"));
        WebElement minuteLocater = Driver.getDriver().findElement(By.xpath("//input[@title='Minutes']"));

        wait.until(ExpectedConditions.visibilityOf(hourLocater));
        hourLocater.sendKeys(Keys.chord(Keys.CONTROL + "a") + Keys.BACK_SPACE + hour);

        WebDriverWait wait2= new WebDriverWait(Driver.getDriver(),10);
        wait2.until(ExpectedConditions.visibilityOf(minuteLocater));
        minuteLocater.sendKeys(Keys.chord(Keys.CONTROL + "a") + Keys.BACK_SPACE + minute);
    }

    public void setEndTime(int hour, int minute){
        this.hour=hour;
        this.minute=minute;
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),10);
        WebElement hourLocater = Driver.getDriver().findElement(By.xpath("(//input[@title='Hours'])[2]"));
        WebElement minuteLocater = Driver.getDriver().findElement(By.xpath("(//input[@title='Minutes'])[2]"));

        wait.until(ExpectedConditions.visibilityOf(hourLocater));
        hourLocater.sendKeys(Keys.chord(Keys.CONTROL + "a") + Keys.BACK_SPACE + hour);

        WebDriverWait wait2= new WebDriverWait(Driver.getDriver(),10);
        wait2.until(ExpectedConditions.visibilityOf(minuteLocater));
        minuteLocater.sendKeys(Keys.chord(Keys.CONTROL + "a") + Keys.BACK_SPACE + minute);
    }



    public void addEmployee(String employeeEmail){
        this.employeeEmail=employeeEmail;
        WebElement employeeLocater = Driver.getDriver().findElement(By.partialLinkText(employeeEmail));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(employeeLocater));
        employeeLocater.click();
    }

    public void getGroupAllEmployee(String groupName){
        this.groupAllemployee=groupAllemployee;
        String locater = "//div[@rel='"+groupName+": All department and subdepartment employees']";
        Driver.getDriver().findElement(By.xpath(locater)).click();
    }

}
