package Sep10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker2 {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://jqueryui.com/datepicker/");
driver.manage().window().maximize();

driver.switchTo().frame(0);
driver.findElement(By.xpath("//input[@id='datepicker']")).click();

String year = "2027";
String month = "August";
String date = "27";

while(true) {
	
	String monthselect = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	String yearselect = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	
	if(monthselect.equals(month) && yearselect.equals(year)) {
		break;
	}

		driver.findElement(By.xpath("//a[@title='Next']")).click();
}
			
	List<WebElement>dateselect = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
	
		
	for(WebElement dt:dateselect)	{
		if(	dt.getText().equals(date))
			{
			dt.click();
			break;
		}
	}
		
}


	}


