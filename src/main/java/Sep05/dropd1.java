package Sep05;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropd1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropdown = 	driver.findElement(By.xpath("//select[@class='form-control' and @id = 'country']"));

		
	Select drop = new Select(dropdown);
	drop.selectByIndex(5);
	
	Thread.sleep(5000);
	
	drop.selectByVisibleText("Japan");
	
	Thread.sleep(5000);
	
	drop.selectByValue("brazil");
		
List<WebElement> list = drop.getOptions();
System.out.println(list.size());



	}

}
