package com.flipkart.testscripts;

import com.flipkart.pages.HomePage;
import com.flipkart.pages.ProductPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseTest {
    HomePage homePage;
    ProductPage productPage;

    @BeforeClass
    public void initObjects() {
        homePage = new HomePage(getDriver());
        productPage = new ProductPage(getDriver());
    }

    /*@Test(priority = 1)
    public void setHomePage() {
        homePage.closeLoginPopUp();
        homePage.clickProductType();
    }

    @Test(priority = 2)
    public void subProducts() {
        productPage.clickOnMobileBrand();
        System.out.println("select products");
    }*/

    /*@Test(priority = 3)
    public void verifyTxtValue() {
        productPage.getTxtSearchBar("realme C25Y (Metal Grey, 64 GB)");
    }
*/
    /*@Test(priority = 4)
    public void realMeMobile() {
        productPage.getMobilesItems();
    }*/
}
