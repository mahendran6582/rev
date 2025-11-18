package Tc12;

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

public class TC001_TestRegster extends BaseClass{
	
	@Test
	public void RegisterPage() {
		
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setregister();
		
		
		RegisterPage rp =new RegisterPage(driver);
		rp.setfirstname(RandomStringAlpha().toUpperCase());
		rp.setlastname(RandomStringAlpha().toUpperCase());
		rp.setemail(RandomStringAlpha()+"@gmail.com");
		rp.settele(RandomStringNumeric());
		
		String password = RandomStringAlphaNumeric();
		
		
		rp.setpass(password);
		rp.setcpass(password);
		rp.setagree();
		rp.setbtn();
		
		String confmess = rp.getconfirmmessage();
		Assert.assertEquals(confmess, "Your Account Has Been Created!");
		
	}
	
	
	
}
