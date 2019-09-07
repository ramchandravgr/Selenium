package WebDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CancelLeave {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://testingmasters.com/hrm");
		
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions act_obj = new Actions(driver);
		WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
		act_obj.moveToElement(leave).build().perform();
		driver.findElement(By.xpath("//a[@href='/hrm/symfony/web/index.php/leave/viewMyLeaveList/reset/1']"));
		
		String strDate = "2019-07-31";
		
		int rowCount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		boolean bTag = false;
		for(int i=1;i<=rowCount ; i ++)
		{
			String appDate = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]")).getText();
			String appStatus = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[6]")).getText();
			
		}
		
		
		
	}

}
