package com.flipkart.pages;

import com.flipkart.commons.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage {

    CommonFunctions commons;

    @FindBy(xpath = "//p[text()='Shop Now']")
    private List<WebElement> lnkSubProductItems;

    @FindBy(xpath = "//input[@name='q']")
    private WebElement lnkSearch;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement txtSubmit;

    @FindBy(xpath = "//div[text()='realme C21Y (Cross Blue, 64 GB)']")
    private WebElement lnkMobile;

    public ProductPage(WebDriver driver) {
        super(driver);
        commons = new CommonFunctions(driver);
    }

    public void clickOnMobileBrand() {
        lnkSubProductItems.get(0).click();
    }

    public void chooseMobile() {
        implicitWait();
        commons.click(lnkMobile);
    }
}
