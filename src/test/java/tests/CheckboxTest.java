package tests;

import baseTest.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckboxTest extends BaseTests {
    @Test
    public void verifyDefaultStateOfCheckboxes(){
           checkboxPage = heroKuAppMain.goToCheckboxPage();
        Assert.assertFalse(checkboxPage.getCheckboxByNumber(1).isSelected());
        Assert.assertTrue(checkboxPage.getCheckboxByNumber(2).isSelected());
    }
}
