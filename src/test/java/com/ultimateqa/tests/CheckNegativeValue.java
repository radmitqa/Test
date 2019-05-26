/**
 * CheckNegativeValue.java file
 * Perform test for validating error message
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

public class CheckNegativeValue {
    System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
    WebDriver driver;

    @Before
    public void setup(){
        //using FF Driver
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void applyData(){
        //Create object of FillingOutForms Class
        FillingOutForms home = new FillingOutForms(driver);
        home.setNameRight()

        //Check if page is opened
        Assert.assertTrue(home.isPageOpened());

        //Fill in data

        //Fill in test name
        home.setNameRight("Test Name");
        //Fill in test message
        home.setMessageRight("Test Message");
        //Get values from clearfix
        WebElement old_variable = driver.findElement(By.xpath("\"//*[@id=\\\"et_pb_contact_form_1\\\"]/div[2]/form/div/div/p/span\"")).getText()
        System.out.println("Start value is: " + old_variable);
        //Fill in -1
        home.setInput("-1");
        //Press Submit button
        home.clickSubmit();
        WebElement new_variable = driver.findElement(By.xpath("\"//*[@id=\\\"et_pb_contact_form_1\\\"]/div[2]/form/div/div/p/span\"")).getText()
        System.out.println("Start value is: " + new_variable);

        public void CompareValues(new_variable,old_variable);
        if (old_variable == new_variable)
            System.out.println("Test Fail" + old_variable + "matches with" + new_variable);
        else{
            System.out.println("Test Pass - Numbers are changed!");
        }
    }

    @After
    public void close(){

        driver.close();
    }
}

/*
* End of file
*/