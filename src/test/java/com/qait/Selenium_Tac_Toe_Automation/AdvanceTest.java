// package com.qait;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.interactions.Actions;
// import org.testng.annotations.AfterClass;
// import org.testng.annotations.BeforeClass;
// import org.testng.annotations.Test;

// public class AdvanceTest{
//     WebDriver driver;

//     @BeforeClass
//     public void setup(){
//         driver = new ChromeDriver();
//     }

//     @Test
//     public void test(){
//         driver.get("http://10.0.1.86/");
//         driver.findElement(By.xpath("/html/body/div/ul/li[5]/ul/li[2]/a")).click();
//         driver.findElement(By.linkText("Advanced Course")).click();
//         WebElement menu2 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]"));
//         Actions action = new Actions(driver);
//         action.moveToElement(menu2).build().perform();
//         driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/span[5]")).click();;

//     }

//     @AfterClass
//     public void tearDown(){

//     }
// }