package Sep10;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse8 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		WebElement newtab = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(newtab).keyUp(Keys.CONTROL).perform();
		
		List<String> web = new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(web.get(1));
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Mahendran");
		
		driver.switchTo().window(web.get(0));
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Nethra");
		
		
		
		
		
		
		
		
		
		
		
	}

}
