package com.ctis.pages;

import com.ctis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterAndSearchPage {


    public FilterAndSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@placeholder='Filter and search']")
    public WebElement filterAndSearchBox;

    @FindBy (xpath = "(//div[.='Last 60 days'])[6]")
    public WebElement days60;

    @FindBy(xpath = "(//span[.='Work'])[2]")
    //@FindBy(xpath = "//div[@data-id='work']")
    public WebElement workFilter;

    @FindBy(xpath = "(//span[.='Favorites'])[2]")
    public WebElement favoritesFilter;

    @FindBy(xpath = "(//span[.='My Activity'])[2]")
    public WebElement myActivityFilter;

    @FindBy(xpath = "(//span[.='Announcements'])[2]")
    public WebElement announcementsFilter;

    @FindBy(xpath = "(//span[.='Workflows'])[2]")
    public WebElement workFlowsFilter;


    @FindBy(xpath = "//span[.='Add field']")
    public WebElement addFieldButton;


    @FindBy(xpath = "(//div[.='Date'])[2]")
    public WebElement dateFieldCheckBox;

    @FindBy(xpath = "//div[@data-name='DATE_CREATE_datesel']")
    public WebElement dateInputBox;


    @FindBy(xpath = "(//div[.='Type'])[2]")
    public WebElement typeFieldCheckBox;

    @FindBy(xpath = "//div[@data-name='EVENT_ID']")
    public WebElement typeInputBox;


    @FindBy(xpath = "(//div[.='Author'])[2]")
    public WebElement authorFieldCheckBox;

    @FindBy(xpath = "//input[@name='CREATED_BY_ID_label']")
    public WebElement authorInputBox;


    @FindBy(xpath = "(//div[.='To'])[3]")
    public WebElement toFieldCheckBox;

    @FindBy(xpath = "//input[@name='TO_label']")
    public WebElement toInputBox;


    @FindBy(xpath = "(//div[.='Favorites'])[2]")
    public WebElement favoritesFieldCheckBox;

    @FindBy(xpath = "//div[@data-name='FAVORITES_USER_ID']")
    public WebElement favoritesInputBox;


    @FindBy(xpath = "(//div[.='Tag'])[2]")
    public WebElement tagFieldCheckBox;

    @FindBy(xpath = "//input[@name='TAG']")
    public WebElement tagInputBox;


    @FindBy(xpath = "(//div[.='Extranet'])[2]")
    public WebElement extranetFieldCheckBox;

    @FindBy(xpath = "//div[@data-name='EXTRANET']")
    public WebElement extranetInputBox;







}
