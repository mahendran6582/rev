package Tc17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	
	public WebDriver driver;
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement msg_confirm;

	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement link_logout;
	
	public void setlogout() {
		link_logout.click();
	}
	
	public boolean confirmmessage() {
		try {
			return(msg_confirm.isDisplayed());
		}
		
		catch(Exception e)
				{
					return(false);
				}
	
	
}
}
