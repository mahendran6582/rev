package Tc01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dateP1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id=\'datepicker\']")).click();
		
		
		String month = "October";
		String year = "2024";
		String date = "20";
		
		while(true)
		{
			String monthsel = driver.findElement(By.xpath("//span[@class=\'ui-datepicker-month\']")).getText();
			String yearsel = driver.findElement(By.xpath("//span[@class=\'ui-datepicker-year\']")).getText();
			
			if(monthsel.equals(month) && yearsel.equals(year))
			{
				break;
				
			}
		
			
			//driver.findElement(By.xpath("//span[@class=\'ui-icon ui-icon-circle-triangle-e\']")).click(); //forward
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click(); //reverse
			
		}
			List<WebElement> datesel = driver.findElements(By.xpath("//table[@class ='ui-datepicker-calendar']//td/a"));
			
			for(WebElement dat:datesel)
			{
				if(dat.getText().equals(date))
				{
					dat.click();
					break;
				}
			}
		
			
	}

}
