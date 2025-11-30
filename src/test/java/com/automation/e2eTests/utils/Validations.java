package com.automation.e2eTests.utils;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Validations extends BasePage {


    private WebDriver driver;

    public Validations() {
        super();
        this.driver = Setup.getDriver();
    }

    public void assertNotEquals(String actual, String expected) {
        Assert.assertNotEquals(actual, expected);

    }

    public Boolean isElementDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public void assertTrue(Boolean bool) {
        Assert.assertTrue(bool);

    }

}
