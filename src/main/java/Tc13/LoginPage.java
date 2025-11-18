package Tc13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver){
		super(driver);
		
	}
	
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_email;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_pass;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btn_login;
	
	
	
	public void setemail(String email) {
		txt_email.sendKeys(email);
	}
	
	public void setpass(String pass) {
		txt_pass.sendKeys(pass);
	}
	
	public void setclick() {
		btn_login.click();
	}
	
	
	
	
}
