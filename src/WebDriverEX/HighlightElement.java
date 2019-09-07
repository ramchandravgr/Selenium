package WebDriverEX;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HighlightElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://testingmasters.com/hrm");
		
		WebElement element = driver.findElement(By.id("txtUsername"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		for(int i=1 ; i<=3; i++)
		{
			js.executeScript("arguments[0].style.borders='solid 3px black'", element);
			
			Thread.sleep(200);
			js.executeScript("arguments[0].style.borders=''", element);
			
			Thread.sleep(200);
		}
		
	}

}
