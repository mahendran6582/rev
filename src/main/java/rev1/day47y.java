package rev1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day47y {
	
	WebDriver driver;
	
	
	@BeforeClass
	void setup () {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
		
@Test
void testcase(){
	day47x lp = new day47x(driver);
	lp.uname("Admin");
	lp.passw("admin123");
	lp.button();
	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	
	
}

@AfterClass
void testdone() {
	driver.close();
		
	}
	

}
