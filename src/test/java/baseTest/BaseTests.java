package baseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.CheckboxPage;
import pages.DropdownPage;
import pages.FormAuthPackage.FormAuthenticationPage;
import pages.HeroKuAppMain;
import pages.dynamicLoading.DynamicLoadingPage;
import pages.dynamicLoading.ExampleOne;
import pages.dynamicLoading.ExampleTwo;

import java.time.Duration;

public class BaseTests {
    protected WebDriver driver;
    protected HeroKuAppMain heroKuAppMain;
    protected FormAuthenticationPage formAuthenticationPage;
    protected CheckboxPage checkboxPage;
    protected DropdownPage dropdownPage;
    protected DynamicLoadingPage dynamicLoadingPage;
    protected ExampleOne exampleOne;
    protected ExampleTwo exampleTwo;

    @BeforeClass
    public void sstUp(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        heroKuAppMain = new HeroKuAppMain(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
