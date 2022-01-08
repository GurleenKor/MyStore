package com.mystore.pageobjects;

import com.mystore.actiondriver.ActionDriver;
import com.mystore.basepackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage extends BaseClass {

    @FindBy(name="cgv")
    WebElement agreeTermsCheckBox;

    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    WebElement checkOutButton;

    public ShippingPage()
    {
        PageFactory.initElements(driver,this);
    }

    public void clickCheckBox()
    {

        ActionDriver.click(driver,agreeTermsCheckBox);


    }

    public PaymentPage clickCheckOutButton()
    {
  ActionDriver.click(driver,checkOutButton);

  return new PaymentPage();

    }
}
