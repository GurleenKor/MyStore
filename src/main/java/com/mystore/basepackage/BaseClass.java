package com.mystore.basepackage;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.mystore.actiondriver.ActionDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
    public static Properties prop;
    public static WebDriver driver;

    @BeforeTest
    public void loadConfig() {
        try {
            prop = new Properties ( );

            System.out.println ("super constructor invoked");
            try {
                FileInputStream fi = new FileInputStream ("Configuration/Configuration.properties");
                prop.load (fi);
            } catch (FileNotFoundException e) {
                System.out.println ("super constructor invoked");
                e.printStackTrace ( );
            }

            System.out.println ("driver:  " + driver);

        } catch (FileNotFoundException e) {

            e.printStackTrace ( );
        } catch (IOException i) {
            i.printStackTrace ( );
        }
    }

    public static void launchApp() {

        String browserName = prop.getProperty ("browser");

        if (browserName.contains ("Chrome")) {
            WebDriverManager.chromedriver ( ).setup ( );

            driver = new ChromeDriver ( );

        } else if (browserName.contains ("Safari")) {

            driver = new SafariDriver ( );
        } else if (browserName.contains ("IE")) {
            driver = new FirefoxDriver ( );
        }

        ActionDriver.implicitWait (driver, 10);
        ActionDriver.pageLoadTimeOut (driver, 30);
        driver.get (prop.getProperty ("url"));

        driver.manage ( ).window ( ).maximize ( );
        System.out.println ("reached");

    }


}
















