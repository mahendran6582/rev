package Aug26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cond1 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement radio = driver.findElement(By.xpath("//input[@id='gender-male']"));
	radio.click();
//is selected
	
	boolean radios = driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();	
	System.out.println(radios);

// is enabled
	
	boolean searchs = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
	System.out.println(searchs);
	
	
// is displayed
	boolean image = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	System.out.println(image);
	

	}

}
