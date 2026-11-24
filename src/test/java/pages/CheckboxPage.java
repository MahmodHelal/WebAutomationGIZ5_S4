package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxPage {
    WebDriver driver;

    By firstCheckbox = By.xpath("//input[@type=\"checkbox\"][1]");
    By secondCheckbox = By.xpath("//input[@type=\"checkbox\"][2]");

    By allCheckboxes = By.cssSelector("input[type='checkbox']");
    public CheckboxPage(WebDriver driver) {
        this.driver = driver;
    }



    public void checkFirst(){
        WebElement checkbox = driver.findElement(firstCheckbox);
        checkbox.click();
    }

    public void  checkSecond(){
        driver.findElement(secondCheckbox).click();
    }

    public List<WebElement> getAllCheckboxes(){
         return  driver.findElements(allCheckboxes);
    }


    public WebElement getCheckboxByNumber(int number){
        if (number > 2){
            throw new IllegalArgumentException("متعملش كدا تاني");
        }
                 return getAllCheckboxes().get(number - 1);

    }


}
