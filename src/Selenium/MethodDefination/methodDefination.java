/*
 * Creation : 04-Jan-2019
 */
package Selenium.MethodDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import ExtentReports.ExtentManager;
import ExtentReports.ExtentTestManager;
import Selenium.SeleniumMethod;
import Selenium.VerificationMethod.VerificationMethodDefination;

public class methodDefination extends VerificationMethodDefination implements SeleniumMethod {

	// WebDriver WebDr;
	// WebDriverWait wait;
	// FrameworkConfigPropertyFileReader config = new FrameworkConfigPropertyFileReader();
	// WebElement element;


	public methodDefination(WebDriver WebDr) {
		super(WebDr);
	}

	@Override
	public void get(String url) {
		try {
			WebDr.get(url);
			String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) WebDr).getScreenshotAs(OutputType.BASE64);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Goto URL: "+url,ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
		} catch (Exception e) {
			System.out.println("No URL is available: " +url+" Exception: "+ e);
		}
	}

	@Override
	public String getCurrentUrl() {
		try {
			String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) WebDr).getScreenshotAs(OutputType.BASE64);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Current URL in: "+WebDr.getCurrentUrl(),ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
			return WebDr.getCurrentUrl();
		} catch (Exception e) {
			System.out.println("No URL is available: " + e);
			return null;
		}
	}

	@Override
	public String getTitle() {
		try {
			return WebDr.getTitle();
		} catch (Exception e) {
			System.out.println("No title is available: " + e);
			return null;
		}
	}

	@Override
	public String getPageSource() {
		try {
			return WebDr.getPageSource();
		} catch (Exception e) {
			System.out.println("No page source is available: " + e);
			return null;
		}
	}

	public void waitFor(long millis) {
		try {
			Thread.sleep(millis);
		} catch (Exception e) {
			System.out.println("Throwing thread time Exception: " + e);
		}
	}

	@Override
	public WebElement findElement(By by) {
		try {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
			this.waitFor(1000);
			return element;
		} catch (Exception e) {
			System.out.println("No Elemment is available: "+by+" Exception: "+ e);
			return null;
		}
	}

	@Override
	public List findElements(By by) {
		try {
			return WebDr.findElements(by);
		} catch (Exception e) {
			System.out.println("No Elemments are available: " +by+" Exception: "+ e);
			return null;
		}
	}

	@Override
	public void close() {
		try {
			WebDr.close();
			String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) WebDr).getScreenshotAs(OutputType.BASE64);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Close the browser",ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
		} catch (Exception e) {
			System.out.println("No session is available to close: " + e);
		}
	}

	@Override
	public void quit() {
		try {
			WebDr.quit();
			String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) WebDr).getScreenshotAs(OutputType.BASE64);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Quit the browser",ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
		} catch (Exception e) {
			System.out.println("No Browser is available to close: " + e);
		}
	}

	@Override
	public void getWindowHandle() {
		try {
			WebDr.getWindowHandle();
		} catch (Exception e) {
			System.out.println("No tab is available to handle: " + e);
		}
	}

	@Override
	public void getWindowHandles() {
		try {
			WebDr.getWindowHandles();
		} catch (Exception e) {
			System.out.println("No tabs are available to handle: " + e);
		}
	}

	@Override
	public void navigate(String url) {
		try {
			WebDr.navigate().to(url);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Navigate to URL: "+url);
		} catch (Exception e) {
			System.out.println("No URL is available to handle: " +url+" Exception: "+ e);
		}
	}

	@Override
	public void click(By by) {
		try {
			this.findElement(by).click();
			String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) WebDr).getScreenshotAs(OutputType.BASE64);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Click on: "+by,ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
		} catch (Exception e) {
			System.out.println("No Element is available to Click: "+by+" Exception: "+ e);
		}
	}

	@Override
	public void sendkeys(By by, String dataToSend) {
		try {
			this.findElement(by).sendKeys(dataToSend);
			String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) WebDr).getScreenshotAs(OutputType.BASE64);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Enter value: "+dataToSend,ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
			
		} catch (Exception e) {
			System.out.println("No Element is available to set value: "+by+" Exception: "+ e);
		}
	}

	@Override
	public void clear(By by) {
		try {
			this.findElement(by).clear();
		} catch (Exception e) {
			System.out.println("No Element is available to Clear: " +by+" Exception: "+ e);
		}
	}

	@Override
	public String getText(By by) {
		try {
			return this.findElement(by).getText();
		} catch (Exception e) {
			System.out.println("No Element is available to get text: " +by+" Exception: "+ e);
			return null;
		}
	}

	@Override
	public String getTagName(By by) {
		try {
			return this.findElement(by).getTagName();
		} catch (Exception e) {
			System.out.println("No Element is available to get Tag name: " +by+" Exception: "+ e);
			return null;
		}
	}

	@Override
	public Point getLocation(By by) {
		try {
			return this.findElement(by).getLocation();
		} catch (Exception e) {
			System.out.println("No Element is available to get Location: " +by+" Exception: "+ e);
			return null;
		}
	}

	@Override
	public boolean isSelected(By by) {
		try {
			return this.findElement(by).isSelected();
		} catch (Exception e) {
			System.out.println("No Element is available to select: " +by+" Exception: "+ e);
			return false;
		}
	}

	@Override
	public boolean isDisplayed(By by) {
		try {
			return this.findElement(by).isDisplayed();
		} catch (Exception e) {
			System.out.println("No Element is available to display: " +by+" Exception: "+ e);
			return false;
		}
	}

	@Override
	public boolean isEnabled(By by) {
		try {
			return this.findElement(by).isEnabled();
		} catch (Exception e) {
			System.out.println("No Element is available to Enable: " +by+" Exception: "+ e);
			return false;
		}
	}

	@Override
	public String getAttribute(By by, String attributeOf) {
		try {
			return this.findElement(by).getAttribute(attributeOf);
		} catch (Exception e) {
			System.out.println("No Element is available to get attribute of : " + attributeOf + "--> " +by+" Exception: "+ e);
			return null;
		}
	}

	public void switchToFrameById(String frameIdOrName) {
		try {
			this.waitFor(2000);
			WebDr.switchTo().frame(frameIdOrName);
		} catch (Exception e) {
			System.out.println("No Frame is available to switch: " + frameIdOrName + "--> " + e);
		}
	}

	public Boolean ifElementIsPresent(By by) {
		try {
			Boolean iselementpresent = WebDr.findElements(by).size() != 0;
			if (iselementpresent == true)
				return true;
			}
		catch (Exception e) {
			System.out.println("No element is present: "  +by+" Exception: "+ e);
			//return false;
		}
		return false;

	}

}
