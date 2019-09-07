package WebDriverEX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CompareDropDownValues {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		
		String[] a= {"anil","kishore","ram","raja"};
		int i;
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='appid']"));
		Select sel = new Select(dropdown);
		List<WebElement> option = sel.getOptions();
		
		for (WebElement we: option)
			for(i=0;i<a.length;i++)
				if(we.getText().equals(a[i]))
					System.out.println("elements matched");
	}

}
