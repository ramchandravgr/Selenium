package Test;

import java.awt.Desktop.Action;
import java.awt.Frame;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramchandra.v\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://openhouse.imimobile.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.findElement(By.id("txtUserName")).sendKeys("ramchandra.v@imimobile.com");
		driver.findElement(By.id("txtPassword")).sendKeys("oh@123");
		driver.findElement(By.id("bntLogin")).click();
		
		driver.findElement(By.xpath(".//*[@id='mainMenu2']")).click();		
		driver.findElement(By.xpath(".//*[@id='mypetscolboxclass_2']")).click();
		WebElement exp1 = driver.findElement(By.xpath(".//*[text()='Missed call to sms']"));
		WebElement exp = driver.findElement(By.xpath(".//*[text()='Customers place a missed call, get an SMS in response']"));
		Actions act = new Actions(driver);
		act.moveToElement(exp1).click(exp).build().perform();				
		driver.switchTo().frame("webapp_iframe");
		driver.findElement(By.id("txtSerName")).sendKeys("Nest711");
		driver.findElement(By.id("txtSerDesc")).sendKeys("service");
		Select dropdown = new Select(driver.findElement(By.id("ddl_ServiceNumber")));
		dropdown.selectByValue("4071011462");
		driver.findElement(By.id("txtNotify")).sendKeys("eaapps.imimobile.com/VibgyorApi/missedcall.aspx?msisdn=!MOBILENO!&transid=!TID!&vmn=04071514718");
		driver.findElement(By.xpath(".//*[@id='btnLaunch']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ctl00_cph_txtTrafiic")).sendKeys("5");;
		driver.findElement(By.xpath(".//*[@id='ctl00_cph_btnReports']")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		WebDriverWait wait = new WebDriverWait(driver, 30);					
		By loader = By.className("global_loading_image_div");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
		driver.findElement(By.xpath(".//*[@id='mainMenu2']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='mainMenu2']")));

		driver.quit();
		
	
	}

}
