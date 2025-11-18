package Aug30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxall {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
List<WebElement> checkbox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type = 'checkbox']"));
	for(WebElement check: checkbox) {
		check.click();
	}

	}

}
