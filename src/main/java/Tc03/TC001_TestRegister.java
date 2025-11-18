package Tc03;

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
	public void homepage()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void login()
	{
		HomePage hp = new HomePage(driver);
		hp.clickmyaccount();
		hp.clickregister();
		
		RegisterPage Rp = new RegisterPage(driver);
		Rp.setfirstname(getRandomString().toUpperCase());
		Rp.setlasttname(getRandomString().toUpperCase());
		Rp.setemail(getRandomString()+"@gmail.com");
		Rp.settele(getRandomnumericString());
		
		String password = getRandomStrinumericString();
		
		
		Rp.setpasswrd(password);
		Rp.setcpasswrd(password);
		Rp.setchkagree();
		Rp.setfbtncontinue();
		
		String msgconfi = Rp.getmsgconfirm();
		
		Assert.assertEquals(msgconfi, "Your Account Has Been Created!");
	}
		
		public String getRandomString() {
			String randomalpha = RandomStringUtils.randomAlphabetic(5);
			return randomalpha;
		}
		
		public String getRandomnumericString() {
			String randomnumeric = RandomStringUtils.randomNumeric(5);
			return randomnumeric;
		}
		
		public String getRandomStrinumericString() {
			String randomalpha = RandomStringUtils.randomAlphabetic(5);
			String randomnumeric = RandomStringUtils.randomNumeric(5);
			return randomalpha + "@"+randomnumeric;
		}
		
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	

}
