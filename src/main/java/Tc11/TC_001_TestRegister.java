package Tc11;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_001_TestRegister extends BaseClass{
	
	
	
	@Test
	public void TestRegister() {
		
		HomePage Hp = new HomePage (driver);
		Hp.clickmyaccount();
		Hp.clickregister();
		
		RegisterPage Rp = new RegisterPage(driver);
		Rp.setfirstname(RandomStringAlpha().toUpperCase());
		Rp.setlastname(RandomStringAlpha().toUpperCase());
		Rp.setemail(RandomStringAlpha()+"@gmail.com");
		Rp.settele(RandomStringNumeric());
		
		String password = RandomStringAlphaNumeric();
		Rp.setpass(password);
		Rp.setcpass(password);
		Rp.setagree();
		Rp.setcheck();
		
		String confirmmessage =  Rp.getmessage();
		
		Assert.assertEquals(confirmmessage, "Your Account Has Been Created!");
				
	}
	
	

}
