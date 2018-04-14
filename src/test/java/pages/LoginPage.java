package pages;

import driver.Credentials;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by okolotovich on 4/11/18.
 */
public class LoginPage extends AbstractPage{
    public String accountEnteredValue = "";

// welcome screen
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Log in\"]" )
    private WebElement loginButton;

    @FindBy(xpath = "//XCUIElementTypeTextField" )
    private WebElement accountTextField;

    private WebElement cloudAccountNameHint;
    private WebElement onPremAccountNameHint;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Clear text\"]")
    private WebElement clearTextButton;

    @FindBy (xpath = "//XCUIElementTypeImage[@name=\"targetprocess-logo\"]")
    private WebElement TPlogo;

    @FindBy (xpath = "//XCUIElementTypeImage[@name=\"seechange-tagline\"]")
    private WebElement seeChangeText;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Go\"]")
    private WebElement keyboardGoButton;




    public LoginPage(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void openPage() {
    }

    //all the possible credentialEnumNames are listed in enum Credentials
    public void login(String credentialsEnumName){
        loginButton.click();
        if (credentialsEnumName.equalsIgnoreCase("NON_SS0_ONDEMAND")){
            accountTextField.sendKeys(Credentials.NON_SS0_ONDEMAND.getAccountName());
        } else if (credentialsEnumName.equalsIgnoreCase("NON_SSO_ONSITE")){
            accountTextField.sendKeys(Credentials.NON_SSO_ONSITE.getAccountName());
        } else if (credentialsEnumName.equalsIgnoreCase("SSO_ONDEMAND")){
            accountTextField.sendKeys(Credentials.SSO_ONDEMAND.getAccountName());
        } else if (credentialsEnumName.equalsIgnoreCase("SSO_ONSITE")){
            accountTextField.sendKeys(Credentials.SSO_ONSITE.getAccountName());
        }
        keyboardGoButton.click();
    }
}
