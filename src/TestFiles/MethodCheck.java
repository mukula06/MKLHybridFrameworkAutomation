/*
 * Creation : 06-Jan-2019
 */
package TestFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

import DateAndTimeFormat.DateAndTimeFormatExtentReport;

public class MethodCheck {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


      
        //DateAndTimeFormatExtentReport dateAndTime = new DateAndTimeFormatExtentReport();
        //System.out.println(dateAndTime.getDateAndTime());
    	System.setProperty("webdriver.chrome.driver", "DriverFile//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement MukshiEle = driver.findElement(By.name("q"));
        MukshiEle.sendKeys("Shivanshi");
        
        driver.findElement(By.name("q")).clear();
        
        driver.findElement(By.name("q")).sendKeys("Mukul");
        
        
        Assertion assert1 = new Assertion();
        assert1.assertEquals("123", "123");
    }

}
