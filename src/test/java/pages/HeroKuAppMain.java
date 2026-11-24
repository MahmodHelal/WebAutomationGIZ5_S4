package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.FormAuthPackage.FormAuthenticationPage;
import pages.dynamicLoading.DynamicLoadingPage;

public class HeroKuAppMain {
    private WebDriver driver;

    public HeroKuAppMain(WebDriver driver){
        this.driver = driver;
    }

    public FormAuthenticationPage gotToFormAuthenticationPage(){
//        WebElement formAuthLink = driver.findElement(By.linkText("Form Authentication"));
//        formAuthLink.click();
        clickOn(By.linkText("Form Authentication"));
        return new FormAuthenticationPage(driver);
    }

    public CheckboxPage goToCheckboxPage(){
//        WebElement checkboxLink = driver.findElement(By.linkText("Checkboxes"));
//        checkboxLink.click();
        clickOn(By.linkText("Checkboxes"));
        return new CheckboxPage(driver);

    }


    public DropdownPage goToDropdownPage(){
        clickOn(By.linkText("Dropdown"));
        return new DropdownPage(driver);
    }

    public DynamicLoadingPage goToDynamicLoadingPage(){
        clickOn(By.linkText("Dynamic Loading"));
        return new DynamicLoadingPage(driver);
    }

    private void  clickOn(By locator){
        WebElement element = driver.findElement(locator);
        element.click();
    }

}
