package tests;

import baseTest.BaseTests;
import org.testng.annotations.Test;
import pages.FormAuthPackage.FormAuthenticationPage;
import pages.HeroKuAppMain;

public class FormAuthTest extends BaseTests {
    @Test
    public void validLogin(){
        formAuthenticationPage = heroKuAppMain.gotToFormAuthenticationPage();
        formAuthenticationPage.enterUserName("tomsmith");
        formAuthenticationPage.enterPassword("SuperSecretPassword!");
        formAuthenticationPage.clickLoginButton();
    }

    @Test
    public void invalidUserName(){
        // go to heroKuapp main page
        // go to form authentication page
        // enter invalid username and valid password
        // click login button
    }

    @Test
    public void invalidPassword(){
        // go to heroKuapp main page
        // go to form authentication page
        // enter valid username and invalid password
        // click login button
    }
}
