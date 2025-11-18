package Tc01;

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

public class dataProvider1 {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void loginpage(String br)
	{
		switch(br.toLowerCase())
		{
		
		case "chrome" : driver = new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		case "firefox" : driver = new FirefoxDriver(); break;
		default: System.out.println("Invalid browser"); return;
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider= "dp")	
	void HomePage(String username, String pwd)
	{
		driver.findElement(By.xpath("//input[@id=\"input-email\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id=\"input-password\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		
		boolean myacc = driver.findElement(By.xpath("//h2[normalize-space()=\"My Account\"]")).isDisplayed();
		if(myacc==true) 
		{
		driver.findElement(By.xpath("//a[@class=\"list-group-item\"][normalize-space()=\"Logout\"]")).click();
		driver.findElement(By.xpath("//a[normalize-space()=\"Continue\"]")).click();
		Assert.assertTrue(true);
		}
		
		else
		{
			Assert.fail();
		}
		
		
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
	
	@DataProvider(name = "dp")
	Object[][] data()
	{
		Object[][] data = {
				
				{"abc@gmail.com", "Yatra_01"},
				{"123@gmail.com", "Yatra_01"},
				{"phoenix_6582@yahoo.co.in", "Yadvik@2024"},
				{"4567@gmail.com", "Yatra_07651"},
				
		};
		
		return data;
		
				
		
	}
	
	}
