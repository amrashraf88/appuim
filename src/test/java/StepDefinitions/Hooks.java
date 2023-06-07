package StepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {


    public class SampleTest {

        public AndroidDriver driver;

        @Before
        public void setUp() throws MalformedURLException, InterruptedException {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("appium:deviceName", "sdk_gphone64_x86_64");
            desiredCapabilities.setCapability("platformName", "Android");
            desiredCapabilities.setCapability("appium:app", "/home/amr/Downloads/app-dokan-release.apk");
            desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
            desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
            desiredCapabilities.setCapability("appium:newCommandTimeout", 6600);
            desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

            URL remoteUrl = new URL("http://0.0.0.0:4723/wd/hub");

            driver = new AndroidDriver(remoteUrl, desiredCapabilities);
            Thread.sleep(3000);
        }


        @After
        public void tearDown() {
            driver.quit();
        }
    }
}