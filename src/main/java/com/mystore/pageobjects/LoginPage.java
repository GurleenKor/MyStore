package com.mystore.pageobjects;

import com.mystore.actiondriver.ActionDriver;
import com.mystore.basepackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    @FindBy(name="email")
    WebElement emailTextBox;

    @FindBy(name = "email")
    WebElement createEmailTextBox;

    @FindBy(name="SubmitCreate")
    WebElement createSubmitButton;

    @FindBy(name="passwd")
    WebElement passwdTextBox;

    @FindBy(name="SubmitLogin")
    WebElement submitButton;

    public LoginPage()
    {
        PageFactory.initElements(driver,this);

    }



    public HomePage login(String email,String pass)
    {
        createEmailTextBox.sendKeys(email);

        passwdTextBox.sendKeys(pass);

        ActionDriver.click(driver,submitButton);
        return new HomePage();
    }


    public AddressPage login1(String email,String pass)
    {
        createEmailTextBox.sendKeys(email);

        passwdTextBox.sendKeys(pass);

        ActionDriver.click(driver,submitButton);
        return new AddressPage();
    }

    public AccountCreationPage setCreateEmailTextBox(String email)
    {

        createEmailTextBox.sendKeys(email);
        ActionDriver.click(driver,createSubmitButton);
        return new AccountCreationPage();
    }








}
