package Tc20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	
	public WebDriver driver;
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement succ_mess;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement btn_logout;
	
	public void setlogout() {
		btn_logout.click();
	}

	public boolean confirmmess() {
		try {
			return(succ_mess.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
}
