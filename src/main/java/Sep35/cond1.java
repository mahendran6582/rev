package Sep35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cond1 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		boolean image = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(image);
		

		boolean searchbox = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
		System.out.println(searchbox);
		
		
		WebElement radio = driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
		System.out.println(radio.isSelected());
		
		radio.click();
		
		System.out.println(radio.isSelected());
		
				
		
		

	}

}
