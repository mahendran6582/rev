package Sep18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalm1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		//is displayed
		boolean image = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(image);
		
		//is enabled
		boolean search = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
		System.out.println(search);
		
		//is selected
		WebElement radio = driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println(radio.isSelected());
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		System.out.println(radio.isSelected());
		Thread.sleep(5000);
		
			
		
		driver.close();
		

	}

}
