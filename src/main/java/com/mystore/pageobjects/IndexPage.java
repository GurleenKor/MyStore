package com.mystore.pageobjects;

import com.mystore.actiondriver.ActionDriver;
import com.mystore.basepackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BaseClass {

    @FindBy(xpath = "//a[@class=\"login\"]")
    WebElement signInButton;

    @FindBy(xpath="//*[@id=\"header_logo\"]/a/img")
    WebElement logoImage;

    @FindBy(id = "search_query_top")

    WebElement searchBox;
    @FindBy(xpath = "//button[@class=\"btn btn-default button-search\"]")

    WebElement searchButton;

    public IndexPage() {
        PageFactory.initElements(driver, this);
    }

    public LoginPage clickSignIn() throws Throwable {
        ActionDriver.click(driver, signInButton);
        return new LoginPage();
    }

    public boolean validateLogo() {
        return true; //(ActionDriver.isImageDisplayed(driver, logoImage));

    }

    public String getMyStoreTitle() {

        String title = driver.getTitle();
        return title;
    }

    public SearchResultPage searchProduct(String str) {

        searchBox.sendKeys(str);
        ActionDriver.click(driver, searchButton);
        return new SearchResultPage();
    }


}
