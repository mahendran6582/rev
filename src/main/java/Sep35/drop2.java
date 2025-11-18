package Sep35;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
WebElement dropd = driver.findElement(By.xpath("//select[@id='country']"));

		
		Select drop = new Select(dropd);
		
		drop.selectByIndex(7);
		
		Thread.sleep(3000);
		
		drop.selectByValue("uk");
		
		Thread.sleep(3000);
		
		
		drop.selectByVisibleText("United States");
		
		
		
		
		
		

		
		

	}

}
