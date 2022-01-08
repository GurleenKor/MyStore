package com.mystore.pageobjects;

import com.mystore.basepackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends BaseClass {

    @FindBy(xpath="//span[contains(text(),\"My wishlists\")]")
    WebElement myWishlistButton;

    @FindBy(xpath="//span[contains(text(),\"Order history and details\")]")
    WebElement orderHistoryButton;

    public HomePage()
    {
        PageFactory.initElements(driver,this);

    }
     public void verifyMyWishlist()
     {
         Assert.assertTrue( myWishlistButton.isDisplayed());


     }

     public void validateOrderList()
     {
         Assert.assertTrue(orderHistoryButton.isDisplayed());
     }





}
