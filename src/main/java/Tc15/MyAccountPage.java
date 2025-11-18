package Tc15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	public WebDriver driver;
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement msg_myaccount;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement lnk_logout;
	
	public void setlogout() {
		lnk_logout.click();
	}
	
	boolean msgconfirm() {
		try {
			return(msg_myaccount.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
		}
		
	}
	