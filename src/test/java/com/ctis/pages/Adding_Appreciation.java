package com.ctis.pages;

import com.ctis.utilities.Driver;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    public WebElement linkButton;


    @FindBy(id="linkidPostFormLHE_blogPostForm-text")
    public WebElement textBox;

    @FindBy(id="linkidPostFormLHE_blogPostForm-href")
    public WebElement linkBox;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//body//a[text()='hr1 cong']")
    public WebElement linkedMessage;

    @FindBy(id="blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "(//div//a[@href='https://www.bestholiday.com/'])[1]")
    public WebElement linkedUrlMessage;

    @FindBy(xpath = "//span[@title='Insert video']")
    public WebElement insertVideoButton;

    @FindBy(id="video_idPostFormLHE_blogPostForm-source")
    public WebElement videoSourceBox;

    @FindBy(xpath = "//div//input[@value='Save']")
    public WebElement videoSaveButton;

    @FindBy(xpath = "(//a[@class='feed-post-user-name'])[1]")
    public WebElement userTypeName;

    @FindBy(xpath = "//span[@class='bxhtmled-video-error']")
    public WebElement videoErrorMessage;


}
