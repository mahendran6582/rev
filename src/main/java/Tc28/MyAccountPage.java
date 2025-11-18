package Tc28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	public WebDriver driver;
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement link_logout;
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement mess_succlogin;
	
	public void setlogout() {
		link_logout.click();
	}
	
	public boolean loginsucc() {
		try {
			return(mess_succlogin.isDisplayed());
		}
				
		catch(Exception e)
		{
			return(false);
		}
	}
	

}
