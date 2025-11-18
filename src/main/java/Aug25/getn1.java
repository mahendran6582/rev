package Aug25;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getn1 {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
System.out.println(driver.getTitle());

System.out.println(driver.getCurrentUrl());

System.out.println(driver.getPageSource());



	}

}
