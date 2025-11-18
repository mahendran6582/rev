package Sep04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class table4 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	int column = driver.findElements(By.tagName("th")).size();
	System.out.println(column);
			
			
	
	
		

	}

}
