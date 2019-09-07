package WebDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassEx1 {
	public static FirefoxDriver driver;
	public static Actions act_obj;
	
	public static void launchApp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://testingmasters.com/hrm");
		
	}
	
	public static void loginHRM() {
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void navMyLeavePage() {
		Actions act_obj = new Actions(driver);
		WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
		act_obj.moveToElement(leave).build().perform();
		driver.findElement(By.xpath("//a[@href='/hrm/symfony/web/index.php/leave/viewMyLeaveList/reset/1']"));
	}
	
	public static void logoutHRM() {
		act_obj = new Actions(driver);
		WebElement welcome = driver.findElement(By.xpath("//a[@id='welcome']"));
		act_obj.moveToElement(welcome).click().build().perform();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
		
	}
	
	
	public static void main(String[] args) {
		//Step 1 : Launch application
		launchApp();
		//Step 2 : Login as team member
		loginHRM();
		//Step 3 : Navigate My Leave
		navMyLeavePage();
		//Step 6 : Logout
		logoutHRM();
	}
}
