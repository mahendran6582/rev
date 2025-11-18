package rev1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class demoq2 {
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
	demoq1 lp = new demoq1(driver);
	lp.uname("Admin");
	lp.passd("admin123");
	lp.bttn();
	
	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void done() {
		driver.close();
		
	
	}
		
	}
	
	
	
	


