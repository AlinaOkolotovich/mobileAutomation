import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.Steps;

import java.net.MalformedURLException;

/**
 * Created by okolotovich on 4/11/18.
 */

public class BaseTest {
    private Steps steps;

    @BeforeMethod (description = "Init browser")
    public void initApp() throws Exception {
        steps = new Steps();
        steps.initApp("IPNONE_X_IOS_11_2");
    }

    @Test
    public void loginToApp(){
        steps.loginToApp("NON_SS0_ONDEMAND");
    }
    @AfterMethod(description = "Stop Browser")
    public void stopBrowser()
    {
        steps.closeDriver();
    }



}
