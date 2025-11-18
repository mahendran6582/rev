package Aug29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cond {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement radiobutton = driver.findElement(By.xpath("//input[@id='gender-male']"));
System.out.println(radiobutton.isSelected());
radiobutton.click();
System.out.println(radiobutton.isSelected());







	}

}
