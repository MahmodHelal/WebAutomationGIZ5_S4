package tests;

import baseTest.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTests {


    @Test
    public void validateDropdown() throws InterruptedException {
        dropdownPage = heroKuAppMain.goToDropdownPage();
        dropdownPage.selectOptionByText("Option 2");
        Thread.sleep(2000);
        Assert.assertEquals(dropdownPage.getOptionSelected(), "Option 2");
    }
}
