package mtn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mtnScripts {

WebDriver driver;
String celldata;

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub

mtnScripts mtn = new mtnScripts();
mtn.launchmtn();
mtn.loginmtn();
mtn.launchDb();
mtn.loginDb();
mtn.registerCode();
}

void launchmtn() throws InterruptedException
{
String Chromedriverpath = "C:\\Users\\ramchandra.v\\Downloads\\chromedriver_win32\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", Chromedriverpath);
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://mtnplay.com.ye/portal/defaultx.aspx?lang=engl");
Thread.sleep(3000);
}

void loginmtn() throws InterruptedException
{
WebElement loginLink = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
loginLink.click();
WebElement loginNumber = driver.findElement(By.xpath("//input[@id = 'txtuser']"));
loginNumber.sendKeys("22565610503");
WebElement confirm = driver.findElement(By.xpath("//*[@id=\"btnsubmit\"]"));
confirm.click();
Thread.sleep(3000);

}

void registerCode() throws InterruptedException
{
WebElement code = driver.findElement(By.xpath("//*[@id='txtotp']"));
code.click();
code.sendKeys(celldata);
WebElement confirm = driver.findElement(By.xpath("//*[@id='btnsubmit']"));
confirm.click();
Thread.sleep(3000);
}

void launchDb() throws InterruptedException
{
String Chromedriverpath = "C:\\Users\\ramchandra.v\\Downloads\\chromedriver_win32\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", Chromedriverpath);
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://10.18.0.89/davinci/getdbdetails/");
Thread.sleep(3000);
}

void loginDb() throws InterruptedException
{
WebElement dbUserName = driver.findElement(By.xpath("//input[@name = 'txtUserName']"));
dbUserName.click();
dbUserName.sendKeys("dbdetails");
WebElement dbpasscode = driver.findElement(By.xpath("//input[@name = 'txtPassword']"));
dbpasscode.click();
dbpasscode.sendKeys("db@imi@123");
WebElement okButton = driver.findElement(By.xpath("//input[@name = 'btnOk']"));
okButton.click();
Thread.sleep(3000);
WebElement dropDown = driver.findElement(By.xpath("//select[@name = 'cmbDSNs']"));
dropDown.click();
WebElement query = driver.findElement(By.xpath("//textarea[@id = 'txtQuery']"));
query.sendKeys("select top 1* from pms_user_authentication_details (nolock) where mobileno='22565610503' order by updatedtime desc ");
WebElement showButton = driver.findElement(By.xpath("//input[@id='cmdShow']"));
showButton.click();
WebElement result = driver.findElement(By.xpath("//*[@id='dbGrid']/tbody/tr[2]/td[12]"));
celldata = result.getText();
}
}