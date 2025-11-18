package Tc06;

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
	public void loginPage() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		Thread.sleep(5000);
		driver.manage().window().maximize();
	}
	
	@Test
	public void homePage() {
		
	HomePage hp = new HomePage(driver);
	hp.clickmyaccount();
	hp.clickregister();
	
	RegisterPage Rp = new RegisterPage(driver);
	Rp.setfirstname(RandomalphaString().toUpperCase());
	Rp.setlastname(RandomalphaString().toUpperCase());
	Rp.setemail(RandomalphaString()+"@gmail.com");
	Rp.settele(RandomnumericString());
	
	String password = RandomalphanumericString();
	
	Rp.setpass(password);
	Rp.setcpass(password);
	Rp.setagree();
	Rp.setconfirm();
	
	String message = Rp.getmessage();
	
	Assert.assertEquals(message, "Your Account Has Been Created!");
	
	}
	
	
	public String RandomalphaString() {
		String randomalpha = RandomStringUtils.randomAlphabetic(5);
		return randomalpha;
	}
	
	public String RandomnumericString() {
		String randomnumeric = RandomStringUtils.randomNumeric(5);
		return randomnumeric;
	}
	
	
	public String RandomalphanumericString() {
		String randomalpha = RandomStringUtils.randomAlphabetic(5);
		String randomnumeric = RandomStringUtils.randomNumeric(5);
		return randomalpha+"@"+randomnumeric;
	}
	
	
	
	@AfterClass
	public void teardown() {
		
		driver.quit();
		
	}

}
