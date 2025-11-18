package Tc13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	 WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
				
	}
	
	
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement linkmyaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement linkregister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement linklogin;
	
	
	
	public void setmyaccount() {
		linkmyaccount.click();
	}
	
	public void setregister() {
		linkregister.click();
	}
	
	public void setlogin() {
		linklogin.click();
	}
	
	
}
