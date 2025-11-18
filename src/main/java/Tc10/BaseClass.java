package Tc10;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

public WebDriver driver;
	
	@BeforeClass
	@Parameters({"os", "browser"})
	public void loginpage(String os, String br)
	{
		switch(br)
		{
		case "chrome" : driver = new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		case "firefox" : driver = new FirefoxDriver(); break;
		default: System.out.println("Invalid browser"); return;
		
		
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		
	}
	
	public String RandomStringAlpha() {
		String RandomAlpha = RandomStringUtils.randomAlphabetic(5);
		return RandomAlpha;
	}
	
	
	
	public String RandomStringNumeric() {
		String RandomNumeric = RandomStringUtils.randomNumeric(5);
		return RandomNumeric;
	}
	
	
	public String RandomStringAlphaNumeric() {
		String RandomAlpha = RandomStringUtils.randomAlphabetic(5);
		String RandomNumeric = RandomStringUtils.randomNumeric(5);
		return RandomAlpha+"@"+RandomNumeric;
	}
	
	@AfterClass	

	public void teardown()
	{
driver.quit();
}

}
