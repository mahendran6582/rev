package dy26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalmethods {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

boolean title = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
System.out.println(title);


boolean radio = driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
System.out.println(radio);


boolean searchbox = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
System.out.println(searchbox);



driver.quit();

	}

}
