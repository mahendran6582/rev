package Sep10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker7 {
	
	static void selectfuturedate(WebDriver driver, String month, String year,String date)
	{
		
		while(true)
		{
			String monthselect = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String monthyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(monthselect.equals(month) && monthyear.equals(year)) 
			{
			break;	
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // forward

			
		}
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt:dates) 
		{
		if(dt.getText().equals(date)) {
			dt.click();
			break;
		}
		}
			
	}
	static void selectpastdate(WebDriver driver, String month, String year,String date)
	{
		
		while(true)
		{
			String monthselect = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String monthyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(monthselect.equals(month) && monthyear.equals(year)) 
			{
			break;	
			}
			
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //reverse
			
		}
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt:dates) 
		{
		if(dt.getText().equals(date)) {
			dt.click();
			break;
		}
		}
			
	}
	
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(0);
	
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	
	String month = "May";
	String year = "2022";
	String date = "11";


	//selectfuturedate (driver, month, year,date);
	selectpastdate (driver, month, year,date);
		
	}


}



