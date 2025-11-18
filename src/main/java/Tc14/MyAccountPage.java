package Tc14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	
	public WebDriver driver;
	
	public MyAccountPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement txt_myaccount;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement btn_logout;
	

	public void setlogout() {
		btn_logout.click();
	}
	
	
	boolean isMyAccountPageExists() {
		try {
			return(txt_myaccount.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
		
	}

}
