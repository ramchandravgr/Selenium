package WebDriverEX;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) throws InterruptedException {

		String Chromedriverpath = "C:\\Users\\ramchandra.v\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Chromedriverpath);
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.navigate().to("https://ljsjobs.com/DiscountedTraining/TrainingRegistration.aspx");
		
		
		driver.findElement(By.linkText("FAQ")).click();
		
		driver.findElement(By.linkText("FeedBack")).click();
		
		Thread.sleep(2000);
		
		String HomepageHandle = driver.getWindowHandle();
		System.out.println(HomepageHandle);
		
		Set<String> allhandles = driver.getWindowHandles();
		
		for(String wndHandle: allhandles)
		{
			driver.switchTo().window(wndHandle);
			String pageURL = driver.getCurrentUrl();
			if(pageURL.contains("Feedback"))
			{
				System.out.println("Switch");
				//fill all the details
				
				Thread.sleep(3000);
				driver.close();
				
				break;
			}
		}
		
		driver.switchTo().window(HomepageHandle);
		
		driver.quit();
		
	}

}
