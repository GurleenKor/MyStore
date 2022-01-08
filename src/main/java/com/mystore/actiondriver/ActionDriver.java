package com.mystore.actiondriver;

import com.mystore.basepackage.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class ActionDriver extends BaseClass {
    public static void scrollByVisibilityOfElement(WebDriver driver, WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("argument[0].scrollIntoView();", element);
    }

    public static void click(WebDriver driver, WebElement element) {
        Actions act = new Actions(driver);
        act.moveToElement(element).click().build().perform();


    }

    public static void implicitWait(WebDriver driver, int duration) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));


    }

    public static void pageLoadTimeOut(WebDriver driver, int duration) {

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(duration));
    }

    public static boolean isImageDisplayed(WebDriver driver, WebElement element) {

        Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", element);


        return ImagePresent;

    }

    public static boolean JSClick(WebDriver driver, WebElement element) throws Throwable {
        boolean flag = false;

        try {

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
            flag = true;


        } catch (Exception e) {
            throw e;
        } finally {

            if (flag) {
                System.out.println("Click Action performed");
            }

        }
        return flag;
    }


}
