package Sep10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse3 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	driver.manage().window().maximize();
	
	driver.switchTo().frame("iframeResult");
	
	WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
	WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));
	
	field1.clear();
	field1.sendKeys("Welcome123");
	
	
	WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	
	Actions act = new Actions(driver);
	act.doubleClick(button).build().perform();
	
	
	if(field2.getAttribute("value").equals("Welcome123")) {
		System.out.println("Texted copied");
	}
	else {
		System.out.println("Texted not copied");
	}
	
	
	
	
	
	
	
	

	}

}
