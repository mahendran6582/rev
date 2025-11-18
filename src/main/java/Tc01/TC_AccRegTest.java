package Tc01;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_AccRegTest {
	
	public 	WebDriver driver;
	
	@BeforeClass
	public void homePge() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	
	@Test
	public void lognpage()
	{
		HomePage hp = new HomePage(driver);
		hp.myaccountlink();
		hp.registerlink();
		
		AccountRegPage Ar = new AccountRegPage(driver);
		Ar.setfirstname(randomString().toUpperCase());
		Ar.setlastname(randomString().toUpperCase());
		Ar.setemail(randomString()+"@gmail.com");
		Ar.settelephone(randomNumber());
		
		
		String password=randomAlphaNumeric();
		
				
		Ar.setpass(password);
		Ar.setcpass(password);
		Ar.setagree();
		Ar.setconfirm();
		
String confms = Ar.msgconfirmation();
Assert.assertEquals(confms, "Your Account Has Been Created!");
				
	}
	
	
	public String randomString()
	{
	
	String 	generatedstring = RandomStringUtils.randomAlphabetic(5);
	return generatedstring;
		
	}
	
	
	public String randomNumber()
	{
	
	String generatednumber= RandomStringUtils.randomNumeric(5);
	return generatednumber;
		
	}
		
	public String randomAlphaNumeric()
	{
	
	String generatedstring = RandomStringUtils.randomAlphabetic(5);
	String generatednumber= RandomStringUtils.randomNumeric(5);
	return (generatedstring+"@"+generatednumber);
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
		
	}
	
	

}
