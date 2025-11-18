package Tc16;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_001_TestRegister extends BaseClass{
	

	
	@Test
	
	public void regsterval() {
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setregister();
		
		
		RegisterPage rp = new RegisterPage(driver);
		rp.setfirstname(RandomStringAlpha().toUpperCase());
		rp.setlasttname(RandomStringAlpha().toUpperCase());
		rp.setemail(RandomStringAlpha()+"@gmail.com");
		rp.settele(RandomStringNumeric());
		
		String password = RandomStringAlphaNumeric();
		
		rp.setpass(password);
		rp.setcpass(password);
		rp.setagree();
		rp.setconfirm();
				
	}
	
	
}
	



