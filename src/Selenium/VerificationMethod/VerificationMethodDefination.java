/*
 * Creation : 07-Jan-2019
 */
package Selenium.VerificationMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import PropertyFileReader.FrameworkConfigPropertyFileReader;
import Selenium.SeleniumVerificationMethod;

public class VerificationMethodDefination implements SeleniumVerificationMethod {
    public static WebDriver WebDr;
    public static WebDriverWait wait;
    public static FrameworkConfigPropertyFileReader config = new FrameworkConfigPropertyFileReader();
    public static WebElement element;
    public static Assert asserts;

    public VerificationMethodDefination(WebDriver WebDr) {
        this.WebDr = WebDr;
        long ExTime = config.getExplicitWaitTime();
        wait = new WebDriverWait(WebDr, ExTime);
    }

    @Override
    public void assertConditionIsTrue(boolean condition, String assertionErrorMessage) {
        asserts.assertTrue(condition, assertionErrorMessage);
    }

    @Override
    public void assertTwoString(String actual, String expected) {
        asserts.assertEquals(actual, expected);

    }
}
