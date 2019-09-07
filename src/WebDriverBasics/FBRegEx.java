package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBRegEx {

	public static void main(String[] args) throws InterruptedException {
		
		String Chromedriverpath = "C:\\Users\\ramchandra.v\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Chromedriverpath);
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://fb.com");
		
		driver.findElement(By.name("firstname")).sendKeys("Ramchandra");
		driver.findElement(By.name("lastname")).sendKeys("Nani");
		driver.findElement(By.name("reg_email__")).sendKeys("ramchandra.vgr@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ramchandra.vgr@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("keepsmiling");
		Select sel_day = new Select(driver.findElement(By.id("day")));
		sel_day.selectByVisibleText("18");
		Select sel_month = new Select(driver.findElement(By.id("month")));
		sel_month.selectByIndex(11);
		Select sel_year = new Select(driver.findElement(By.id("year")));
		sel_year.selectByValue("1995");
		
		
		
		Thread.sleep(2000);
		
	}

}
