package com.facebook.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.facebook.utilities.Driver;

public class Hooks {

            @After
        public void teardownScenario(Scenario scenario) {

            if (scenario.isFailed()) {
                byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

                scenario.attach(screenshot, "image/png", scenario.getName());
            }

            Driver.closeDriver();
        }
    }
