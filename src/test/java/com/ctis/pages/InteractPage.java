package com.ctis.pages;

import com.ctis.utilities.Driver;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InteractPage {

    public InteractPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[text()='Add comment'])[1]")
    public WebElement addComment;

    @FindBy(xpath = "(//button[.='Send'])[1]")
    public WebElement sendButton;

    @FindBy(xpath ="(//div//a[@class='bx-ilike-text'])[1]")
    public WebElement likeButton;


    @FindBy(xpath = "(//a[text()='Unfollow'])[2]")
    public WebElement unfollowButton;

    @FindBy(xpath = "//div[@class='feed-com-text-inner-inner']/div[text()='Hi Guys']")
    public WebElement userComment;


    @FindBy(xpath = "//div[@class='feed-post-emoji-text-box feed-post-emoji-move-to-right']")
    public WebElement likeSign;

    @FindBy(xpath = "(//a[text()='Follow'])[1]")
    public WebElement followButton;

    @FindBy(xpath ="(//div//a[text()='marketing71@cybertekschool.com'])/../../../..//div//a[text()='Like']")
    public WebElement likeYourComment;

    @FindBy(xpath ="(//div//a[text()='marketing71@cybertekschool.com'])/../../../..//div//a[text()='Reply']")
    public WebElement replyYourCommentButton;

    @FindBy(xpath = "(//div[@class='bxhtmled-area-cnt'])[1]")
    public WebElement commentYourComment;

    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-sm ui-btn-primary'])[1]")
    public WebElement sendYourSecondCommentButton;


    @FindBy(xpath = "(//span[@class='feed-content-view-cnt'])[2]")
    public WebElement reviewers;

    @FindBy(xpath = "//span[@class='bx-contentview-popup']//a[5]")
    public WebElement reviewerName;


    @FindBy(xpath = "(//div[@title='Add to favorites'])[5]")
    public WebElement starButton;

    @FindBy(xpath = "//div[@title='Remove from favorites']")
    public WebElement removeStarButton;


}
