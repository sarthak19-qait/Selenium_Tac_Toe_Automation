package com.qait.Selenium_Tac_Toe_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstPage{
    WebDriver driver;
    By tatocBtn = By.xpath("/html/body/div/ul/li[5]/ul/li[2]/a");

    public FirstPage(WebDriver driver){
        this.driver = driver;
    }

    public void btnClick(){
        driver.findElement(tatocBtn).click();
    }
}

