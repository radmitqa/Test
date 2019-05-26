/**
 * HomePage.java file
 * Navigate to HomePage of test
 * https://www.ultimateqa.com/filling-out-forms/ page
 * Locate page elements, define steps
 * Author  Radovan Mitrovic
 * Version 1.0
 * Date 2019-May-24
 */

package com.ultimateqa.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FillingOutForms {
    System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
    private WebDriver driver;

    //Page URL
    private static String PAGE_URL = "https://www.ultimateqa.com/filling-out-forms/";


    //Locators

    //Find Name control on form right
    @FindBy(id = "et_pb_contact_name_1")
    WebElement name_right;
    //Find Message control on form right
    @FindBy(id = "et_pb_contact_message_1")
    WebElement message_right;
    //Find Input control on form right
    @FindBy(xpath = "//*[@id=\"et_pb_contact_form_1\"]/div[2]/form/div/div/p/input")
    WebElement input_right;
    //Find Submit button control on form right
    @FindBy(xpath = "//*[@id=\"et_pb_contact_form_1\"]/div[2]/form/div/button")
    WebElement submit_right;
    //Find page title
    @FindBy(xpath = "/html/head/title")
    private WebElement heading;
    @FindBy(xpath = "//*[@id=\"et_pb_contact_form_1\"]/div/p")
    private WebElement message;

    //Constructor
    public FillingOutForms(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        try {
            driver.manage().window().wait(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Initialise Elements
        PageFactory.initElements(driver, this);
        }

    //Boolean for assertion to check if page is opened
    public boolean isPageOpened(){

        return heading.getText().toString().contains("Filling Out Forms - Ultimate QA");
    }
        //Enter name step
        public void setNameRight(String name_right){
            name_right.clear();
            name_right.sendKeys(name_right);
        }
        //Enter message step
        public void setMessageRight (String message_right){
            message_right.clear();
            message_right.sendKeys(message_right);
        }
        //Enter invalid value -1 step
        public void setInput (String input){
            input.clear();
            input.sendKeys(input_right);
        }
        //Click Submit button step
        public void clickSubmit () {
            submit.click();
        }

    //Boolean for assertion is Success message displayed for Check positive value class
    public boolean isMessageDisplayed(){
        //Assertion
        WebElement message = home.find;
        boolean success = message.getText().toString().contains("Success");
        return success;
    }
}

/*
* End of file
*/
