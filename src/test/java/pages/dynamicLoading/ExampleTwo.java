package pages.dynamicLoading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExampleTwo {
    WebDriver driver;
    By titleOfPage = By.cssSelector(".example > h4");
    String expectedTitleOfPage = "Example 2: Element rendered after the fact";
    By startButton = By.cssSelector("#start > button");
    By finishText = By.cssSelector("#finish > h4");
    String expectedFinishText = "Hello World!";

    public ExampleTwo(WebDriver driver) {
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
