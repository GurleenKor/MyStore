package com.mystore.pageobjects;

import com.mystore.basepackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AccountCreationPage extends BaseClass {

    @FindBy(xpath = "//*[@id=\"noSlide\"]/h1")
    WebElement formTitle;

    @FindBy(id="id_gender2")
    WebElement radioButtonMrs;

    @FindBy(id="id_gender1")
    WebElement radioButtonMr;

    @FindBy(name="customer_firstname")
    WebElement firstnameTextBox;

    @FindBy(name="customer_lastname")
    WebElement lastnameTextBox;
    @FindBy(id="email")
    WebElement emailTextBox;

    @FindBy(id="passwd")
    WebElement passwordTextBox;

    @FindBy(name="days")
    WebElement dropDownDays;
    @FindBy(name="months")
    WebElement dropDownMonths;

    @FindBy(name="years")
    WebElement dropDownYears;

    @FindBy(name="newsletter")
    WebElement checkBoxNewsletter;

 public AccountCreationPage()
 {

     PageFactory.initElements(driver,this);
 }

    public void verifyTitle()
    {
        Assert.assertEquals(formTitle.getText(), driver.getTitle());

    }


}
