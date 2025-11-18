package Tc07;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass {
	public WebDriver driver;
	public Properties p;
	
	@BeforeClass()
	public void homepage() throws IOException {
		
		FileReader file = new FileReader(".Tc07//config.properties");
		p=new Properties();
		p.load(file);
		
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		
	}
	
		public String randomstringalpha() {
			String randomalpha = RandomStringUtils.randomAlphabetic(5);
			return randomalpha;
		}
		
		public String randomstringnumeric() {
			String randomnumeric = RandomStringUtils.randomNumeric(5);
			return randomnumeric;
		}	
		
		
		public String randomstringalphanumeric() {
			String randomalpha = RandomStringUtils.randomAlphabetic(5);
			String randomnumeric = RandomStringUtils.randomNumeric(5);
			return randomalpha+"@"+randomnumeric;
		}	
		
	
	
	@AfterClass
	public void teardown() {
	
	driver.quit();
}

}
