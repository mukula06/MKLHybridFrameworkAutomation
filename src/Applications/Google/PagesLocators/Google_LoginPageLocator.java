/*
 * Creation : 06-Jan-2019
 */
package Applications.Google.PagesLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Selenium.MethodDefination.methodDefination;

public class Google_LoginPageLocator extends methodDefination {

    public Google_LoginPageLocator(WebDriver WebDr) {
        super(WebDr);
        // TODO Auto-generated constructor stub
    }

    public static By SignInLoc = By.partialLinkText("Sign in");

	public static By getSignInLoc() {
		return SignInLoc;
	}

}
