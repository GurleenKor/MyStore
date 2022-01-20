package com.mystore.testscripts;

import com.mystore.basepackage.BaseClass;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Properties;
public class LoginTest extends BaseClass {
    LoginPage page;
    IndexPage ip ;



    @BeforeMethod
    public void setUp() throws Throwable  {

        launchApp();
        ip= new IndexPage ();
        ip.clickSignIn ();



    }


    @Test
    public void verifyLogin()  {


        page = new LoginPage ( );
         page.login (prop.getProperty ("username"), prop.getProperty ("password"));
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds (10));
        wait.until (ExpectedConditions.titleIs ("My account - My Store"));
        Assert.assertEquals (driver.getTitle ( ), "My account - My Store");


    }


    @Test
    public void abc() {
        page = new LoginPage ( );
        page.login (prop.getProperty ("username"), prop.getProperty ("password"));
        Assert.assertEquals ("a","b");
    }

    @Test
    public void skipThisTest()
    {
        page = new LoginPage ( );
        page.login (prop.getProperty ("username"), prop.getProperty ("password"));
        throw new SkipException("This test is being ignored");
    }




    @AfterTest

    public void closeBrowser() {

        driver.quit();
    }


}
