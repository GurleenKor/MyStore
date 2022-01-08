package com.mystore.pageobjects;

import com.mystore.basepackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchResultPage extends BaseClass {
     @FindBy(xpath="//img[@id=\"bigpic\"]")
    WebElement productImage;

     public SearchResultPage()
     {
   PageFactory.initElements(driver,this);

     }

     public void verifyResult()
     {
         Assert.assertTrue(productImage.isDisplayed());

     }

     public AddToCart clickOnProduct()
     {
         productImage.click();

         return new AddToCart();


     }



}
