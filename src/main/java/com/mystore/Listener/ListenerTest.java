package com.mystore.Listener;
import com.mystore.basepackage.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestContext;
import  org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ListenerTest extends BaseClass implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
      System.out.println ( "Started" );

        ITestListener.super.onStart (context);
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println ( "Finished" );
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure (result);
       TakesScreenshot sc = (TakesScreenshot)driver;
        File Destfile = new File ("/Users/saby/IdeaProjects/My Store/Screenshots/dest.jpg");
      File output = sc.getScreenshotAs (OutputType.FILE);



        try {
            FileUtils.copyFile (output,Destfile);
        } catch (IOException e) {
            e.printStackTrace ( );
        }


        System.out.println ( "Failed" );



    }


    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess (result);

        System.out.println ( "Suceess" );
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped (result);

        System.out.println ( "Test Ignored" );
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage (result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout (result);
    }
}


