package day09;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class dropdown01 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control' and @id = 'country']"));
	Select dropd = new Select(dropdown);
	
		// dropd.selectByContainsVisibleText("Japan");
		
List<WebElement> ddd = dropd.getOptions();
		System.out.println(ddd.size());
		
	//	for(int i=0;i<ddd.size();i++)
	//	{
	//	String ttt = 	ddd.get(i).getText();
	//	System.out.println(ttt);
		
	//	}
		

	}

}
