package Sep45;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dataprovide {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void homepage(String br) throws InterruptedException
	{
		switch(br.toLowerCase())
		{
		case "chrome": driver = new ChromeDriver(); break;
		case "edge": driver = new EdgeDriver(); break;
		case "firefox": driver = new FirefoxDriver(); break;
		default: System.out.println("invalid browser"); return;
		}
		
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		
				
	}
		
	@Test(dataProvider="dp")
	void login(String username, String pwd) throws InterruptedException
	{
		 driver.findElement(By.id("input-email")).clear();
		 driver.findElement(By.id("input-password")).clear();
		    
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	Thread.sleep(3000);
	boolean myaccimage = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
	if(myaccimage==true)
	{
		driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
		Thread.sleep(3000);
		Assert.assertTrue(true);
	}
	else {
		Assert.fail();
	}
	
			
	}
	
	
	@AfterClass
	void teardown()
	{
	driver.close();	
	}
	
	
	@DataProvider(name="dp")
	Object[][] logindata()
	{
		Object data[][] = {
				
				{"abc@gmail.com", "test123"},
				{"xyz@gmail.com", "test123"},
				{"123@gmail.com", "test123"},
				{"phoenix_6582@yahoo.co.in", "Yadvik@2024"},
				{"def@gmail.com", "test123"},
		};
		
		return data;
		
	}
	

}
