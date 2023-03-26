package com.facebook.pages;

import com.facebook.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class suhedapages {

    public suhedapages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='_1gaz _1ga- _50f6']")
    public WebElement hesapekle;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "pass")
    public WebElement password;

    @FindBy(name = "login")
    public WebElement loginbutton;



}
