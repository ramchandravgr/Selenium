package JavaBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PasswordDecrypt {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		PasswordDecrypt ed = new PasswordDecrypt();
				
		ed.encryptDecrypt();
		
		PasswordDecrypt objExcelFile = new PasswordDecrypt();

	    //Prepare the path of excel file

	    //String filePath = System.getProperty("user.dir")+"D:\\Errorlogs";

	    //Call read file method of the class to read data

		String[] abc = objExcelFile.readExcel("D:\\Errorlogs","passwordSheet.xlsx","Sheet2");
	    
	    for(int i=0; i<21; i++)
	    {
		
		driver.findElement(By.id("ttext")).sendKeys(abc[i]);
	    driver.findElement(By.id("bEncrypt")).click();
	    System.out.println(driver.findElement(By.id("tftext")).getText());
	    
	    driver.findElement(By.id("ttext")).clear();
		
	    }
	    
		
	    driver.quit();
		

	}
	
	public String[] readExcel(String filePath,String fileName,String sheetName) throws IOException{

	    //Create an object of File class to open xlsx file

	    File file =    new File(filePath+"\\"+fileName);

	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);

	    XSSFWorkbook passwordWorkbook = null;

	    //Find the file extension by splitting file name in substring  and getting only extension name

	    String fileExtensionName = fileName.substring(fileName.indexOf("."));

	    //Check condition if the file is xlsx file

	    if(fileExtensionName.equals(".xlsx")){

	    //If it is xlsx file then create object of XSSFWorkbook class

	    passwordWorkbook = new XSSFWorkbook(inputStream);

	    }

	    //Check condition if the file is xls file

	    else if(fileExtensionName.equals(".xls")){

	        //If it is xls file then create object of HSSFWorkbook class

	        //passwordWorkbook = new HSSFWorkbook(inputStream);

	    }

	    //Read sheet inside the workbook by its name

	    XSSFSheet passwordSheet = passwordWorkbook.getSheet(sheetName);

	    //Find number of rows in excel file

	    int rowCount = passwordSheet.getLastRowNum()-passwordSheet.getFirstRowNum();

	    //Create a loop over all the rows of excel file to read it
	    String[] pwd = new String[50];
	    for (int i = 0; i < rowCount+1; i++) {

	        Row row = passwordSheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console
	        	DataFormatter formatter = new DataFormatter();
	        	String cellvalue = formatter.formatCellValue(row.getCell(j));
	            //System.out.print(cellvalue);//.getStringCellValue()+"|| ");
	        	
				pwd[i] = cellvalue;
				       	
	        }
	        
	    } 
	    return pwd;
	    }  
	void encryptDecrypt() throws InterruptedException
	{
	String Chromedriverpath = "C:\\Users\\ramchandra.v\\Downloads\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", Chromedriverpath);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://transport.goindigo.in/IndigoUI/encryptdecrypt.aspx");
	Thread.sleep(3000);
	
	}
	

}
