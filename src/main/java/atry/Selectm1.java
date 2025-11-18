package atry;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectm1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));
	
	Select dropd = new Select(dropdown);
	dropd.selectByIndex(4);
	Thread.sleep(5000);
	dropd.selectByValue("japan");
	Thread.sleep(5000);
	dropd.selectByVisibleText("United Kingdom");
	
	
	
	
	
	
	

	}

}
