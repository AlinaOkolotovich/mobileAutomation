package pages;

import io.appium.java_client.ios.IOSDriver;

/**
 * Created by okolotovich on 4/11/18.
 */
public abstract class AbstractPage {
    protected IOSDriver driver;
    public abstract void openPage();
    public AbstractPage(IOSDriver driver){
        this.driver = driver;
    }
    
}
