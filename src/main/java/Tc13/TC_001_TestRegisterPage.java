package Tc13;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_001_TestRegisterPage extends BaseClass{
	
	
	
		
	
	@Test
	public void RegisterPage() throws IOException {
		
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setregister();
		
		AccountRegisterPage ar = new AccountRegisterPage(driver);
		
		ar.setfirstname(RandomStringAlpha().toUpperCase());
		ar.setlastname(RandomStringAlpha().toUpperCase());
		ar.setemail(RandomStringAlpha()+"@gmail.com");
		ar.settele(RandomStringNumeric());
		
		String password = RandomStringAlphaNumeric();
		
		
		ar.setpass(password);
		ar.setcpass(password);
		ar.setagree();
		ar.setcontinue();
				
	}
	
	


}
