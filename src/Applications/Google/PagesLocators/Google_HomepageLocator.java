/*
 * Creation : 06-Jan-2019
 */
package Applications.Google.PagesLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Selenium.MethodDefination.methodDefination;

public class Google_HomepageLocator extends methodDefination {

    public Google_HomepageLocator(WebDriver WebDr) {
        super(WebDr);
        // TODO Auto-generated constructor stub
    }

    public static By gmail = By.xpath("//a[contains(text(),'Gmail')]");
    public static By KeySearchBox = By.name("q");
    public static By KeySearchBoxOK = By.name("btnK");
	public static By getGmail() {
		return gmail;
	}
	public static By getKeySearchBox() {
		return KeySearchBox;
	}
	public static By getKeySearchBoxOK() {
		return KeySearchBoxOK;
	}    
}
