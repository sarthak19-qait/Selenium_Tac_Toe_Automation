package com.qait.Selenium_Tac_Toe_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FourthPage{
    WebDriver driver;
    By box1 = By.xpath("//*[@id='answer']");
    By box2 = By.xpath("//*[@id='answer']");
    By link = By.xpath("/html/body/center/a[1]");
    By box3 = By.xpath("//*[@id='answer']");
    By proceed = By.linkText("Proceed");

    public FourthPage(WebDriver driver){
        this.driver = driver;
    }

    public void btnClick(){
        driver.switchTo().frame("main");
        String colorOne = driver.findElement(box1).getAttribute("class");
        System.out.println(colorOne);

        driver.switchTo().frame("child");
        String colorTwo = driver.findElement(box2).getAttribute("class");
        System.out.println(colorTwo);

        driver.switchTo().parentFrame();
        driver.findElement(link).click();

        driver.switchTo().frame("child");
        String colorThree = driver.findElement(box3).getAttribute("class");
        System.out.println(colorThree);

        while(!colorOne.equalsIgnoreCase(colorThree))
        {
            driver.switchTo().parentFrame();
            driver.findElement(link).click();
    
            driver.switchTo().frame("child");
            colorThree = driver.findElement(box3).getAttribute("class");
            
        }
        driver.switchTo().parentFrame();
        driver.findElement(proceed).click();
       
    //         
    }
}