package Sep47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 {
	
	WebDriver driver;
	
	//constructor
	
	LoginPage1(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//locator
	
	By txt_username_loc = By.xpath("//input[@placeholder='Username']");
	By txt_password_loc = By.xpath("//input[@placeholder='Password']");
	By btn_login_loc = By.xpath("//button[normalize-space()='Login']");
	
	//Action methods
	
	public void setusername(String username)
	{
		driver.findElement(txt_username_loc).sendKeys(username);
	}
	public void setpassword (String pwd)
	{
		driver.findElement(txt_password_loc).sendKeys(pwd);	
	}
	public void loginbtn ()
	{
		driver.findElement(btn_login_loc).click();
	}

}
