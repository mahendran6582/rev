package Sep03;

import java.time.Duration;

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
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));
	
	Select dropd = new Select(dropdown);
	dropd.selectByIndex(6);
	
	Thread.sleep(5000);
	
	dropd.selectByValue("germany");
	
	Thread.sleep(5000);
	
	dropd.selectByVisibleText("India");
	
	
	
	
	

	}

}
