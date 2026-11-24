package pages.dynamicLoading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExampleOne {
    WebDriver driver;
    By titleOfPage = By.cssSelector(".example > h4");
    String expectedTitleOfPage = "Example 1: Element on page that is hidden";
    By startButton = By.cssSelector("#start > button");
    By finishText = By.cssSelector("#finish > h4");
    String expectedFinishText = "Hello World!";

    public ExampleOne(WebDriver driver) {
        this.driver = driver;
    }

    public String getActualTitleOfPage(){
        return driver.findElement(titleOfPage).getText();
    }

    public String getExpectedTitleOfPage(){
        return expectedTitleOfPage;
    }

    public void clickOnStartButton(){
        driver.findElement(startButton).click();
    }

    public String getActualFinishText(){
        return driver.findElement(finishText).getText();
    }

    public String getExpectedFinishText(){
        return expectedFinishText;
    }



}
