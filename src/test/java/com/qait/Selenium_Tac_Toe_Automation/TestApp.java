package com.qait.Selenium_Tac_Toe_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestApp{
    WebDriver driver;
    FirstPage fp;
    SecondPage sp;
    ThirdPage tp;
    FourthPage fp1;
    FifthPage fp2;
    SixthPage sp1;
    SeventhPage sp2;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.get("http://10.0.1.86/");
    }

    @Test(priority = 0)
    public void firstPageVeriy(){
        fp = new FirstPage(driver);
        fp.btnClick();
        Assert.assertEquals(driver.getTitle(), "Welcome - T.A.T.O.C");
    }

    @Test(priority = 1)
    public void secondPage(){
        sp = new SecondPage(driver);
        sp.btnClick();
        Assert.assertEquals(driver.getTitle(), "Grid Gate - Basic Course - T.A.T.O.C");
    }

    @Test(priority = 2)
    public void thirdPage(){
        tp = new ThirdPage(driver);
        tp.btnClick();
        Assert.assertEquals(driver.getTitle(), "Frame Dungeon - Basic Course - T.A.T.O.C");
    }

    @Test(priority = 3)
    public void fourthPage(){
        fp1 = new FourthPage(driver);
        fp1.btnClick();
        Assert.assertEquals(driver.getTitle(), "Drag - Basic Course - T.A.T.O.C");
    }

    @Test(priority = 4)
    public void fifthPage(){
        fp2 = new FifthPage(driver);
        fp2.drag();
        fp2.btnClick();
        Assert.assertEquals(driver.getTitle(), "Windows - Basic Course - T.A.T.O.C");
    }

    @Test(priority = 5)
    public void sixthPage(){
        sp1 = new SixthPage(driver);
        sp1.btnClick();
        Assert.assertEquals(driver.getTitle(), "Cookie Handling - Basic Course - T.A.T.O.C");
    }

    @Test(priority = 6)
    public void seventhPage(){
        sp2 = new SeventhPage(driver);
        sp2.generateCookie();
        sp2.btnClick();
        Assert.assertEquals(driver.getTitle(), "End - T.A.T.O.C");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}