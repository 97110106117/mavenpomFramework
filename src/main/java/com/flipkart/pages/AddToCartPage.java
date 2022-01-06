package com.flipkart.pages;

import com.flipkart.commons.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends BasePage {

    CommonFunctions commons;

    @FindBy(xpath = "//button[text()='ADD TO CART']")
    private WebElement btnAddToCart;

    @FindBy(xpath = "//div[text()='Remove']")
    private WebElement btnRemove;

    @FindBy(xpath = "//div[text()='Cancel']/following-sibling::div[text()='Remove']")
    private WebElement btnRemovePopup;

    @FindBy(xpath = "//div[text()='successfully removed realme ']")
    private WebElement popup;

    public AddToCartPage(WebDriver driver) {
        super(driver);
        commons = new CommonFunctions(driver);
    }

    public void switchToWindow() {
        implicitWait();
        System.out.println(getDriver().getTitle());
        commons.switchWindow();
    }

    public void addToCart() {
        implicitWait();
        switchToWindow();
        commons.scrollByView(btnAddToCart);
        commons.click(btnAddToCart);
    }

    public void removeProduct() {
        implicitWait();
        commons.scrollIntoView(btnRemove);
        commons.click(btnRemove);
    }

    public void clickDeletePopUp() {
        implicitWait();
        commons.click(btnRemovePopup);
    }

}
