package pages.dynamicLoading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExampleOne {
    WebDriver driver;
    By titleOfPage = By.cssSelector(".example > h4");
    String expectedTitleOfPage = "Example 1: Element on page that is hidden";
    By startButton = By.cssSelector("#start > button");
    By finishText = By.cssSelector("#finish > h4");
    String expectedFinishText = "Hello World!";
    WebDriverWait wait ;

    public ExampleOne(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public String getActualTitleOfPage(){
        WebElement title =  driver.findElement(titleOfPage);
        return wait.until(ExpectedConditions.visibilityOf(title)).getText();
//        return driver.findElement(titleOfPage).getText();
    }

    public String getExpectedTitleOfPage(){
        return expectedTitleOfPage;
    }

    public void clickOnStartButton(){
//       WebElement element =  wait.until(ExpectedConditions.elementToBeClickable(startButton));
//       element.click();
        driver.findElement(startButton).click();
    }

    public String getActualFinishText(){
        return   wait.until(ExpectedConditions.visibilityOfElementLocated(finishText)).getText();
//        return driver.findElement(finishText).getText();
    }

    public String getExpectedFinishText(){
        return expectedFinishText;
    }



}
