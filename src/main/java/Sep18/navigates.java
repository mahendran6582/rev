package Sep18;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigates {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	driver.navigate().to("https://demo.nopcommerce.com/");
	
	Thread.sleep(5000);
	
	driver.navigate().back();
	
	Thread.sleep(5000);
	
	driver.navigate().forward();
	
	Thread.sleep(5000);
	
	driver.navigate().refresh();

	}

}
