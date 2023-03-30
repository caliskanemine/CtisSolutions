package com.ctis.pages;

import com.ctis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage {



    public MessagePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


        @FindBy(xpath = "(//span[.='Message'])[2]")
        public WebElement messageButton;

        @FindBy(id="bx-b-uploadfile-blogPostForm")
        public WebElement uploadFileButton;
        @FindBy(xpath="(//div[@class='diskuf-uploader']//input[@name='bxu_files[]'])")
        public WebElement uploadFileAndImagesButton;
        @FindBy(xpath ="//span[@class='insert-btn-text']")
        public WebElement insertInTextButton;

        @FindBy(xpath ="//span[@class='del-but']")
        public WebElement removeButton;
        @FindBy(xpath ="(//span[@class='files-text']//span)[5]")
        public WebElement renameButton;

        @FindBy(xpath ="//input[@class='files-name-edit-inp']")
        public WebElement renameInput;


        @FindBy(xpath = "//img[@class='files-preview']")
        public WebElement image;

}
