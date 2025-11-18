package Sep18;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	
	WebElement drop = driver.findElement(By.xpath("//select[@class = 'form-control' and @id='country']"));
	
	Select select = new Select(drop);

select.selectByVisibleText("Japan");
Thread.sleep(5000);

select.selectByIndex(9);

Thread.sleep(5000);


select.selectByValue("australia");




	
	
	
	
	
	

	
	
	
	}

}
