package ShiviLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationLearn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "DriverFile//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kidde.com/home-safety/en/us/");
		//driver.findElement(By.cssSelector("#close>span")).click();
		driver.findElement(By.id("q")).sendKeys("Kidde");
		driver.findElement(By.id("btnSearch")).click();
		if(driver.findElement(By.className("card-title")).getText().equals("Two Year Power Supply 9 Volt Battery")){
			System.out.println(driver.findElement(By.className("card-title")).getText());
			System.out.println("TC 1 is passed");
		}
		else{
			System.out.println(driver.findElement(By.className("card-title")).getText());
			System.out.println("failed");
		}
	
	}

}
