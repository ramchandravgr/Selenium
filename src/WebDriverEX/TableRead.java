package WebDriverEX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableRead {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		String[] a = {"name","id","email","address"};
		
		int count = 0;
		int i;
		String a;
		
		for(i=0;i<a.length();i++)
			a=driver.findElement(By.xpath(".//table[@id='app']/tr[1]/td[i]")).getText();
		
		
			
		
	}
	

}
