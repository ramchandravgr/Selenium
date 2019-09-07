package WebDriverEX;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTabs {

	public static void main(String[] args) throws InterruptedException {

		String Chromedriverpath = "C:\\Users\\ramchandra.v\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Chromedriverpath);
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.navigate().to("https://google.com");
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		
		driver.navigate().to("https://yahoo.com");
		System.out.println(driver.getTitle());
		
		
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
		System.out.println(driver.getTitle());
		
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
	}

}
