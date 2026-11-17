package pages.FormAuthPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecureAreaPage {
    private WebDriver driver;

    WebElement logoutButton = driver.findElement(By.cssSelector("a.button.secondary.radius"));
    WebElement successMessage = driver.findElement(By.id("flash"));
    String expectedSuccessMsg ="You logged into a secure area!";



    public void clickLogoutButton(){
        logoutButton.click();
    }


    public String getExpectedSuccessMsg(){
        return expectedSuccessMsg;
    }

    public String getActualSuccessMsg(){
        return successMessage.getText();
    }










}
