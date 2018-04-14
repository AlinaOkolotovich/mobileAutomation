package steps;

import driver.DriverSingleton;
import io.appium.java_client.ios.IOSDriver;
import pages.LoginPage;

/**
 * Created by okolotovich on 4/11/18.
 */
public class Steps {
    private IOSDriver driver;

    // all supported driver capabilities are shown in DriverCapabilitieas enum
    public void initApp(String capabilities) throws Exception{
        driver = DriverSingleton.getDriver(capabilities);
    }

    public void closeDriver(){
        DriverSingleton.closeDriver();
    }
    public void   loginToApp(String credentialsEnumName){
        LoginPage lp = new LoginPage(driver);
        lp.openPage();
        lp.login(credentialsEnumName);
    }


}
