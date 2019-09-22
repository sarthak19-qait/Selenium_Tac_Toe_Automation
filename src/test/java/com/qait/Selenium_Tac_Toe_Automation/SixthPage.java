package com.qait.Selenium_Tac_Toe_Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SixthPage{
    WebDriver driver;
    By launch = By.linkText("Launch Popup Window");
    By textBox = By.id("name");
    By submit = By.id("submit");
    By proceed = By.linkText("Proceed");

    public SixthPage(WebDriver driver){
        this.driver = driver;
    }

    public void btnClick(){

        driver.findElement(launch).click();
        String mainWindow = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        while(i1.hasNext()){
            String childWindow = i1.next();
            if(!mainWindow.equalsIgnoreCase(childWindow)){
                driver.switchTo().window(childWindow);
                WebElement name = driver.findElement(textBox);
                name.click();
                name.sendKeys("ABCD");
                driver.findElement(submit).click();
                driver.switchTo().window(mainWindow);
                driver.findElement(proceed).click();
            }
        }
    }
}