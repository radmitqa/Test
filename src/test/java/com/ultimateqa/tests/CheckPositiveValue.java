/**
 * CheckNegativeValue.java file
 * Perform test for validating success message
 * Author  Radovan Mitrovic
 * Version 1.0
 * Date 2019-May-24
 */

package com.ultimateqa.tests;

import com.ultimateqa.webpages.FillingOutForms;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Text;

import java.awt.*;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.xpath;


public class CheckPositiveValue {
    System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
    WebDriver driver;

    @Before
    public void setup(){
        //using FF Driver
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void applyData() {
        //Create object of FillingOutForms Class
        FillingOutForms home = new FillingOutForms(driver);
        home.setNameRight()

        //Check if page is opened
        Assert.assertTrue(home.isPageOpened());

        //Filling in data

        //Fill in test name
        home.setNameRight("Test Name");
        //Fill in test message
        home.setMessageRight("Test Message");
        //Fill in sum
        home.setInput(Integer.sum);
        //Press Submit button
        home.clickSubmit();

        //Check is Success message displayed
        Assert.assertTrue(home.isMessageDisplayed());
    }
    @After
    public void close(){
        driver.close();
    }
}
/*
* End of file
*/