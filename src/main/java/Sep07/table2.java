package Sep07;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table2 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	System.out.println(rows);
	
	int column = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	System.out.println(column);
	
	for(int r=2;r<=rows;r++) {
		for(int c=1;c<=column;c++) {
			String data1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
			System.out.println(data1);
		}
	}
	

	}

}
