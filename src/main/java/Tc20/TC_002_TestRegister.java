package Tc20;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_002_TestRegister {
	
	public WebDriver driver;
	public Properties p;
	
	@BeforeClass
	public void homePage() throws IOException {
		
		FileReader file = new FileReader("./src/main/java/Tc20/config.properties");
		p = new Properties();
		p.load(file);
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL1"));
		driver.manage().window().maximize();
				
	}
	
	@Test
	
	public void loginpage() {
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setlogin();
		
		
		LoginPage lp = new LoginPage(driver);
		lp.setemail(p.getProperty("email"));
		lp.setpwd(p.getProperty("pwd"));
		lp.setlogin();
		
		MyAccountPage mp = new MyAccountPage(driver);
		boolean con = mp.confirmmess();
		
		Assert.assertTrue(con);
		
	}
	
	
	@AfterClass	
	public void teardown() {
		driver.quit();
	}
	
	
	

}
