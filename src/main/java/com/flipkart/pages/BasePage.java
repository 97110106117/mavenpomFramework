package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        implicitWait();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void implicitWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;

    }

}
