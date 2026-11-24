package pages.dynamicLoading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExampleTwo {
    WebDriver driver;
    By titleOfPage = By.cssSelector(".example > h4");
    String expectedTitleOfPage = "Example 2: Element rendered after the fact";
    By startButton = By.cssSelector("#start > button");
    By finishText = By.cssSelector("#finish > h4");
    String expectedFinishText = "Hello World!";
    WebDriverWait wait ;

    public ExampleTwo(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public String getActualTitleOfPage(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(titleOfPage)).getText();
//        return driver.findElement(titleOfPage).getText();
    }

    public String getExpectedTitleOfPage(){
        return expectedTitleOfPage;
    }

    public void clickOnStartButton(){
    wait.until(ExpectedConditions.elementToBeClickable(startButton)).click();
//        driver.findElement(startButton).click();
    }

    public String getActualFinishText(){
      return   wait.until(ExpectedConditions.presenceOfElementLocated(finishText)).getText();
//        return driver.findElement(finishText).getText();
    }

    public String getExpectedFinishText(){
        return expectedFinishText;
    }



}
