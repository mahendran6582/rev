package Sep47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	void homepage ()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
				
	}
	
	@Test
	void test ()
	{

		LoginPage2 lp = new LoginPage2(driver);
		lp.setusername("Admin");
		lp.setpassword("admin123");
		lp.loginbtn();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
				
	}
	@AfterClass
	void teardown ()
	{
		driver.close();
		
	}

}
