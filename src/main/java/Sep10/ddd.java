package Sep10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ddd {
	
	static void selectfuturedate(WebDriver driver, String year, String month, String date) {
		
while(true) {
			
			String monthsel = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			String yearsel = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(monthsel.equals(month) && yearsel.equals(year)) {
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //forward

		}
List<WebElement> datesel = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

for(WebElement dt:datesel) 
{
	
if(dt.getText().equals(date)) {
dt.click();
break;
}

}
		
		}

	static void selectpastdate(WebDriver driver, String year, String month,String date) {
		
		while(true) {
					
					String monthsel = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
					
					String yearsel = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
					
					if(monthsel.equals(month) && yearsel.equals(year)) {
						break;
					}
					
					
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //reverse

				}
	List<WebElement> datesel = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:datesel) 
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
		
		
		
		String year = "2020";
		String month = "March";
		String date = "29";
		
		
//selectfuturedate(driver, year, month, date);
	
		selectpastdate(driver, year, month, date);		
	}

}
