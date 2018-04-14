package driver;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by okolotovich on 4/11/18.
 */
public enum DriverCapabilities {

    // other device capabilities can be adde here
    IPNONE_8_IOS_11_2("iPhone 8", "11.2"),
    IPNONE_X_IOS_11_2("iPhone X","11.2"),
    IPAD_PRO_12_9_INCH_IOS_11_2("iPad Pro (12,9-inch)","11.2");

    public static final String URL = "http://127.0.0.1:4723/wd/hub";

    private String deviceName;
    private String platformVersion;

    DriverCapabilities(String deviceName, String platformVersion ){
        this.deviceName = deviceName;
        this.platformVersion = platformVersion;
    }
    public String deviceName(){
        return deviceName;
    }
    public String platformVersion(){
        return platformVersion;
    }

    IOSDriver getDriver() throws Exception{
        IOSDriver driver;
        switch (this){
            case IPNONE_8_IOS_11_2:
                driver = getDriverWithCapabilities();
                return driver;
            case IPNONE_X_IOS_11_2:
                driver = getDriverWithCapabilities();
                return driver;
            case IPAD_PRO_12_9_INCH_IOS_11_2:
                driver = getDriverWithCapabilities();
                return driver;
            default:
                throw new AssertionError("Unknown capability " + this);
        }
    }

    private IOSDriver getDriverWithCapabilities() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName());
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion());
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/okolotovich/Desktop/TargetProcess.app");
        IOSDriver<IOSElement> driver = new IOSDriver(new URL(URL), capabilities);
        return driver;
    }

}
