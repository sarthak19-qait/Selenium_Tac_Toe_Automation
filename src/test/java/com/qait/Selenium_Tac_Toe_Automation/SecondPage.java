package com.qait.Selenium_Tac_Toe_Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondPage{
    WebDriver driver;
    By basicCourseBtn = By.xpath("/html/body/div/div[2]/a[1]");

    public SecondPage(WebDriver driver){
        this.driver = driver;
    }

    public void btnClick(){
        driver.findElement(basicCourseBtn).click();
    }
}