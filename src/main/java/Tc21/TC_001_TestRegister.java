package Tc21;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TC_001_TestRegister {
	
	public WebDriver driver;
	
	@BeforeClass
	public void homepage() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
	}
	
	@Test
	public void registerval() {
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setregister();
		
		RegisterPage rp = new RegisterPage(driver);
		rp.setfirstname(RandomStringAlpha().toUpperCase());
		rp.setlastname(RandomStringAlpha().toUpperCase());
		rp.setemail(RandomStringAlpha()+"@gmail.com");
		rp.settele(RandomStringNumeric());
		
		String password = RandomStringAlphaNumeric();
		rp.setpass(password);
		rp.setcpass(password);
		rp.setagree();
		rp.setcontinue();
		
		 String message = rp.setmessconfirm();
		Assert.assertEquals(message, "Your Account Has Been Created!");
		
		
	}
	
	
	
	public String RandomStringAlpha() {
		String RandomAlpha = RandomStringUtils.randomAlphabetic(5);
		return RandomAlpha;
		
	}
	
	public String RandomStringNumeric() {
		String RandomNumeric = RandomStringUtils.randomNumeric(5);
		return RandomNumeric;
	}
	
	
	public String RandomStringAlphaNumeric() {
		String RandomAlpha = RandomStringUtils.randomAlphabetic(5);
		String RandomNumeric = RandomStringUtils.randomNumeric(5);
		return RandomAlpha+"@"+RandomNumeric;
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
		
	}

}
