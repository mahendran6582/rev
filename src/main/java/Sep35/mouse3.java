package Sep35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse3 {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(0);
	
	Thread.sleep(5000);
	WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
	field1.sendKeys("Apple123");
	
	WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));
	
	WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

	Actions act = new Actions(driver);
	act.doubleClick(button).build().perform();
	
	
	
	
	
	}

}
