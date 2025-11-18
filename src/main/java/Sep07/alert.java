package Sep07;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://the-internet.herokuapp.com/javascript_alerts");
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

driver.switchTo().alert().getText();
driver.switchTo().alert().accept();

	}

}
