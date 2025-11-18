package Tc19;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	 public WebDriver driver;
	 public Properties p;
	 
	
	
	@BeforeClass
	public void HomePage() throws IOException {
		
		FileReader file = new FileReader("./src/main/java/Tc19/config.properties");
		p = new Properties();
		p.load(file);
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL1"));
		driver.manage().window().maximize();
	}
	
	public String RandomAlpha() {
		String RandomStringalpha = RandomStringUtils.randomAlphabetic(5);
		return RandomStringalpha;
	}
	
	public String RandomNumeric() {
		String RandomStringnumeric = RandomStringUtils.randomNumeric(5);
		return RandomStringnumeric;
	}
	
	public String RandomAlphaNumeric() {
		String RandomStringalpha = RandomStringUtils.randomAlphabetic(5);
		String RandomStringnumeric = RandomStringUtils.randomNumeric(5);
		return RandomStringalpha+"@"+RandomStringnumeric;
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	

}
