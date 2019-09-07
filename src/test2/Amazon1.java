package test2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Amazon1 {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon1 obj = new Amazon1();
		obj.launchApp();
		String result = obj.searchPens("Pens","Zebra Pen");
		System.out.println("Result = "+result);
		obj.closeApp();
	}
	
	void launchApp()
	{
		String Chromedriverpath = "C:\\Users\\ramchandra.v\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Chromedriverpath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	}
	
	String searchPens(String brand,String searchtext)
	{
		// Actions class will automate Keyboard and mouse operations
		Actions action = new Actions(driver);
		// implicitlyWait will wait for an element to be visible for the given amount of time
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchtext);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Go']")).click();
		driver.findElement(By.linkText("Ballpoint Pens")).click();
		String messageXpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']";
		// moveToElement will move the mouse on to the given element
		// for sure we have to use the build().perform() method  with any actions method we use
		// (//input[@type='checkbox'])[7] This xpath will locate the Checkbox of Parker
		String brandXpath = "//span[contains(text(),'"+brand+"')]"; 
		action.moveToElement(driver.findElement(By.xpath(brandXpath))).click().build().perform();
		// getText() method will get the text out of a given tag
		String message = driver.findElement(By.xpath(messageXpath)).getText();
		return message;
	}
	
	void closeApp()
	{
		driver.quit();

	}

}
