import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class FirstAndroidTest{

    AppiumDriver driver;

    @BeforeTest
    public void initializer() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","8.1");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("app",System.getProperty("user/dir")+"/Downloads/Bookingmore_v33.3_apkpure.com.apk");
        driver = new AndroidDriver(new URL("http:/localhost:4723/wd/hub"), capabilities);
        System.out.println(("Opening Appium Server"));
    }

    @Test
    public void clickAppButton() {
      //  driver.findElement(By.xpath("/android.widget.TextView[@content-desc='App']")).click();

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.Button[2]")).click();

    }

    @AfterTest
    public void  tearDown(){
        if(null !=driver){
            driver.quit();
        }
    }
}
