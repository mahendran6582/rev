package dy26;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getm1 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	//1.getmethod
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//2.get current url
	System.out.println(driver.getCurrentUrl());
	//3. get title
	System.out.println(driver.getTitle());
	//4. get source
	System.out.println(driver.getPageSource());
	
	//5. gethandle
	String window = driver.getWindowHandle();
	System.out.println(window);
	
	
	
	


	}

}
