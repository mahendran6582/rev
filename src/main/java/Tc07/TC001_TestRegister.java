package Tc07;

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

public class TC001_TestRegister extends BaseClass{
	
	WebDriver driver;
	
	@Test
	public void registerPage() {
		
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setregister();
		
		AccRegisterPage Ar = new AccRegisterPage(driver);
		Ar.setfirstname(randomstringalpha().toUpperCase());
		Ar.setlastname(randomstringalpha().toUpperCase());
		Ar.setemail(randomstringalpha()+"@gmail.com");
		Ar.settele(randomstringnumeric());
		
		String password = randomstringalphanumeric();
		
		Ar.setpass(password);
		Ar.setcpass(password);
		Ar.setagree();
		Ar.setcontinue();
		
		String cmessage = Ar.getconfirmmessage();
		Assert.assertEquals(cmessage, "Your Account Has Been Created!");
		
	}
	
	
	
	
}
