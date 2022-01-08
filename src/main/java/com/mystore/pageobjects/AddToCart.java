package com.mystore.pageobjects;

import com.mystore.actiondriver.ActionDriver;
import com.mystore.basepackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddToCart extends BaseClass {

    @FindBy(id="\"quantity_wanted\"")
    WebElement quantity;

    @FindBy(id="group_1")
    WebElement size;
    @FindBy(id="color_13")
    WebElement color;

    @FindBy(xpath="//span[contains(text(),'Add to cart')]")
    WebElement addToCart;

    @FindBy(xpath="//i[@class=\"icon-ok\"]")
    WebElement cartSummaryText;

    @FindBy(xpath = "//*[contains(text(),\"Proceed to checkout\")]")
    WebElement checkOutButton;



    public AddToCart()
    {
        PageFactory.initElements(driver,this);

    }

    public void setQuantity(String no) {

        quantity.sendKeys(no);
    }

    public void setSize(String size1)
    {
        Select s= new Select(size);
        s.selectByVisibleText(size1);

    }

    public void addToCart()
    {
       ActionDriver.click(driver,addToCart);

    }

    public void validateAddToCart()
    {
        Assert.assertTrue(cartSummaryText.isDisplayed());

    }

    public Order clickCheckOutButton() throws Throwable {
        ActionDriver.JSClick(driver,checkOutButton);
        return (new Order());
    }


}
