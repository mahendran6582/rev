package Aug25;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get4 {

		public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//1.get
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//2.gettitle
System.out.println(driver.getTitle());
		
//3.getcurrenturl
System.out.println(driver.getCurrentUrl());

//4.getpagesource
System.out.println(driver.getPageSource());

	
		}
		

}
