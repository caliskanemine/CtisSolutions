package com.ctis.pages;

import com.ctis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPageElements {

    public AppreciationPageElements(){ PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreButton;

    @FindBy(xpath = "(//div[@class='menu-popup']//span[.='Appreciation'])")
    public WebElement appreeciationButton;

    @FindBy(id="bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesButton;

    @FindBy(xpath="(//div[@class='diskuf-uploader']//input[@name='bxu_files[]'])")
    public WebElement uploadFileAndImagesButton;

    @FindBy(xpath ="//span[@class='insert-btn-text']")
    public WebElement insertInTextButton;

    @FindBy(xpath ="//tr[contains(@id, 'disk-edit')]")
    public WebElement removeButton;

    @FindBy(xpath ="(//span[@class='files-text']//span)[5]")
    public WebElement renameButton;

    @FindBy(xpath ="//input[@class='files-name-edit-inp']")
    public WebElement renameInput;


    @FindBy(xpath = "//img[@class='files-preview']")
    public WebElement image;
}

