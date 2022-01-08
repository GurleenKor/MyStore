package com.mystore.pageobjects;

import com.mystore.actiondriver.ActionDriver;
import com.mystore.basepackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OrderSummaryPage extends BaseClass {


    @FindBy(xpath="//span[contains(text(),\"I confirm my order\")]")
    WebElement confirmButton;

    @FindBy(xpath="//*[@id=\"center_column\"]/div/p/strong")
    WebElement completionMessage;

    public OrderSummaryPage()
    {

        PageFactory.initElements(driver,this);
    }

    public OrderConfirmation clickConfirmButton()
    {
        ActionDriver.click(driver,confirmButton);
        return new OrderConfirmation();

    }

     public void verifyCompletionMessage()
     {
         Assert.assertEquals(completionMessage.getText(),"Your order on My Store is complete.");

     }

}
