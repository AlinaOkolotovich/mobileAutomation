import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;

import java.net.URL;

public class StartDriver {

    public static final String USERNAME = "YOUR_USERNAME";
    public static final String ACCESS_KEY = "YOUR_ACCESS_KEY";
    public static final String URL = "https://o.tpondemand.com/";
    WebDriver driver;


    public WebDriver getDriverWithParams(String device, String platformVersion) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", device);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("app", "https://s3.amazonaws.com/appium/TestApp8.4.app.zip");
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("appiumVersion", "1.7.2");

        driver = new IOSDriver(new URL(URL), capabilities);
        return driver;
    }

    public void stopDriver() {
        driver.quit();
    }
}