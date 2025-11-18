package Tc20;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_001_TestRegister {
	
	public WebDriver driver;
	public Properties p;
	@Parameters({"os", "browser"})
	
	@BeforeClass
	
	public void homePage(String br, String browser) throws IOException {
		
		switch(br.toLowerCase())
		{
		case "chrome": driver = new ChromeDriver(); break;
		case "edge": driver = new EdgeDriver(); break;
		case "firefox": driver = new FirefoxDriver(); break;
		default: System.out.println("Invalid browser"); return;
		}
		
		
		FileReader file = new FileReader("./src/main/java/Tc20/config.properties");
		p = new Properties();
		p.load(file);
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL1"));
		driver.manage().window().maximize();
				
	}
	
	@Test
	public void registerval() {
	
	HomePage hp = new HomePage(driver);
	hp.setmyaccount();
	hp.setregister();
	
	RegisterPage rp = new RegisterPage(driver);
	rp.setfirstname(RandomStringAlpha().toUpperCase());
	rp.setlastname(RandomStringAlpha().toUpperCase());
	rp.setemail(RandomStringNumeric());
	rp.settele(RandomStringNumeric());
	String password = RandomStringNumeric();
	
	rp.setpass(password);
	rp.setcpass(password);
	rp.setagree();
	rp.setcontinue();
	}
	

public String RandomStringAlpha() {
	String RandomAlpha = RandomStringUtils.randomAlphanumeric(5);
	return RandomAlpha;
}
	
public String RandomStringNumeric() {
	String RandomNumeric = RandomStringUtils.randomNumeric(5);
	return RandomNumeric;
}	
	
public String RandomStringAlphaNumeric() {
	
	String RandomAlpha = RandomStringUtils.randomAlphanumeric(5);
	String RandomNumeric = RandomStringUtils.randomNumeric(5);
	return RandomAlpha+"@"+RandomNumeric;
}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	

}
