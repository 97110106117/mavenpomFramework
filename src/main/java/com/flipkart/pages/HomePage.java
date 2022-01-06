package com.flipkart.pages;

import com.flipkart.commons.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    CommonFunctions commons;

    @FindBy(xpath = "//input[@name='q']")
    private WebElement lnkSearch;

    @FindBy(xpath = "//a[text()='Login']")
    private WebElement lnkLogin;

    @FindBy(xpath = "//div[text()='More']")
    private WebElement lnkMore;

    @FindBy(xpath = "//span[text()='Cart']")
    private WebElement lnkCart;

    @FindBy(xpath = "//div[@class=\"_331-kn _2tvxW\"]/div/div/div")
    private WebElement lnkMainMenu;

    @FindBy(xpath = "//div[text()='Mobiles']")
    private WebElement lnkMobiles;

    @FindBy(xpath="//button[text()='✕']")
    private WebElement btnClosePopUp;

    public HomePage(WebDriver driver) {
        super(driver);
        commons = new CommonFunctions(driver);
    }

    public boolean isSearchBarLinkVisible() {
        return lnkSearch.isDisplayed();
    }
    public boolean isLoginLinkVisible() {
        return lnkLogin.isDisplayed();
    }
    public boolean isCartLinkVisible() {
        return lnkCart.isDisplayed();
    }
    public boolean isMainMenuLinkVisible() {
        return lnkMainMenu.isDisplayed();
    }
    public boolean isSubMenuProductLInkVisible() {
        return lnkMobiles.isDisplayed();
    }

    public void closeLoginPopUp(){
        commons.click(btnClosePopUp);
    }

    public void clickProductType() {
        commons.click(lnkMobiles);
    }
}
