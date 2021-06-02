/*
 * Creation : 04-Jan-2019
 */
package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public interface SeleniumMethod {

    public void get(String url);

    public String getCurrentUrl();

    public String getTitle();

    public String getPageSource();

    public WebElement findElement(By by);

    public List findElements(By by);

    public void close();

    public void quit();

    public void getWindowHandle();

    public void getWindowHandles();

    public void navigate(String url);

    // Web operations on web Elements

    public void click(By by);

    public void sendkeys(By by, String dataToSend);

    public void clear(By by);

    public String getText(By by);

    public String getTagName(By by);

    public Point getLocation(By by);

    public boolean isSelected(By by);

    public boolean isDisplayed(By by);

    public boolean isEnabled(By by);

    public String getAttribute(By by, String attributeOf);

}
