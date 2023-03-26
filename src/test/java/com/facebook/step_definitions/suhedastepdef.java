package com.facebook.step_definitions;

import com.facebook.pages.suhedapages;
import com.facebook.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;

public class suhedastepdef {

    suhedapages suhedapages = new suhedapages();

    @Given("user is logged in")
    public void user_is_logged_in() {
        Driver.getDriver().get("https://www.facebook.com/");
        suhedapages.email.sendKeys(Keys.chord(Keys.COMMAND,"A")+Keys.CLEAR);
        suhedapages.email.sendKeys("");
        suhedapages.password.sendKeys(Keys.chord(Keys.COMMAND,"A")+Keys.CLEAR);
        suhedapages.password.sendKeys("");
        suhedapages.loginbutton.click();

    }

}
