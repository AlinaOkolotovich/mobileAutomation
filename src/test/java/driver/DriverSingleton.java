package driver;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by okolotovich on 4/11/18.
 */
public class DriverSingleton {
    private static IOSDriver driver;

    private DriverSingleton(){};

    // all supported driver capabilities are shown in DriverCapabilitieas enum
    public static IOSDriver getDriver(String capabilities) throws Exception{
        if (driver == null) {
            driver = DriverCapabilities.valueOf(capabilities).getDriver();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void closeDriver(){
        driver.quit();
        driver = null;
    }
}
