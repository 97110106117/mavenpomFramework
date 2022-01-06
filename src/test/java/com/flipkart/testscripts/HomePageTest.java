package com.flipkart.testscripts;

import com.flipkart.pages.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTest extends BaseTest{
    HomePage homepage;

    @BeforeClass
    public void initObjects() {
        homepage = new HomePage(getDriver());
    }

    @Test(priority = 1)
    public void VerifySearchBarLinkVisible() {
        assertTrue(homepage.isSearchBarLinkVisible());
    }

    @Test(priority = 2)
    public void verifyLoginLink() {
        assertTrue(homepage.isLoginLinkVisible());
    }

    @Test(priority = 3)
    public void verifyWishListLink() {
        assertTrue(homepage.isCartLinkVisible());
    }

    @Test(priority = 4)
    public void verifyMainMenuLink() {
        assertTrue(homepage.isMainMenuLinkVisible());
    }

    @Test(priority = 5)
    public void verifySubMenuProductLink() {
        assertTrue(homepage.isSubMenuProductLInkVisible());
    }

   /* @Test(priority = 6)
    public void cancelBtn() {
        homepage.closeLoginPopUp();
    }*/

    /*@Test(priority = 7)
    public void getClickOnCategory() {
        homepage.clickOnCategory();
    }*/
}
