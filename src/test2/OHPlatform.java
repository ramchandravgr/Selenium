package test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OHPlatform {

	static WebDriver driver;
		
	public static void main(String[] args) throws IOException {
		OHPlatform obj = new OHPlatform(); 
		obj.launchApp();
		driver.findElement(By.xpath(".//*[@id='mainMenu2']")).click();		
		driver.findElement(By.xpath(".//*[@id='mypetscolboxclass_2']")).click();
		WebElement mcs = driver.findElement(By.xpath(".//*[text()='Missed call to sms']"));
		WebElement cmc = driver.findElement(By.xpath(".//*[text()='Customers place a missed call, get an SMS in response']"));
		Actions act = new Actions(driver);
		act.moveToElement(mcs).click(cmc).build().perform();
		
		
		String tdpath = "C:\\Games\\OH.xlsx";
		File file = new File(tdpath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("OH");
		int numberofrows = sh.getLastRowNum();
		for(int i=2;i<=numberofrows;i++)
		{
			Random r = new Random();
			double randNum = r.nextInt(100000);
			
			XSSFRow row = sh.getRow(i);
			String servicename = row.getCell(1).getStringCellValue();
			String servicedesc = row.getCell(2).getStringCellValue()+randNum;
			String DID = row.getCell(3).getStringCellValue()+randNum;
			String API = row.getCell(4).getStringCellValue()+randNum;
			obj.serviceDetails(servicename,servicedesc,DID,API);		
			
		}

	}

	void launchApp()
	{
		String chromeDriverPath="C:\\Users\\ramchandra.v\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webDriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://openhouse.imimobile.com/ohindia/loginPage.htm");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUserName")).sendKeys("ramchandra.v@imimobile.com");
		driver.findElement(By.id("txtPassword")).sendKeys("oh@123");
		driver.findElement(By.id("bntLogin")).click();
		
				
	}
	
	String serviceDetails(String servicename,String servicedesc,String DID,String API)
	{
		driver.switchTo().frame("webapp_iframe");
		driver.findElement(By.id("txtSerName")).sendKeys(servicename);
		driver.findElement(By.id("txtSerDesc")).sendKeys(servicedesc);
		Select dropdown = new Select(driver.findElement(By.id("ddl_ServiceNumber")));
		dropdown.selectByValue(DID);
		driver.findElement(By.id("txtNotify")).sendKeys(API);
		driver.findElement(By.xpath(".//*[@id='btnLaunch']")).click();
		driver.switchTo().defaultContent();
		return ("0");
	}
	
}
