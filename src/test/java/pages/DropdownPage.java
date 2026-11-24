package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    WebDriver driver;
    By dorpdownBy = By.id("dropdown");
    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public  void selectOptionByText(String text){
        WebElement dropdownElement = driver.findElement(dorpdownBy);
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(text);

    }


    public  String getOptionSelected(){
        WebElement dropdownElement = driver.findElement(dorpdownBy);
        Select select = new Select(dropdownElement);
        return select.getFirstSelectedOption().getText();

    }


}
