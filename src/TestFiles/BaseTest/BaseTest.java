/*
 * Creation : 03-Jan-2019
 */
package TestFiles.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Applications.Google.PageOperation.Google_HomepageOperation;
import Applications.Google.PageOperation.Google_LoginPageOperation;
import Applications.Google.PageOperation.Google_HomepageOperation;
import Applications.Google.PageOperation.Google_LoginPageOperation;
import Selenium.BrowserControl;
import Selenium.MethodDefination.methodDefination;
import Selenium.VerificationMethod.VerificationMethodDefination;

public class BaseTest {

    public static WebDriver driver; // = BrowserControl.WebDr;
    public WebDriverWait wait;
    public static VerificationMethodDefination verify;
    public static methodDefination navigate;
    public Google_LoginPageOperation GoogleLoginPage;
    public Google_HomepageOperation GoogleHomepagePage;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setup() {
        // Create a Chrome driver. All test classes use this.
        BrowserControl browserControl = new BrowserControl(driver);
        driver = BrowserControl.WebDr;
        navigate = new methodDefination(driver);
        verify = new VerificationMethodDefination(driver);
        // navigate = (methodDefination) navigate1;
        driver.manage().window().maximize();
        GoogleLoginPage = new Google_LoginPageOperation(driver);
        GoogleHomepagePage = new Google_HomepageOperation(driver);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
