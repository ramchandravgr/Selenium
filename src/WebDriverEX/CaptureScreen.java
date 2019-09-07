package WebDriverEX;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

class CaptureScreen {

public static void main(String[] args) throws IOException {
		
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://gmail.com");
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File strFile = ts.getScreenshotAs(OutputType.FILE);
	File trgFile = new File("D:\\screenshot1.png");
	FileHandler.copy(strFile, trgFile);
	
	
	}

}
