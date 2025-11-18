package Sep04;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablerow1 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	int row = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr")).size();
	System.out.println(row);

	int column = driver.findElements(By.xpath("//table[@name = 'BookTable']//th")).size();
	System.out.println(column);
	
	String data1 = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr[5]/td[1]")).getText();
	System.out.println(data1);
	
	

	}

}
