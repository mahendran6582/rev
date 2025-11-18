package Tc19;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_001_TestRegister extends BaseClass{
		public WebDriver driver;
		
			
	
	@Test
	public void testregister() {
		
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setregister();
		
		RegisterPage rp = new RegisterPage(driver);
		rp.setfirstname(RandomAlpha().toUpperCase());
		rp.setlastname(RandomAlpha().toUpperCase());
		rp.setemail(RandomAlpha()+"@gmail.com");
		rp.settele(RandomAlpha());
		
		String password = RandomAlphaNumeric();
		rp.setpass(password);
		rp.setcpass(password);
		rp.setagree();
		rp.setcontinue();
		
		String message = rp.conmess();
		Assert.assertEquals(message, "Your Account Has Been Created!");
		
		
		}
	
	
	
	
	
}
