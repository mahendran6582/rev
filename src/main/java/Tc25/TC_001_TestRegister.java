package Tc25;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_001_TestRegister extends BaseClass{
	public WebDriver driver;
	
	@Test(groups = {"Regression", "Master"})
	public void testregister() {
		
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setregister();
		
		RegisterPage rp = new RegisterPage(driver);
		rp.setfirstname(RandomStringAlpha().toUpperCase());
		rp.setlastname(RandomStringAlpha().toUpperCase());
		rp.setemail(RandomStringAlpha()+"@gmail.com");
		rp.settele(RandomStringNumeric());
		
		String password = RandomStringAlphaNumeric();
		
		rp.setpassword(password);
		rp.setcpassword(password);
		rp.setagree();
		rp.setcontinue();
		
		String message = rp.setmessconfirm();
		Assert.assertEquals(message, "Your Account Has Been Created!");
		
	}
	


}
