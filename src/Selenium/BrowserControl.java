/*
 * Creation : 05-Jan-2019
 */
package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.LogStatus;

import ExtentReports.ExtentTestManager;
import PropertyFileReader.FrameworkConfigPropertyFileReader;

public class BrowserControl {

	public static WebDriver WebDr;
    private FrameworkConfigPropertyFileReader config;

    public BrowserControl(WebDriver webDr) {
        super();
        
        config = new FrameworkConfigPropertyFileReader();
        String browser = config.getBrowser();
        browser = browser.toLowerCase();
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", config.getChromeDriverFilePath());
            webDr = new ChromeDriver();
            //Donot use below commented line, throwing nullpointer, as test is not initiated yet
            //ExtentTestManager.getTest().log(LogStatus.INFO, "Open Chrome browser");
        } else if (browser.equals("ie")) {
            System.setProperty("webdriver.ie.driver", config.getIEDriverfilePath());
            webDr = new InternetExplorerDriver();
          //Donot use below commented line, throwing nullpointer, as test is not initiated yet
           // ExtentTestManager.getTest().log(LogStatus.INFO, "Open Internet Explorer browser");
        }
        this.WebDr = webDr;
    }

}
