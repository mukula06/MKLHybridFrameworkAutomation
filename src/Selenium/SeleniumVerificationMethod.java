/*
 * Creation : 07-Jan-2019
 */
package Selenium;

public interface SeleniumVerificationMethod {

    public void assertConditionIsTrue(boolean condition, String message);

    public void assertTwoString(String actual, String expected);
}
