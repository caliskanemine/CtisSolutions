package com.ctis.pages;

import com.ctis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adding_Appreciation {


    public Adding_Appreciation(){
        PageFactory.initElements(Driver.getDriver(),this);  }
    @FindBy(id="feed-add-post-form-link-more")
    public WebElement moreBtn;

    @FindBy(xpath="//span[text()='Appreciation']")
    public WebElement appreciationBtn;

    @FindBy(xpath = "//div[@class='bxhtmled-area-cnt']//iframe")
    public WebElement messageArea;


    @FindBy(id="bx-b-mention-blogPostForm")
    public WebElement mentionBtn;

    @FindBy(xpath = "//a//div[text()='hr1@cybertekschool.com']")
    public WebElement mentionSelect;

    @FindBy(xpath="//div[@class='feed-add-post-destination-wrap']//span[text()='hr1@cybertekschool.com']")
    public WebElement mentionText;






}
