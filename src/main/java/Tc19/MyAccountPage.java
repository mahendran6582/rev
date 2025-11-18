package Tc19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	public WebDriver driver;
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
		
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement login_succ;
	
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement link_logout;
	
	
	public boolean succmsg() {
		try {
			return(login_succ.isDisplayed());
		}
		
		catch(Exception e)
		{
			return(false);
		}
	}
	
}
