package Sep04;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkall {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
List<WebElement> checkbox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type = 'checkbox']"));
	
for(int i=0; i<checkbox.size();i++) {
	checkbox.get(i).click();
	
}

	

	}

}
