package WebDriverEX;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNewWindow {
	public static void main(String[] args) throws InterruptedException {
		String Chromedriverpath = "C:\\Users\\ramchandra.v\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Chromedriverpath);
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.navigate().to("https://google.com");
		
		//Using mouse right click, keyboard arrow down, enter ,etc keys
		
		WebElement link_Gmail = driver.findElement(By.linkText("Gmail"));
		
		Actions Act = new Actions(driver);
		
		Thread.sleep(3000);
		//open gmail in new tab
		Act.contextClick(link_Gmail).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
		
		//open gmail page in new windows
		Act.contextClick(link_Gmail).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
}
