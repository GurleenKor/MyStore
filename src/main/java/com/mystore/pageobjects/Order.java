package com.mystore.pageobjects;

import com.mystore.actiondriver.ActionDriver;
import com.mystore.basepackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order extends BaseClass {

    @FindBy(xpath="//span[@class=\"price\"]")
    WebElement unitPrice;

    @FindBy(name="quantity_1_1_0_0")
    WebElement quantity;

    @FindBy(id="total_product_price_1_1_0")
    WebElement totalPrice;

    @FindBy(id="total_shipping")
    WebElement totalShipping;

    @FindBy(id="total_price_without_tax")
    WebElement totalPriceWithoutTax;

    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    WebElement checkOutButton;

    public Order()
    {
        PageFactory.initElements(driver,this);

    }

    public Double getUnitPrice()
    {
        String price=unitPrice.getText();
        String unit=price.replaceAll("[^a-zA-Z0-9]","");
        Double unit1= Double.parseDouble(unit);
        return unit1/100;

    }

    public Double getGrandTotalPrice()
    {
        String price=totalPriceWithoutTax.getText();
        String grandTotal=price.replaceAll("[^a-zA-Z0-9]","");
        Double total= Double.parseDouble(grandTotal);
        return total/100;
    }

    public LoginPage clickCheckOutButton() {
        ActionDriver.click(driver,checkOutButton);
        return new LoginPage();
    }
}
