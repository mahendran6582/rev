package Tc09;

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

public class TC001_TestRegister {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	public void homepage(String br) {
		
		switch (br)
		{
		case "chrome" : driver = new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		case "firefox" : driver = new FirefoxDriver(); break;
		default : System.out.println("Invalid browser"); return;		
		}
			
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		
	}
	
	@Test	
	public void registerpage() {
	
		HomePage hp = new HomePage(driver);
		hp.setmyaccount();
		hp.setregister();
	
		RegisterPage Rp = new RegisterPage(driver);
		Rp.setfirstname(RandomStringAlpha().toUpperCase());
		Rp.setlastname(RandomStringAlpha().toUpperCase());
		Rp.setemail(RandomStringAlpha()+"@gmail.com");
		Rp.settele(RandomStringnumeric());
		
		String password = RandomStringAlpahaNumeric();
		
		Rp.setpassword(password);
		Rp.setcpassword(password);
		Rp.setagree();
		Rp.setconfirm();
		
		String message = Rp.getconfirmmessage();
		Assert.assertEquals(message, "Your Account Has Been Created!");
		
	}		
		public String RandomStringAlpha() {
				
			String RandomAlpha = RandomStringUtils.randomAlphabetic(5);
			return RandomAlpha;
			
		}
		
		public String RandomStringnumeric() {
			
			String RandomNumeric = RandomStringUtils.randomNumeric(5);
			return RandomNumeric;
			
		}
		
		
		public String RandomStringAlpahaNumeric() {
			
			String RandomAlpha = RandomStringUtils.randomAlphabetic(5);
			String RandomNumeric = RandomStringUtils.randomNumeric(5);
			return RandomAlpha+"@"+RandomNumeric;
			
		}
	
	@AfterClass
	public void teardown() {
		
		driver.quit();
	
	}

}
