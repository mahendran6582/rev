package Sep18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert3 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	driver.manage().window().maximize();
	
	
	
	WebElement prompt = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
	
	prompt.click();
	
	driver.switchTo().alert().sendKeys("Welcome123");
	
	driver.switchTo().alert().accept();
	
		
		
		

	}

}
