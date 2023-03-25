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






}
