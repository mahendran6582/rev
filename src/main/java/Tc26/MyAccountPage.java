package Tc26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	public WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@id='content']//h2[normalize-space()='My Account']")
	WebElement mess_pass;
	
//	@FindBy(xpath="//div[@id='content']//h2[text()='My Account']")
	//WebElement mess_pass;
	
	//@FindBy(xpath="//h2[normalize-space()='My Account']")
	//WebElement mess_pass;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement link_logout;
	
	
	public void setlogout() {
		link_logout.click();
	}
	
	public boolean setmess() {
		try {
			return(mess_pass.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
		
	}
	

}
