package testCases;

import base.AppFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.net.MalformedURLException;

public class LoginTest {

    private LoginPage loginPage;

    @BeforeTest
    public void setup() throws MalformedURLException {
        AppFactory.initializer();
        loginPage = new LoginPage();
    }

    @Test
    public void verifyUserCreation() throws InterruptedException {

        loginPage.clickStartApp();
        System.out.println("OK done");
        Thread.sleep(3000);
        loginPage.enterEmailAddress();
        loginPage.enterPassword();
        Thread.sleep(1000);
        loginPage.loginUser();
        System.out.println("Logged In");
        Thread.sleep(3000);
        Assert.assertTrue((loginPage.balancePage.isDisplayed()));





       /*
       loginPage.clickCreateAccountButton();
        Assert.assertTrue(loginPage.pageHeader.isDisplayed());
        System.out.println("Email Address Page is Displayed");
        loginPage.enterValidEmailAddress();
        loginPage.clickContinueButton();
        Thread.sleep(3000);
        Assert.assertTrue((loginPage.createPasswordHeader.isDisplayed()));
        System.out.println("Password Page is Displayed");
        loginPage.enterPassword();
        loginPage.enterConfirmPassword();
        loginPage.clickSignInButton();
        System.out.println("Creating New User Account");
        Thread.sleep(1000);
        */

    }

    @Test
    public void verifyValidLogin()throws InterruptedException {

        // Your Code here
    }

    @Test
    public void Logout()throws  InterruptedException{
        System.out.println("Balance displayed");
        loginPage.logoutUser();
        Assert.assertTrue((loginPage.loginButton.isDisplayed()));
        System.out.println("Logged out");
    }

    @AfterTest
    public void tearDown() {
        AppFactory.quitDriver();
    }
}