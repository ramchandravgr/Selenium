package WebDriverEX;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrollpage {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://seleniumhq.org/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 2000)");
	}

}
