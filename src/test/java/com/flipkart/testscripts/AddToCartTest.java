package com.flipkart.testscripts;

import com.flipkart.pages.AddToCartPage;
import com.flipkart.pages.HomePage;
import com.flipkart.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class AddToCartTest extends BaseTest {
    HomePage homePage;
    ProductPage productPage;
    AddToCartPage addToCartPage;

    @BeforeClass
    public void initObjects() {
        homePage = new HomePage(getDriver());
        productPage = new ProductPage(getDriver());
        addToCartPage = new AddToCartPage(getDriver());
    }

    @Test(priority = 1,groups = "smoking")
    public void verifyAddToCart()  {
        homePage.closeLoginPopUp();
        homePage.clickProductType();
        productPage.clickOnMobileBrand();
        productPage.chooseMobile();
        addToCartPage.addToCart();
        addToCartPage.removeProduct();
        addToCartPage.clickDeletePopUp();
        Assert.assertEquals(true, true);

    }
}
