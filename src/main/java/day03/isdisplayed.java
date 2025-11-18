package day03;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	driver.manage().window().maximize();
	boolean title = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	System.out.println(title);
	
	

	}

}
