package Tc04;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC001_TestRegister {
	
	WebDriver driver;
	
	@BeforeClass
	public void homepage() {
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	driver.manage().window().maximize();
				
	}
	
	
	@Test
	public void loginpage() {
		
		HomePage hp = new HomePage(driver);
		hp.clickmyaccount();
		hp.clickregister();
	
		ResgistrationPage Rp = new ResgistrationPage(driver);
		Rp.setfirstname(Randomstring().toUpperCase());
		Rp.setlastname(Randomstring().toUpperCase());
		Rp.setemail(Randomstring()+"@gmail.com");
		Rp.setteleph(Randomnumeric());
		
		String password = Randomstringnumeric();
		Rp.setpass(password);
		Rp.setcpass(password);
		Rp.setagree(null);
		Rp.setcontinue(null);
		
		String cfmsg = Rp.getconfirmation();
		
		Assert.assertEquals(cfmsg, "Your Account Has Been Created!");
	}
		
		public String Randomstring() {
		String Randalpha =RandomStringUtils.randomAlphabetic(5);
		return Randalpha;
		}
		
		public String Randomnumeric() {
			String Randnumeric =RandomStringUtils.randomNumeric(5);
			return Randnumeric;
			}
		public String Randomstringnumeric() {
			String Randalpha =RandomStringUtils.randomAlphabetic(5);
			String Randnumeric =RandomStringUtils.randomNumeric(5);
			return Randalpha+"@"+Randnumeric;
			}
		
	
	
	@AfterClass
	public void teardown() {
	driver.quit();
	
	}

}
