package com.automation.e2eTests.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils extends BasePage {

    private WebDriver driver;

    public SeleniumUtils() {
        super();
        this.driver = Setup.getDriver();
    }

    public void get(String url) {
        driver.get(url);
    }

    public void waitForElementToBeClickable(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void click(WebElement elementAttr) {
        if (elementAttr.getClass().getName().contains("By")) {
            waitForElementToBeClickable(elementAttr);
            driver.findElement((By) elementAttr).click();
        } else {
            elementAttr.click();
        }
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}