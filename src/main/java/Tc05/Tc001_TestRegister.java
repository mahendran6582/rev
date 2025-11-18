package Tc05;

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

public class Tc001_TestRegister {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	public void login (String br) {
		
		switch (br.toLowerCase()) 
		{
			
			case "chrome" : driver = new ChromeDriver(); break;
			case "edge" : driver = new EdgeDriver(); break;
			case "firefox": driver = new FirefoxDriver();break;
			default: System.out.println("Invalid browser"); return;
			
		}
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		
	}
@Test
public void Homepage () {
	
	HomePage hp = new HomePage(driver);
	hp.clickmylink();
	hp.clickregister();
	
	
	RegisterPage Rp = new RegisterPage(driver);
	Rp.setfirstname(randomString().toUpperCase());
	Rp.setlastname(randomString().toUpperCase());
	Rp.setemail(randomString()+"@gmail.com");
	Rp.settele(randomnumeric());
	
	String password =  randomstringnumeric();
	
	Rp.setpass(password);
	Rp.setcpass(password);
	Rp.setchk();
	Rp.setbtn();
	
	String confmess = Rp.getconfimmessage();
	Assert.assertEquals(confmess, "Your Account Has Been Created!");
	
}
	public String randomString() {
		String Randstr = RandomStringUtils.randomAlphabetic(5);
		return Randstr;
		
	}
	
	public String randomnumeric() {
		String Randnum = RandomStringUtils.randomNumeric(5);
		return Randnum;
		
	}
	
	public String randomstringnumeric() {
		String Randstr = RandomStringUtils.randomAlphabetic(5);
		String Randnum = RandomStringUtils.randomNumeric(5);
		return Randstr+"@"+Randnum;
		
	}
		
	

@AfterClass
public void teardown () {
	
	driver.quit();
	
}

}
