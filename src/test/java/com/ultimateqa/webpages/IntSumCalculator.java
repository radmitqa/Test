/**
 * IntSumCalculator.java file
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

import static org.openqa.selenium.By.xpath;

public class IntSumCalculator {
    WebDriver driver;
    public void main(String[] args) {
        //Get values from clearfix element
        int list_value_one = driver.findElements(xpath("\"//*[@id=\\\"et_pb_contact_form_1\\\"]/div[2]/form/div/div/p/span\"")).get([0])
        int list_value_two = driver.findElements(xpath("\"//*[@id=\\\"et_pb_contact_form_1\\\"]/div[2]/form/div/div/p/span\"")).get([1])
        //System.out.println("Numbers are: " + list_values);
        int a = list_value_one;
        int b = list_value_two;
        // It will return sum of a and b.
        System.out.println("The sum of a and b is = " + Integer.sum(a, b));

    }
}
/*
* End of file
*/