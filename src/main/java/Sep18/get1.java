package Sep18;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get String
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//get title
		System.out.println(driver.getTitle());
		

		//get current url
		System.out.println(driver.getCurrentUrl());
		

		//get page source
		System.out.println(driver.getPageSource());
		
		//get window handle
		System.out.println(driver.getWindowHandle());
		
		
		
		
		
		
		
		
	}

}
