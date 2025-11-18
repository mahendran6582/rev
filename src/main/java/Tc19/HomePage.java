package Tc19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement conn_myaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement conn_register;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement conn_login;
	
	
	
	public void setmyaccount() {
		conn_myaccount.click();
	}
	
	public void setregister() {
		conn_register.click();
	}
	
	public void setlogin() {
		conn_login.click();
	}
	

}
