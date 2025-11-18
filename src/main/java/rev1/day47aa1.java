package rev1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day47aa1 {
	
	WebDriver driver;
	
	
	@BeforeClass
	void set() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	@Test
	void test() {
		day47a1 lp = new day47a1(driver);
		lp.usrname("Admin");
		lp.usrpass("admin123");
		lp.usrbttn();
		
		
	}
	@AfterClass
	void result() {
		driver.close();
	}
	
}
