package Tc23;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement link_myaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement link_register;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement link_login;
	
	
	public void setmyaccount() {
		link_myaccount.click();
	}
	
	public void setregister() {
		link_register.click();
	}
	
	public void setlogin() {
		link_login.click();
	}
}
