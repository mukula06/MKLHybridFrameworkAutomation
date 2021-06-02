/*
 * Creation : 07-Jan-2019
 */
package Applications.Google.PageOperation;

import org.openqa.selenium.WebDriver;

import Applications.Google.PagesLocators.Google_HomepageLocator;

public class Google_HomepageOperation extends Google_HomepageLocator {

    public Google_HomepageOperation(WebDriver WebDr) {
        super(WebDr);
    }
    
    public void GotoGmail() {
		click(getGmail());
	}
    
    public void SearchKey(String Key) {
    	click(getKeySearchBox());
    	waitFor(3000);
		sendkeys(getKeySearchBox(), Key);
		waitFor(3000);
		click(getKeySearchBoxOK());
	}

}
