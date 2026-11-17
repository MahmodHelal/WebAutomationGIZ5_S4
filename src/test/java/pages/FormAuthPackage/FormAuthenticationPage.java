package pages.FormAuthPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormAuthenticationPage {
    private WebDriver driver;

    public FormAuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public  void  enterUserName(String userNameValue){
        WebElement userName = driver.findElement(By.id("username"));

        userName.sendKeys(userNameValue);
    }
    public  void  enterPassword(String passwordValue) {
        WebElement password = driver.findElement(By.id("password"));

        password.sendKeys(passwordValue);
    }

    public void  clickLoginButton(){
        WebElement loginButton = driver.findElement(By.className("radius"));

        loginButton.click();
    }

    public void loginBy(String userNameValue, String passwordValue){
        enterUserName(userNameValue);
        enterPassword(passwordValue);
        clickLoginButton();
    }



}
