package Sep47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	WebDriver driver;
	
	
	//constructor
	
	LoginPage2(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//locator
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login;
	
	
	//Action methods
	
	public void setusername(String username)
	{
		txt_username.sendKeys(username);
	}
	public void setpassword (String pwd)
	{
		txt_password.sendKeys(pwd);	
	}
	public void loginbtn ()
	{
		btn_login.click();
	}

}
