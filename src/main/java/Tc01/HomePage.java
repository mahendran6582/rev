package Tc01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	WebDriver driver;
	
	public HomePage (WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement myaccount;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
	WebElement register;
	

	public void myaccountlink()
	{
		myaccount.click();
	}
	
	public void registerlink()
	{
		register.click();
	}
	
	}
	
