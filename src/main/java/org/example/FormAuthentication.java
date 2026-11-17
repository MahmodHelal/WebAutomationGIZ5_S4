package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FormAuthentication {
    WebDriver driver;
    @BeforeClass
    public void setup(){
         driver = new EdgeDriver();
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void gotLoginPage(){
        driver.get("https://the-internet.herokuapp.com/");
        WebElement formAuthenticationLink = driver.findElement(By.linkText("Form Authentication"));
        formAuthenticationLink.click();
    }
    @Test(priority = 0)
    public  void validLogin(){
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("tomsmith");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");
        WebElement loginButton = driver.findElement(By.className("radius"));
        loginButton.click();
        String expectedSuccessMsg ="You logged into a secure area!";
        String actualMessage = driver.findElement(By.id("flash")).getText();
        Assert.assertTrue(actualMessage.contains(expectedSuccessMsg));
    }
    @Test(priority = 1)
    public  void invalidUserName(){
        WebElement userName1 = driver.findElement(By.id("username"));
        userName1.sendKeys("wrong value");
        WebElement password1 = driver.findElement(By.id("password"));
        password1.sendKeys("SuperSecretPassword!");
        WebElement loginButton1 = driver.findElement(By.className("radius"));
        loginButton1.click();
        String expectedMsg1 ="Your username is invalid!";
        String actualMessage1 = driver.findElement(By.id("flash")).getText();
        Assert.assertTrue(actualMessage1.contains(expectedMsg1));
    }
    @Test(priority = 2)
    public void invalidPassword(){
        WebElement userName2 = driver.findElement(By.id("username"));
        userName2.sendKeys("tomsmith");
        WebElement password2 = driver.findElement(By.id("password"));
        password2.sendKeys("WrongValue!");
        WebElement loginButton2 = driver.findElement(By.className("radius"));
        loginButton2.click();
        String expectedMsg2 ="Your password is invalid!";
        String actualMessage2 = driver.findElement(By.id("flash")).getText();
        Assert.assertTrue(actualMessage2.contains(expectedMsg2));
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
