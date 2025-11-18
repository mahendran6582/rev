package atry;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class table1 {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
int rows = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr")).size();
System.out.println("no.of.rows:" +rows);

	}

}
