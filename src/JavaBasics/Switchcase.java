package JavaBasics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Switchcase {

	public static void main(String[] args) {
		
		WebDriver driver = null;
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
		
		default : System.out.println("Please specify valid browser");
			
		}
		
		driver.get("http://www.google.com");
		
		
		
		

	}

}
