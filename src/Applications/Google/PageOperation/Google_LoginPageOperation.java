/*
 * Creation : 06-Jan-2019
 */
package Applications.Google.PageOperation;

import org.openqa.selenium.WebDriver;

import Applications.Google.PagesLocators.Google_LoginPageLocator;

public class Google_LoginPageOperation extends Google_LoginPageLocator {

    public Google_LoginPageOperation(WebDriver WebDr) {
        super(WebDr);
        // TODO Auto-generated constructor stub
    }

    public void ClickSignIn() {
        this.click(getSignInLoc());
    }
}
