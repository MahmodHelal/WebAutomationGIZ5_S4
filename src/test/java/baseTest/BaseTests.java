package baseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.FormAuthPackage.FormAuthenticationPage;
import pages.HeroKuAppMain;

public class BaseTests {
    protected WebDriver driver;
    protected HeroKuAppMain heroKuAppMain;
    protected FormAuthenticationPage formAuthenticationPage;

    @BeforeClass
    public void sstUp(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        heroKuAppMain = new HeroKuAppMain(driver);
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
