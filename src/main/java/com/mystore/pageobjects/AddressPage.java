package com.mystore.pageobjects;

import com.mystore.actiondriver.ActionDriver;
import com.mystore.basepackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends BaseClass {
    @FindBy(xpath = "//span[text()='Proceed to checkout']")
    WebElement checkOutButton;

    public AddressPage()
    {
        PageFactory.initElements(driver,this);

    }

    public ShippingPage clickProceed()
    {
        ActionDriver.click(driver,checkOutButton);
        return (new ShippingPage());
    }



}
