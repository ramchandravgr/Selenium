package Java.OOPS;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyEx1 {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		launchApp();
	}
	
	
	public static void launchApp() throws InterruptedException
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the browser to be opened : IE/FF/CHROME");
	
	String browser = sc.next();
	
	switch (browser.toUpperCase())
	{
	
	case "IE" :
		driver = new InternetExplorerDriver();
		break ;
		
	case "FF" :
		driver = new FirefoxDriver();
		break ;
	
	case "CHROME" :
		
		String Chromedriverpath = "C:\\Users\\ramchandra.v\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Chromedriverpath);

		driver = new ChromeDriver();
		break ;

	}
	
	driver.get("https://www.google.com");
	Thread.sleep(3000);
	driver.quit();
	
	
}
}
