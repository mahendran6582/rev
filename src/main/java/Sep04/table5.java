package Sep04;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class table5 {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
String data1 = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr[6]/td[3]")).getText();
System.out.println(data1);
	
}

}
