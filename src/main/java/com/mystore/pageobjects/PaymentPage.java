package com.mystore.pageobjects;

import com.mystore.actiondriver.ActionDriver;
import com.mystore.basepackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BaseClass {

    @FindBy(xpath=" //*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    WebElement bankWire;
    @FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
    WebElement payCheck;

    public PaymentPage()
    {
        PageFactory.initElements(driver,this);
    }

    public OrderSummaryPage clickBankMethod()
    {

        ActionDriver.click(driver, bankWire);
        return(new OrderSummaryPage());

    }
    public OrderSummaryPage clickPayCheckMethod()
    {

        ActionDriver.click(driver, payCheck);
        return(new OrderSummaryPage());

    }






}
