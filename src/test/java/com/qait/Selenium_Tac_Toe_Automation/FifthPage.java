package com.qait.Selenium_Tac_Toe_Automation;

/*
 * Helllo How are you.....
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FifthPage{
    WebDriver driver;
    By fromSide = By.id("dragbox");
    By toSide = By.id("dropbox");
    By link = By.linkText("Proceed");

    public FifthPage(WebDriver driver){
        this.driver = driver;
    }

    public void drag(){
        WebElement from = driver.findElement(fromSide);	
        WebElement to = driver.findElement(toSide);
        Actions act = new Actions(driver);
        act.dragAndDrop(from, to).build().perform();
    }

    public void btnClick(){
        driver.findElement(link).click();
    }
}