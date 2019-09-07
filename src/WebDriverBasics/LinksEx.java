package WebDriverBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEx {
	
	public static void main(String[] args) throws InterruptedException {
		
		String Chromedriverpath = "C:\\Users\\ramchandra.v\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Chromedriverpath);
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://fb.com");
		
		driver.findElementByPartialLinkText("Create a").click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
				
		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		driver.quit();
		
	}

}
