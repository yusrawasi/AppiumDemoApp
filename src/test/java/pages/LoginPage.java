package pages;

import base.AppDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Helper;

import java.time.Duration;


public class LoginPage {
    int emailLength = 10;

    private final Helper hc;

    public LoginPage() {
        PageFactory.initElements(AppDriver.getDriver(), this);
      //  PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
        hc = new Helper();
    }

    /*
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.Button")
    public WebElement createAccountButton;

    @FindBy(id = "com.booking:id/identity_header_title")
    public WebElement pageHeader;

    @FindBy(id = "com.booking:id/identity_text_input_edit_text")
    public WebElement emailAddress;

    @FindBy(id = "com.booking:id/identity_landing_social_button_text")
    public WebElement continueButton;

    @FindBy(id = "com.booking:id/identity_header_title")
    public WebElement createPasswordHeader;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    public WebElement password;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    public WebElement confirmPassword;

    @FindBy(id = "com.booking:id/identity_landing_social_button_text")
    public WebElement signInButton;

     */

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View")
    public WebElement balancePage;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
    public WebElement loginButton;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
    public WebElement okStartButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText")
    public WebElement enterEmail;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText")
    public  WebElement enterPassword;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[4]")
    public WebElement logoutButton;
    /*
    By by_createAccountButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.Button");
    By by_pageHeader = By.id("com.booking:id/identity_header_title");
    By by_confirmPasswordField = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");

     */
    //By by_OKStartApp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button");

    By by_enterEmail = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText");

    By by_enterPassword = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText");

   public void clickStartApp(){
        okStartButton.click();
    }
    public void enterEmailAddress() {
        new WebDriverWait(AppDriver.getDriver(), Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(by_enterEmail));
        enterEmail.sendKeys("company");
    }
    public void enterEmailAddressData(String validEmail) {
        new WebDriverWait(AppDriver.getDriver(), Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(by_enterEmail));
        //enterEmail.sendKeys(hc.getAlphaNumericString(emailLength) + validEmail);
        enterEmail.sendKeys(validEmail);
    }

    public void enterPassword(){
        new WebDriverWait(AppDriver.getDriver(), Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(by_enterPassword));
        enterPassword.sendKeys("company");

    }
    public void enterPasswordData(String userPassword) {
        new WebDriverWait(AppDriver.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(by_enterPassword));
        enterPassword.sendKeys(userPassword);
    }

    public void loginUser(){
        loginButton.click();
    }
    public void logoutUser(){
        logoutButton.click();
    }


    /*
    public void clickCreateAccountButton() {
        new WebDriverWait(AppDriver.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(by_createAccountButton));
        createAccountButton.click();
    }

//    public void enterValidEmailAddress() {
//        new WebDriverWait(AppDriver.getDriver(), Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(by_pageHeader));
//        emailAddress.sendKeys("appiumDemoTest015@mailinator.com");
//    }

    public void clickContinueButton() {
        continueButton.click();
    }

//    public void enterValidPassword() {
//        new WebDriverWait(AppDriver.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(by_confirmPasswordField));
//        password.sendKeys("Thunder27$");
//    }

//    public void enterConfirmPassword() {
//        confirmPassword.sendKeys("Thunder27$");
//    }



    public void enterValidEmailAddress(String validEmail) {
        new WebDriverWait(AppDriver.getDriver(), Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(by_pageHeader));
        emailAddress.sendKeys(hc.getAlphaNumericString(emailLength) + validEmail);
    }

    public void enterPassword(String userPassword) {
        new WebDriverWait(AppDriver.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(by_confirmPasswordField));
        password.sendKeys(userPassword);
    }

    public void enterConfirmPassword(String userConfirmPassword) {
        confirmPassword.sendKeys(userConfirmPassword);
    }
    public void clickSignInButton() {
        signInButton.click();
    }
    */

}