package tests.DynamicLoading;

import baseTest.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleOneTest extends BaseTests {
    @Test
    public  void validateExampleOne(){
        dynamicLoadingPage = heroKuAppMain.goToDynamicLoadingPage();
        Assert.assertEquals(dynamicLoadingPage.getActualTitleOfPage(), dynamicLoadingPage.getExpectedTitleOfPage());
        exampleOne = dynamicLoadingPage.clickOnExampleOneLink();
        Assert.assertEquals(exampleOne.getActualTitleOfPage(), exampleOne.getExpectedTitleOfPage());
        exampleOne.clickOnStartButton();
        Assert.assertEquals(exampleOne.getActualFinishText(), exampleOne.getExpectedFinishText());
    }
}
// implicitWait just wait for any findElement method used with driver -> wait until element to be visible in DOM;
// explicitWait wait for specific condition to be met;