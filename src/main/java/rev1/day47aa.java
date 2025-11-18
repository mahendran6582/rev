package rev1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day47aa {
	
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	void test() {
		day47a lp = new day47a(driver);
		lp.username("Admin");
		lp.userpass("admin123");
		lp.bttn();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	
	}
	
	@AfterClass
	void end() {
		driver.close();
	}
	

}
