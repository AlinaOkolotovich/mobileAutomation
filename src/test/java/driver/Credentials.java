package driver;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

/**
 * Created by okolotovich on 4/14/18.
 */
public enum  Credentials {

    // here goes all the possible account credentials
    NON_SS0_ONDEMAND("o.tpondemand.com", "admin","123"),
    NON_SSO_ONSITE("","",""),
    SSO_ONDEMAND("","",""),
    SSO_ONSITE("","","");

    private String accountName;
    private String userName;
    private String password;

    Credentials(String accountName, String userName, String password){
        this.accountName = accountName;
        this.userName = userName;
        this.password = password;
    }
    public String getAccountName(){return accountName;}
    public String getUserName(){return userName;}
    public String getPassword(){return password;}

}
