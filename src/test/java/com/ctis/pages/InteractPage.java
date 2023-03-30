package com.ctis.pages;

import com.ctis.utilities.BrowserUtils;
import com.ctis.utilities.Driver;
import io.cucumber.java.zh_cn.假如;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.sql.rowset.BaseRowSet;

public class InteractPage {

    public InteractPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[text()='Add comment'])[1]")
    public WebElement addComment;

    @FindBy(xpath = "(//div[@class='feed-add-post-buttons'])[1]//button[.='Send']")
    public WebElement sendButton;

    @FindBy(xpath ="(//div//a[@class='bx-ilike-text'])[1]")
    public WebElement likeButton;


    @FindBy(xpath = "(//a[text()='Unfollow'])[2]")
    public WebElement unfollowButton;

    @FindBy(xpath = "//div[@class='feed-com-text-inner-inner']/div[text()='Hi Guys']")
    public WebElement userComment;


    @FindBy(xpath = "//div[contains(@id, 'bx-ilike-top-users-BLOG_POST')][.='You']")
    public WebElement likeSign;

    @FindBy(xpath = "(//a[text()='Follow'])[1]")
    public WebElement followButton;


    @FindBy(xpath = "(//span[@class='feed-content-view-cnt'])[2]")
    public WebElement reviewers;

    @FindBy(xpath = "//span[@class='bx-contentview-popup']//a[1]")
    public WebElement reviewerName;


    @FindBy(xpath = "(//div[@title='Add to favorites'])[5]")
    public WebElement starButton;

    @FindBy(xpath = "//div[@title='Remove from favorites']")
    public WebElement removeStarButton;

    public void likeCommand(String username){
      WebElement likeButton =  Driver.getDriver().findElement(By.xpath("(//div//a[text()='" + username + "'])[1]/../../../..//div//a[text()='Like']"));
      likeButton.click();

    }

    public void replyAndSendTExtToYourMessage(String userName, String message){

        WebElement replyButton = Driver.getDriver().findElement(By.xpath("(//div//a[text()='" +userName+"'])[1]/../../../..//div//a[text()='Reply']"));
        replyButton.click();

        WebElement commentArea = Driver.getDriver().findElement(By.xpath("(//div[@class='bxhtmled-area-cnt'])[1]"));

        WebElement sendCommentButton = Driver.getDriver().findElement(By.xpath("(//button[@class='ui-btn ui-btn-sm ui-btn-primary'])[1]"));

        Actions actions = new Actions(Driver.getDriver());

        actions.doubleClick(commentArea).perform();
        actions.sendKeys(message).perform();
        BrowserUtils.sleep(2);

        actions.click(sendCommentButton).perform();
    }

    public void verifyNewComment(String message){
       WebElement newMessage = Driver.getDriver().findElement(By.xpath("//div[@class='feed-com-text-inner-inner']//div[text()=',"+ message + "']"));
        Assert.assertTrue(newMessage.getText().contains(message));
    }

}

