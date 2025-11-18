package Tc02;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_001_TestReg {
	
	WebDriver driver;
	
	@BeforeClass
	public void loginPage()
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
	}
	@Test
	public void HomePage()
	{
		HomePage hp = new HomePage(driver);
		hp.clkmyaccount();
		hp.clkregister();
		
		AccRegister Ar= new AccRegister(driver);
		Ar.setfirstname(randomstring().toUpperCase());
		Ar.setlastname(randomstring().toUpperCase());
		Ar.setemail(randomstring()+"@gmail.com");
		Ar.settele(randomnumber());
		
		String password = randomaplphanumber();
		
		Ar.setpassword(password);
		Ar.setcpassword(password);
		Ar.setagree();
		Ar.setbutton();
		
		String message = Ar.confirmmessage();
		Assert.assertEquals(message, "Your Account Has Been Created!");
	}
		
		public String randomstring() 
		{
		
		String randomalpha = RandomStringUtils.randomAlphabetic(5);
		return randomalpha;
		
		}
		
		public String randomnumber() 
		{
		
		String randnumeric = RandomStringUtils.randomNumeric(5);
		return randnumeric;
		
		}
		
		public String randomaplphanumber() 
		{
		String randomalpha = RandomStringUtils.randomAlphabetic(5);
		String randnumeric = RandomStringUtils.randomNumeric(5);
		return randnumeric +"@"+ randomalpha;
		
		}
		
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
		
	}
	

}
