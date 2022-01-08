package com.mystore.testscripts;

import com.mystore.basepackage.BaseClass;
import com.mystore.pageobjects.IndexPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IndexPageTest extends BaseClass {
    IndexPage page = new IndexPage();

    @BeforeMethod
    public void setUp() {
        launchApp();

    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }

    @Test
    public void verifyStoreLogo() {

     boolean flag = page.validateLogo();
       Assert.assertTrue(flag);
    }

    @Test
    public void verifyTitle() {
        String title = page.getMyStoreTitle();
        Assert.assertEquals(title, driver.getTitle());

    }

}
