package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Main {
    public static void main(String[] args)  {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.partialLinkText("Example 1:")).click();
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        String actualFinishText =driver.findElement(By.cssSelector("#finish > h4")).getText();
        Assert.assertTrue(actualFinishText.contains("Hello World!"));
        driver.quit();
    }
}