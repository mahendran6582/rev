package Tc17;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_001_TestRegister extends BaseClass{
	

	
	@Test(groups={"Regression", "Master"})
	public void registerpage() {
		
		HomePage hp = new HomePage(driver);
		hp.clickmyaccount();
		hp.clickregister();
		
		
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
				
	}
	
	

}
