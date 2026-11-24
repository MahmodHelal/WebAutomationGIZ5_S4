package tests.DynamicLoading;

import baseTest.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleTwoTest extends BaseTests {
    @Test 
    public void validateExampleTwo(){
        dynamicLoadingPage = heroKuAppMain.goToDynamicLoadingPage();
        Assert.assertEquals(dynamicLoadingPage.getActualTitleOfPage(), dynamicLoadingPage.getExpectedTitleOfPage());
        exampleTwo = dynamicLoadingPage.clickOnExampleTwoLink();
        Assert.assertEquals(exampleTwo.getActualTitleOfPage(), exampleTwo.getExpectedTitleOfPage());
        exampleTwo.clickOnStartButton();
        Assert.assertEquals(exampleTwo.getActualFinishText(), exampleTwo.getExpectedFinishText());   
    }
}
