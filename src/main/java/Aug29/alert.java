package Aug29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/javascript_alerts");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
//String title = driver.switchTo().alert().getText();
//System.out.println(title);
//driver.switchTo().alert().accept();
driver.switchTo().alert().sendKeys("welcome1234567890");
driver.switchTo().alert().accept();

Alert myalert = driver.switchTo().alert();
myalert.sendKeys("welcome12345");
myalert.accept();


	}

}
