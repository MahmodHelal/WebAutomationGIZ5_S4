package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.FormAuthPackage.FormAuthenticationPage;

public class HeroKuAppMain {
    private WebDriver driver;

    public HeroKuAppMain(WebDriver driver){
        this.driver = driver;
    }

    public FormAuthenticationPage gotToFormAuthenticationPage(){
        WebElement formAuthLink = driver.findElement(By.linkText("Form Authentication"));
        formAuthLink.click();
        return new FormAuthenticationPage(driver);
    }

}
