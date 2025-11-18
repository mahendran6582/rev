package Sep10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String month = "December";
		String year = "2028";
		String day = "12";
		
		while(true) 
		{
		String monthselect = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String yearselect = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(monthselect.equals(month) && yearselect.equals(year)) {
			break;			
		}
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td/a"));
		
		for(WebElement dt:dates)
		{
			if(dt.getText().equals(day))
					{
			dt.click();
			break;
		}
		
		}
	}
}

