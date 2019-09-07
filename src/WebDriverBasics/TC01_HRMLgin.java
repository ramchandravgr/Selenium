package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC01_HRMLgin {

	public static void main(String[] args) {
			
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testingmasters.com/hrm/");
		
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}

}
