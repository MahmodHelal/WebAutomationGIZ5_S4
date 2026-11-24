package pages.dynamicLoading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    WebDriver driver;
    By titleOfPage = By.tagName("h3");
    String expectedTitleOfPage = "Dynamically Loaded Page Elements";
    By exampleOneLink = By.partialLinkText("Example 1:");
    By getExampleTwoLink = By.partialLinkText("Example 2:");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }


    public String getActualTitleOfPage(){
        return driver.findElement(titleOfPage).getText();
    }

    public String getExpectedTitleOfPage(){
        return expectedTitleOfPage;
    }

    public ExampleOne clickOnExampleOneLink(){
        driver.findElement(exampleOneLink).click();
        return  new ExampleOne(driver);
    }

    public ExampleTwo clickOnExampleTwoLink(){
        driver.findElement(getExampleTwoLink).click();
        return new ExampleTwo(driver);
    }
}
