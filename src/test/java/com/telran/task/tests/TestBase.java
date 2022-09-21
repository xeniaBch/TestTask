package com.telran.task.tests;

import Framework.ApplicationManager;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeMethod
    public void setUp(){
        app.init();
    }



    @AfterMethod (enabled = true)
    public void tearDown(){
        app.stop();
    }




}
