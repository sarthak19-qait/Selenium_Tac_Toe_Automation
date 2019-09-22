package com.qait.Selenium_Tac_Toe_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeventhPage{
    WebDriver driver;
    By link = By.linkText("Generate Token");
    By proceed = By.linkText("Proceed");

    public SeventhPage(WebDriver driver){
        this.driver = driver;
    }

    public void generateCookie(){
        driver.findElement(link).click();
        WebElement token = driver.findElement(By.id("token"));
        String token1 = token.getText();
        String token2 = token1.substring(7, token1.length());
        Cookie ck = new Cookie("Token", token2);
        driver.manage().addCookie(ck);
    }
    public void btnClick(){
        driver.findElement(proceed).click();
    }

}